package collector;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-23 22:19
 **/
public class MySet2Collector<T> implements Collector<T,Set<T>,Map<T,T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked!");
//        return ()->new HashSet<>();
        return HashSet<T>::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked!");
        return (set,item)->{
            System.out.print("set:"+set);
            System.out.println(" accumulator:"+Thread.currentThread().getName());
            set.add(item);
        };
    }

    //combiner并行流中才会被调用
    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked!");
        return (set1,set2)->{
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher invoked!");
        //因为中间结果类型和最后的返回类型是不一样的，所以finisher会被执行
        return set->{
            Map<T,T> map = new TreeMap<>();
            set.stream().forEach(item->map.put(item,item));
            return map;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked!");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED,Characteristics.CONCURRENT));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world","hello","a","b","c","d","3","f");


        for(int i=0;i<100;i++){

            Set<String> set = new HashSet<>();
            set.addAll(list);
            System.out.println("set:"+set);

            Map<String, String> map = set.parallelStream().collect(new MySet2Collector<>());

            System.out.println("map:"+map);
        }

    }
}
