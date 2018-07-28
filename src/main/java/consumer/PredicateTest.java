package consumer;

import java.util.function.Predicate;

/**
 * @program: gradle-test
 * @description: predicate
 * @author: qiankeqin
 * @create: 2018-07-28 14:30
 **/
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> lengt5 = p -> p.length()>5;
        System.out.println(lengt5.test("hello"));;
    }
}
