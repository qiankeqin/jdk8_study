package stream;

import java.util.stream.IntStream;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-03 20:36
 **/
public class StreamTest9 {
    public static void main(String[] args) {
        IntStream.iterate(0,item->(item+1)%2).limit(6).distinct().forEach(System.out::println);
    }
}
