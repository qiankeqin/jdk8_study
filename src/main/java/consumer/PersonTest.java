package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-07-27 12:53
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan",30);
        Person person2 = new Person("lisi",40);
        Person person3 = new Person("wangwu",35);
        Person person4 = new Person("wangwu",31);
        List<Person> persons = Arrays.asList(person1,person2,person3,person4);
        PersonTest test = new PersonTest();
//        List<Person> personList = test.getPersonsByUserName("wangwu", persons);
        List<Person> personList = test.getPersonByAge(30,persons);
        personList.forEach(System.out::println);
    }

    public List<Person> getPersonsByUserName(String username,List<Person> persons){
        //将persons转化成流，并对流中对每个对象进行过滤，判断对象对username满足=username，最后将过滤对结果转换成List对象
        return persons.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(Integer age,List<Person> persons){
        //接受两个参数，返回一个参数
        BiFunction<Integer,List<Person>,List<Person>> func = (ageOfPerson,personList)->{
            return personList.stream().filter(person->person.getAge()>ageOfPerson).collect(Collectors.toList());
        };

        return func.apply(age,persons);
    }
}
