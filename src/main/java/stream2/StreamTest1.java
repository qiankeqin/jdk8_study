package stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-05 12:36
 **/
public class StreamTest1 {
    public static void main(String[] args) {
        Student stu1 = new Student("zhangsan",83);
        Student stu2 = new Student("lisi",85);
        Student stu3 = new Student("wangwu",100);
        Student stu4 = new Student("zhaoliu",90);

        List<Student> list = Arrays.asList(stu1,stu2,stu3,stu4);

        List<Student> student1 = list.stream().collect(Collectors.toList());
        //student1.forEach(System.out::println);

        Long collect = student1.stream().collect(Collectors.counting());
        System.out.println(collect);


    }
}
