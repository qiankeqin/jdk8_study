package consumer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-07-26 13:07
 **/
public class StringComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });

        Collections.sort(list,( o1, o2)->o2.compareTo(o1));

        System.out.println(list);
    }
}
