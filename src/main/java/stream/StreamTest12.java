package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-04 15:49
 **/
public class StreamTest12 {
    public static void main(String[] args) {
        //去重操作
        List<String> list = Arrays.asList("hello world","world hello","world hello world","hello hello welcome");
//        List<String[]> collect = list.stream().map(item -> item.split(" ")).distinct().collect(Collectors.toList());
//        collect.stream().map(item->Arrays.asList(item)).forEach(System.out::println);

//        //拆分字符串
//        Stream<String[]> stream = list.stream().map(item -> item.split(" "));
//        //Stream<String[]> 转换成Stream<String>
//        Stream<String> stringStream = stream.flatMap(Arrays::stream);
//        stringStream.distinct().forEach(System.out::println);
        list.stream().map(item->item.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);

    }
}
