package method.reference;

public interface MyInterface2 {
    default void myMethod(){
        System.out.println("MyInteface2");
    }
}
