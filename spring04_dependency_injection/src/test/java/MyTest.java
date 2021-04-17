import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yan.ibbie.pojo.Student;
import yan.ibbie.pojo.User;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        /*
        * Student{
        *   name='ibbie',
        *   address=Address{str='佛山'},
        *   books=[java编程思想, spring实战, 大话设计模式, spring源码深度解析],
        *   hobbies=[敲代码, 不停敲代码], card={学号=666, 姓名=ibbie},
        *   games=[剧本杀, 狼人杀],
        *   wife='null',
        *   info={性别=女, 身高=200, 体重=0.0, 年龄=18}}
        * */


        //bean scopes
        User user = (User) context.getBean("user");
        User user1 = (User) context.getBean("user");

        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
        System.out.println(user1==user);
    }
}
