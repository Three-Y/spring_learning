import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yan.ibbie.pojo.Hello;
import yan.ibbie.pojo.User;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
        User user1 = (User) context.getBean("user1");
        System.out.println(user1);
        User user2 = (User) context.getBean("user2");
        System.out.println(user2);
        User user3 = (User) context.getBean("user3");
        System.out.println(user3);

        /*观察输出顺序，bean在加载上下文的时候就已经创建
        调用了无参构造器
        调用有参构造器+ibbie_idx
        调用有参构造器+ibbie_name
        调用有参构造器+ibbie_type
        User{name='null'}
        User{name='ibbie_idx'}
        User{name='ibbie_name'}
        User{name='ibbie_type'}*/

        //相同的bean只创建一次
        User user4 = (User) context.getBean("user");
        System.out.println(user==user4);//true

        //只加载了beans.xml，但是也能取到beans2.xml的bean
        Hello h1 = (Hello) context.getBean("h1");
        Hello h2 = (Hello) context.getBean("h2");
        Hello h3 = (Hello) context.getBean("h3");
        Hello h4 = (Hello) context.getBean("h4");
        //不同别名同id的bean是同一个bean
        System.out.println(h1==h2);
        System.out.println(h2==h3);
        System.out.println(h3==h4);


    }
}
