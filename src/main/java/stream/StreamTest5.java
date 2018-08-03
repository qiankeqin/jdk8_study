package stream;

import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-03 13:09
 **/
public class StreamTest5 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","1234","world");
        //to List
//        ArrayList<String> arr = stream.collect(Collectors.toCollection(ArrayList::new));
//        arr.forEach(System.out::println);
        //to Set
//        Set<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(set.getClass());
//
//        set.forEach(System.out::println);

        //join String
//        String joinStr = stream.collect(Collectors.joining());
//        System.out.println(joinStr);


    }
}
