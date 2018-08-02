package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-02 13:18
 **/
public class StreamTest1 {
    public static void main(String[] args) {
        Stream stream1 = Stream.of("hello","world","2018");

        String[] arr = new String[]{"hll","hi"};
        Stream stream2 = Stream.of(arr);
        Stream stream3 = Arrays.stream(arr);

        List<String> list = new ArrayList<>();
        Stream stream4 = list.stream();

    }
}
