package stream;

import java.util.UUID;
import java.util.stream.Stream;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-03 13:48
 **/
public class StreamTest7 {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
//        stream.findFirst().ifPresent(System.out::println);

        //不停的加2,知道达到限制
        Stream.iterate(1,item->item+2).limit(6).forEach(System.out::println);
        Stream.iterate(1,item->item+2).limit(6);
    }
}
