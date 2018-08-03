package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-02 19:18
 **/
public class StreamTest4 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world");
        //对流进行若干个操作
//        String[] strArr = stream.toArray(length->new String[length]);
//        String[] strArr = stream.toArray(String[]::new);
//        Arrays.asList(strArr).forEach(System.out::println);

//        //将流中的对象转成list
//        List<String> list = stream.collect(Collectors.toList());
//        list.forEach(System.out::println);

        //第一个参数Supplier
        //第二个参数BiConsumer，接收两个参数，不返回;遍历集合中的元素，
        //第三个参数：合并器
        //解释一下这个函数的意思：
        //这个函数collect最终是返回一个List
        //第一个参数定义了一个空的ArrayList
        //theList就是第一个参数返回的ArrayList，第二个Lambda表达式就是说将stream中的每一个元素item都添加到theList中
        //theList1是最后的返回值，theList2就是第二个lambda表达式的返回值theList，最终将theList2全部合并到theList1中，并返回
//        List<String> list = stream.collect(()->new ArrayList(),
//                (theList,item)->theList.add(item),
//                (theList1,theList2)->theList1.addAll(theList2));
//        List<String> list = stream.collect(LinkedList::new,LinkedList::add,LinkedList::addAll);

        StringBuilder collect = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(collect.toString());
    }
}
