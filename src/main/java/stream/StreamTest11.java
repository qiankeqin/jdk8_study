package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-04 15:23
 **/
public class StreamTest11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello1","world1","hello world");
        //打印长度为5的字符串的长度
//        list.stream().map(item->item.length()).filter(len->len.equals(5)).findFirst().ifPresent(System.out::println);
        list.stream().mapToInt(item ->{
            int len = item.length();
            System.out.println(item);
            return len;
        }).filter(len->len == 5).findFirst().ifPresent(System.out::println);
    }
}
