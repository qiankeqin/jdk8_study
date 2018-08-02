package method.reference;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-01 20:10
 **/
public class MyMethod1 implements MyInterface1,MyInterface2{
    public static void main(String[] args) {
        MyMethod1 myMethod1 = new MyMethod1();
        myMethod1.myMethod();
    }

    @Override
    public void myMethod() {
        MyInterface2.super.myMethod();
    }
}
