package collector;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-23 13:22
 **/
public class MySetCollector<T> implements Collector<T,Set<T>,Set<T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked!");
        return HashSet<T>::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked!");
//        return (set,item)->set.add(item);//等价于下面的语句
        return Set<T>::add;
        //注意，这里不能返回HashSet<T>::add
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked!");
        return (set1,set2)->{
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Set<T>> finisher() {
        System.out.println("finisher invoked!");
        return Function.identity();
        //return t->t;//等价
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked!");
        return Collections.unmodifiableSet(
                EnumSet.of(Collector.Characteristics.IDENTITY_FINISH,Collector.Characteristics.UNORDERED));
    }


    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","wordl");
        Set<String> set = list.stream().collect(new MySetCollector<String>());
        System.out.println(set);

    }
}
