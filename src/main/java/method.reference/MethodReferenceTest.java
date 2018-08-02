package method.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-01 13:23
 **/
public class MethodReferenceTest {

    public String getString(Supplier<String> supplier){
        return supplier.get() + "test";
    }

    public String getString2(String str,Function<String,String> function){
        return function.apply(str);
    }

    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",90);
        Student s2 = new Student("lsi",50);
        Student s3 = new Student("wwu",100);
        Student s4 = new Student("zliu",70);

        List<Student> list = Arrays.asList(s1,s2,s3,s4);

//        Collections.sort();//传统的方法
//        list.sort((stu1,stu2)->stu1.getScore()-stu2.getScore());//jdk8提供了排序的方法
//        list.sort(Student::compareStudentByScore);
//        list.forEach(System.out::println);
//        list.sort(Student::compareStudentByName);
//        list.forEach(System.out::println);

        //(2)
//        StudentComparor stuCompare = new StudentComparor();
//        list.sort(stuCompare::compareByScore);
//        list.forEach(System.out::println);

        //「3」
//        list.sort(Student::compareByScore);
//        list.forEach(System.out::println);

//        List<String> lists = Arrays.asList("hello","zhejiang","wenzhou");
//
//        Collections.sort(lists,(item1,item2)->item1.compareToIgnoreCase(item2));
//
//        Collections.sort(lists,String::compareToIgnoreCase);

        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        System.out.println(methodReferenceTest.getString(String::new));;

        System.out.println(methodReferenceTest.getString2("hello",String::new));;
    }
}
