package consumer;

import java.util.Arrays;
import java.util.List;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-01 12:57
 **/
public class MethodReferenceTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","wolrd","world");
        list.forEach(item-> System.out.println(item));//lambda
        list.forEach(System.out::println);//方法引用
    }
}
