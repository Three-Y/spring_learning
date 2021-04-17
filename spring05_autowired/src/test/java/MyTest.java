import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yan.ibbie.pojo.Cat;
import yan.ibbie.pojo.Dog;
import yan.ibbie.pojo.Master;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Master master = (Master) context.getBean("master");
        Cat cat = master.getCat();
        Dog dog = master.getDog();
        cat.miao();
        dog.wang();
    }
}
