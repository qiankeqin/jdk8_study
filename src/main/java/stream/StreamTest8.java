package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-03 19:58
 **/
public class StreamTest8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","list","world");
//        list.stream().map(item->item.substring(0,1).toUpperCase()+item.substring(1)).forEach(System.out::println);
        list.stream().map(item->{
            String result = item.substring(0,1).toUpperCase()+item.substring(1);
            System.out.println(result);
            return result;
        }).forEach(System.out::println);
    }
}
