import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yan.ibbie.dao.UserMapper;
import yan.ibbie.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    public static void main(String[] args) throws IOException {
        //原来的mybatis步骤
//        //读取mybatis配置文件
//        String resource = "mybatis-config.xml";
//        InputStream is = Resources.getResourceAsStream(resource);
//        //创建SqlSessionFactory
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//        //打开SqlSession
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        //获取mapper
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//
//
//        List<User> users = mapper.selectUsers();
//        for(User user:users){
//            System.out.println(user);
//        }

        //将mybatis整合到spring中后
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");

        //方法一
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        List<User> users = userMapper.selectUsers();
        for(User u:users){
            System.out.println(u);
        }

        //方法二
        UserMapper userMapper2 = (UserMapper) context.getBean("userMapper2");
        List<User> users2 = userMapper2.selectUsers();
        for(User u2:users2){
            System.out.println(u2);
        }

    }
}
