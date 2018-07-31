package consumer;

import java.util.function.Supplier;

/**
 * @program: gradle-test
 * @description: Supplier
 * @author: qiankeqin
 * @create: 2018-07-28 16:48
 **/
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Student> supplier = ()->new Student();
        supplier.get().getName();

        System.out.println("----------------");
        Supplier<Student> supplier1 = Student::new;
        supplier1.get().getName();
    }
}
