package comparatordemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-10 13:02
 **/
public class MyComparatorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("zhangsan","hello","world","lisi");
        //按照字母升序排序
//        Collections.sort(list);
//        System.out.println(list);
//
//        //按照字符串长度排序
//        Collections.sort(list,(item1,item2)->item1.length()- item2.length());
//        System.out.println(list);
//
//        //方法引用的方式
//        Collections.sort(list, Comparator.comparingInt(String::length));
//        System.out.println(list);
//
//        //反序
//        Collections.sort(list, Comparator.comparingInt(String::length).reversed());
//        //反序
//        Collections.sort(list,Comparator.reverseOrder());
//        System.out.println(list);
//
//        Collections.sort(list,Comparator.comparingInt((String item)->item.length()).reversed());

//        Collections.sort(list,Comparator.comparingInt(item->item.length()).reversed());

//        list.sort(Comparator.comparingInt(String::length).reversed());

        //两层比较
        //首先按照字符串长度升序，然后按照字符串的ascii顺序排序（忽略大小写）
        //使用thenComparator
//        list.sort(Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
//        System.out.println(list);

//        Collections.sort(list,Comparator.comparingInt(String::length)
//                .thenComparing((item1,item2)->item1.toLowerCase().compareTo(item2.toLowerCase())));

        //方法引用的方式实现
        Collections.sort(list,Comparator.comparing(String::length)
                .thenComparing(Comparator.comparing(String::toLowerCase)));

        //thenComparing倒序排序
        Collections.sort(list,Comparator.comparingInt(String::length)
        .thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));

        //双重倒序
        Collections.sort(list,Comparator.comparingInt(String::length).reversed()
                .thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));

        //多级排序
        Collections.sort(list,Comparator.comparingInt(String::length).reversed()
                .thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder()))
                .thenComparing(Comparator.reverseOrder()));
        System.out.println(list);
    }
}
