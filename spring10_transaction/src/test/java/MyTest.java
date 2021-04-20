import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yan.ibbie.mapper.UserMapper;
import yan.ibbie.pojo.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");

        Map<String, String> map = new HashMap<String, String>();
        map.put("id","5");//update会成功
        map.put("email","666666@ibbie.com");
        //add会失败
        User user = new User("2", "haha", 30, "hahaha@ibbie.com");
        //开启事务后，由于add的失败会让update的操作也不生效，保证updateEmailAndAdd方法的原子性和一致性
        List<User> users = userMapper.updateEmailAndAdd(map,user);

        for(User u:users){
            System.out.println(u);
        }
    }
}
