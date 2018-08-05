package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-05 10:25
 **/
public class StreamTest14 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",100,20);
        Student student2 = new Student("lisi",90,20);
        Student student3 = new Student("wangwu",90,30);
        Student student4 = new Student("zhangsan",80,40);

        List<Student> stus = Arrays.asList(student1,student2,student3,student4);

        //传统，可以使用HashMap<String,List<Student>>

        //stream方式
//        Map<String, List<Student>> map = stus.stream().collect(Collectors.groupingBy(Student::getName));
//        Map<Integer, List<Student>> map = stus.stream().collect(Collectors.groupingBy(Student::getScore));
//        Map<String, Long> map = stus.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

//        Map<String, Double> map = stus.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));
        Map<Boolean, List<Student>> map = stus.stream().collect(Collectors.partitioningBy(item -> item.getScore() >= 90, Collectors.toList()));
        System.out.println(map);

    }
}
