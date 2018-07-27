package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-07-12 13:36
 **/
public class Test1 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        integers.forEach((Integer i)->{
            System.out.println(i);
        });

        integers.forEach(System.out::println);
    }
}
