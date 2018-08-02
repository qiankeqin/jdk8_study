package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-02 13:26
 **/
public class StreamTest3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        Integer total = 0;
//        for (Integer item : list){
//            item *= 2;
//            total += item;
//        }
//        System.out.println(total);

        Integer result = list.stream().map(item -> item * 2).reduce(0, Integer::sum);
        System.out.println(result);
    }
}
