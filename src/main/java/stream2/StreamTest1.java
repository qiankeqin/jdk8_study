package stream2;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-05 12:36
 **/
public class StreamTest1 {
    public static void main(String[] args) {
        Student stu1 = new Student("zhangsan",73);
        Student stu2 = new Student("lisi",85);
        Student stu3 = new Student("wangwu",100);
        Student stu4 = new Student("zhaoliu",90);
        Student stu5 = new Student("zhaoliu",90);

        List<Student> list = Arrays.asList(stu1,stu2,stu3,stu4,stu5);

//        List<Student> student1 = list.stream().collect(Collectors.toList());
//        //student1.forEach(System.out::println);
//
//        Long collect = student1.stream().collect(Collectors.counting());
//        System.out.println(collect);
//      最小值
        list.stream().collect(Collectors.minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        //最大值
        list.stream().collect(Collectors.maxBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);

        //平均值
        System.out.println(list.stream().collect(Collectors.averagingDouble(Student::getScore)));

        //总和
        System.out.println(list.stream().collect(Collectors.summingInt(Student::getScore)));
        //求出分数的汇总信息
        System.out.println(list.stream().collect(Collectors.summarizingInt(Student::getScore)));

        System.out.println(list.stream().map(Student::getName).collect(joining()));
        System.out.println(list.stream().map(Student::getName).collect(joining(",")));
        System.out.println(list.stream().map(Student::getName).collect(joining("/")));
        //前缀和后缀
        System.out.println(list.stream().map(Student::getName).collect(joining("&","pre","sub")));

        Map<Integer, Map<String, List<Student>>> collect =
                list.stream().collect(groupingBy(Student::getScore, groupingBy(Student::getName)));
        System.out.println(collect);

        Map<Boolean, Map<Boolean, List<Student>>> collect1 =
                list.stream().collect(partitioningBy(item -> item.getScore() > 80, partitioningBy(item -> item.getScore() > 90)));
        System.out.println(collect1);

        Map<Boolean, Long> collect2 = list.stream().collect(partitioningBy(item -> item.getScore() > 80, counting()));
        System.out.println(collect2);

        Map<String, Student> collect3 =
                list.stream().collect(groupingBy(Student::getName, collectingAndThen(minBy(Comparator.comparingInt(Student::getScore)), Optional::get)));
        System.out.println(collect3);

    }
}
