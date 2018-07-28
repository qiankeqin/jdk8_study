package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-07-28 15:16
 **/
public class PredicateTest2 {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9);
        PredicateTest2 test2 = new PredicateTest2();
//        //找到奇数
//        test2.find(ints,item->item % 2==1);
//        //找到偶数
//        test2.find(ints,item->item %2 ==0);
//        //找到大于5的数
//        test2.find(ints,item->item>5);
//        //找到小于3的数
//        test2.find(ints,item->item<3);
//        //打印所有的
//        test2.find(ints,x->true);
//        //不打印任何
//        test2.find(ints,x->false);
//        //满足大于5并且是偶数的数字
//        test2.conditionAnd(ints,item->item>5,item->item%2==0);
//        //满足大于5或是偶数的数字
//        test2.conditionOr(ints,item->item>5,item->item%2==0);
//        //不是偶数的数字
//        test2.conditionNegate(ints,item->item%2==0);
        //这里的test就是isEquals方法中的targetRef参数
        Predicate<String> pre = test2.isEqual("test");
        //这里的test是输入的参数object
        Boolean isE = pre.test("test");
        System.out.println(isE);

        Predicate<String> pre2 = test2.isEqual(null);
        System.out.println(pre2.test("1"));

    }

    //函数式编程抽象方法
    private void find(List<Integer> ints, Predicate<Integer> func){
        System.out.println("-----------------------------------");
        //List<Integer> collect = ints.stream().filter(func).collect(Collectors.toList());
        for(Integer i : ints){
            if(func.test(i)){
                System.out.println(i);
            }
        }
    }

    //满足func1和func2的条件
    private void conditionAnd(List<Integer> list,Predicate<Integer> func1,Predicate<Integer> func2){
        for(Integer i : list){
            if(func1.and(func2).test(i)){
                System.out.println(i);
            }
        }
    }
    //满足func1或func2的条件
    private void conditionOr(List<Integer> list,Predicate<Integer> func1,Predicate<Integer> func2){
        for(Integer i : list){
            if(func1.or(func2).test(i)){
                System.out.println(i);
            }
        }
    }

    //不满足func1条件
    private void conditionNegate(List<Integer> list,Predicate<Integer> func1){
        for(Integer i : list){
            if(func1.negate().test(i)){
                System.out.println(i);
            }
        }
    }

    //返回isEquals
    private Predicate<String> isEqual(Object object){
        return Predicate.isEqual(object);
    }

}
