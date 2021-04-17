import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yan.ibbie.config.AppConfig;
import yan.ibbie.config.AppConfig2;
import yan.ibbie.pojo.User;

public class MyTest {
    public static void main(String[] args) {
        //xml配置
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //java配置
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        String[] beans = context.getBeanDefinitionNames();
        for(int i=0;i<beans.length;i++){
            System.out.println(beans[i]);
        }

//        User user1 = (User) context.getBean("user");
//        User user2 = (User) context.getBean("user");
//        System.out.println(user1.hashCode());
//        System.out.println(user2.hashCode());
//        System.out.println(user1==user2);
    }
}
