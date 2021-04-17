import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import yan.ibbie.dao.UserMapper;
import yan.ibbie.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    public static void main(String[] args) throws IOException {
        //读取mybatis配置文件
        String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //打开SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        List<User> users = mapper.selectUsers();
        for(User user:users){
            System.out.println(user);
        }
    }
}
