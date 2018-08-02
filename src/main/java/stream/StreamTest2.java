package stream;

import java.util.stream.IntStream;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-02 13:23
 **/
public class StreamTest2 {
    public static void main(String[] args) {
        IntStream.of(5,6,7).forEach(System.out::println);
        //包含前面，不包含后面
        IntStream.range(5,9).forEach(System.out::println);
        //包含前面，包含后面
        IntStream.rangeClosed(5,9).forEach(System.out::println);
    }
}
