package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-03 13:25
 **/
public class StreamTest6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","wolRd","kill");
        //toUpper
//        List<String> uList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
//        list.forEach(System.out::println);
//        uList.forEach(System.out::println);

        //求每个元素的平方
//        List<Integer> iList = Arrays.asList(1,2,3,4,5);
//        List<Integer> iList2 = iList.stream().map(item -> item * item).collect(Collectors.toList());
//        iList2.forEach(System.out::println);


        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1),Arrays.asList(2,3),Arrays.asList(4,5,6));
        List<Integer> flatList = stream.flatMap(theStream -> theStream.stream()).map(item -> item * item).collect(Collectors.toList());
        flatList.forEach(System.out::println);


    }
}
