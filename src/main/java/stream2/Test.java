package stream2;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-08 23:21
 **/
public class Test {
    public static void main(String[] args) {
        Student stu = new Student("hello",11);
        while(true){
            System.out.println(stu.getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
