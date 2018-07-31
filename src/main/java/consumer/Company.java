package consumer;

import java.util.List;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-07-31 13:36
 **/
public class Company {
    private String name;
    private List<Employee> employeeList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
