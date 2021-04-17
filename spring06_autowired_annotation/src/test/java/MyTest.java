import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yan.ibbie.pojo.Master;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Master master = (Master) context.getBean("master");
        master.getDog().wang();
        master.getCat().miao();
    }
}
