package consumer;

import java.util.Optional;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-07-31 13:22
 **/
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();//Optional.of("hello");
//        if(optional.isPresent()){
//            System.out.println(optional.get());
//        }
        optional.ifPresent(item -> System.out.println(item));
        System.out.println("---------");
        System.out.println(optional.orElse("world"));
        System.out.println(optional.orElseGet(()->"world1"));
    }
}
