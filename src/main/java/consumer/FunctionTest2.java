package consumer;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @program: gradle-test
 * @description: function compose ,andThen方法
 * @author: qiankeqin
 * @create: 2018-07-27 19:37
 **/
public class FunctionTest2 {
    public static void main(String[] args) {
        FunctionTest2 test2 = new FunctionTest2();
//        System.out.println(test2.compose(5,item->3*item,item->item*item));//fun2->fun1:75
//        System.out.println(test2.andThen(5,item->3*item,item->item*item));//fun1->fun2:225
//        System.out.println(test2.compute(1,2,(a,b)->a*b));
        System.out.println(test2.compute_andThen(2,3,(v1,v2)->v1+v2,v->v*v));//2+3->5*5->25
    }


    public int compose(int a, Function<Integer,Integer> func,Function<Integer,Integer> func2){
        return func.compose(func2).andThen(func).apply(a);
    }

    public int andThen(int a,Function<Integer,Integer> func,Function<Integer,Integer> func2){
        return func.andThen(func2).apply(a);
    }

    public int compute(int a, int b, BiFunction<Integer,Integer,Integer> func){
        return func.apply(a,b);
    }

    public int compute_andThen(int a,int b,BiFunction<Integer,Integer,Integer> bifunc,Function<Integer,Integer> after){
        return bifunc.andThen(after).apply(a,b);
    }
}
