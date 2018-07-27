package consumer;

import java.util.function.Function;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-07-26 13:25
 **/
public class FucntionTest {
    public static void main(String[] args) {
        FucntionTest funTest = new FucntionTest();
        //对输入参数进行乘以2操作
        System.out.println(funTest.compute(1,item->{return 2*item;}));
        //System.out.println(funTest.compute(1,item->2*item));

        System.out.println(funTest.convert(5,value->{return 5+",hello";}));

        Function<Integer,String> function = value -> {return "hello "+value;};
        System.out.println(funTest.convert(6,function));
    }

    //对数据参数进行function操作
    public int compute(int a , Function<Integer,Integer> function){
        Integer result = function.apply(a);
        return result;
    }

    //对输入参数进行转换
    public String convert(int a, Function<Integer,String> function){
        return function.apply(a);
    }
}
