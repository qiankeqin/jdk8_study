package stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-03 13:48
 **/
public class StreamTest7 {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
//        stream.findFirst().ifPresent(System.out::println);

        //不停的加2,知道达到限制
        //Stream.iterate(1,item->item+2).limit(6).forEach(System.out::println);
//
        List<Integer> list = Stream.iterate(1,item->item+2).limit(6).collect(Collectors.toList());
//
//        System.out.println(list.stream().filter(item->item>2).mapToInt(item->item*2).skip(2).limit(2).sum());

//        IntSummaryStatistics intSummaryStatistics = list.stream().filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();
//        System.out.println(intSummaryStatistics.getMin());
//        System.out.println(intSummaryStatistics.getMax());
//        System.out.println(intSummaryStatistics.getAverage());
//        System.out.println(intSummaryStatistics.getCount());

//        Stream<Integer> stream = list.stream();
//        System.out.println(stream);
//        System.out.println(stream.filter(item->item>2));
//        System.out.println(stream.count());

        Stream<Integer> stream = list.stream();
        System.out.println(stream);
        Stream<Integer> stream2 = stream.filter(item -> item > 2);
        System.out.println(stream2);
        long count = stream2.count();
        System.out.println(count);
    }
}
