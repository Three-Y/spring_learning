import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yan.ibbie.pojo.Hello;
import yan.ibbie.service.UserService;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring上下文对象(容器)
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //想用什么对象旧从上下文对象中取(返回的是object)
        Hello hello = (Hello) applicationContext.getBean("hello");
        System.out.println(hello);

        //改进spring01_about_ioc
        UserService userServiceImpl = (UserService) applicationContext.getBean("userServiceImpl");
        userServiceImpl.getUser();

        /*
        * 控制：控制对象创建的是Spring
        * 反转：程序不创建对象，变成了被动接受对象
        * 依赖注入：使用set方法进行属性的注入
        *
        * 我们不用再修改程序，需要什么就从xml中配置即可
        * IOC:对象由spring来创建、管理、装配
        * */
    }
}
