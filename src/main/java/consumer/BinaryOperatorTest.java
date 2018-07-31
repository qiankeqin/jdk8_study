package consumer;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-07-28 17:25
 **/
public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperatorTest test = new BinaryOperatorTest();
//        System.out.println(test.compute(1,2,(v1,v2)->v1+v2));;
//

        System.out.println(test.compareInt(1, 2, (o1, o2) -> o2-o1));
    }

    public Integer compute(Integer v1,Integer v2,BinaryOperator<Integer> func){
        return func.apply(v1,v2);
    }

    public Integer compareInt(Integer v1,Integer v2,Comparator<Integer> comp){
        return BinaryOperator.minBy(comp).apply(v1,v2);
    }

}
