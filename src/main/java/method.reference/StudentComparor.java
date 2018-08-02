package method.reference;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-01 19:19
 **/
public class StudentComparor {
    public int compareByUserName(Student stu1,Student stu2){
        return stu1.getName().compareToIgnoreCase(stu2.getName());
    }

    public int compareByScore(Student stu1,Student stu2){
        return stu1.getScore() - stu2.getScore();
    }
}
