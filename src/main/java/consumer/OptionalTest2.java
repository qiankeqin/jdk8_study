package consumer;

import java.util.*;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-07-31 13:37
 **/
public class OptionalTest2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(){{
            setName("hello");
        }};
        Employee e2 = new Employee(){{
            setName("hello1");
        }};
        Company c = new Company(){{
            setName("world");
        }};

        List<Employee> lists = Arrays.asList(e1,e2);
        c.setEmployeeList(lists);

        List<Employee> getList = c.getEmployeeList();

        Optional<Company> optional = Optional.ofNullable(c);
        //使用map方法,经典的，标准的函数式使用方法
        System.out.println(optional.map(company -> company.getEmployeeList()).orElse(Collections.emptyList()));
    }
}
