package consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-07-13 12:57
 **/
public class Test3 {
    public static void main(String[] args) {
/*        MyInterface1 myInterface1 = ()->{};
        System.out.println(myInterface1.getClass().getInterfaces()[0]);
        MyInterface2 myInterface2 = ()->{};
        System.out.println(myInterface2.getClass().getInterfaces()[0]);

        //上面两种情况的的都使用都()->{};进行赋值，()->{}具体的类型需要通过上下文才能确定
        //下面这种写法就会报错，因为编译器不知道你使用哪种接口
        //()->{};

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        }).start();

        new Thread(()->{
            System.out.println("hello world lambda");
        }).start();*/


        List<String> list = Arrays.asList("hello","world","qin");
//        list.forEach(item-> System.out.println(item.toUpperCase()));
//
//        List<String> changeList = new ArrayList<>();//diamond语法
//        list.forEach(item->changeList.add(item.toUpperCase()));
//        changeList.forEach(item-> System.out.println(item));


//        list.stream().map(item->item.toUpperCase()).forEach(item-> System.out.println(item));
//
//        list.stream().map(String::toUpperCase).forEach(System.out::println);

        //输入类型：字符串，输出类型：字符串
        Function<String,String> function = String::toUpperCase;

    }
}


@FunctionalInterface
interface MyInterface1{
    void myMethod1();
}


@FunctionalInterface
interface MyInterface2{
    void myMethod2();
}