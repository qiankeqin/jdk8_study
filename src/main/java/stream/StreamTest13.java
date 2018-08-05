package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-05 09:52
 **/
public class StreamTest13 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi","Hello","你好");
        List<String> list2 = Arrays.asList("zhangsan","lisi","zhaowu","wangliu");
        //组合词，
        list1.stream().flatMap(item -> list2.stream().map(item2->item+" "+item2)).collect(Collectors.toList()).forEach(System.out::println);
    }
}
