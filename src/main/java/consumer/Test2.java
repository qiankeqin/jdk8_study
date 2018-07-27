package consumer;

import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-07-12 13:22
 **/
public class Test2 {
    public void test(MyInterface myInterface){
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.test(()->{
            System.out.println("test");
        });
        System.out.println("-------------");
        MyInterface myInterface = ()->{
            System.out.println("test001");
        };
        //当前类型
        System.out.println(myInterface.getClass());
        //父类
        System.out.println(myInterface.getClass().getSuperclass());
        Type[] genericInterfaces = myInterface.getClass().getGenericInterfaces();
    }
}
