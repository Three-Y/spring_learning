import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yan.ibbie.mapper.UserMapper;
import yan.ibbie.pojo.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    private ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
    private UserMapper userMapper = (UserMapper) context.getBean("userMapper");

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        User user = myTest.userMapper.selectUserById("2");
        System.out.println(user);
    }

    @Test
    public void testSelectUserById(){
        User user = userMapper.selectUserById("2");
        System.out.println(user);
    }

    @Test
    public void testSelectUserByIdAndName(){
        List<User> users = userMapper.selectUserByIdAndName("2", "李四");
        for(User user:users){
            System.out.println(user);
        }
    }

    @Test
    public void testSelectUserByEmail(){
        User user = new User();
        user.setName("ibbie");
        user.setEmail("222222@ibbie.com");
        System.out.println(userMapper.selectUserByEmail(user));
    }

    @Test
    public void testSelectUserByNameAge(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("mapKeyName", "ibbie");
        map.put("mapKeyAge", "18");
        //map.put("table","user");
        System.out.println(userMapper.selectUserByNameAge(map));
    }

    @Test
    public void testSelectUserByMyId(){
        System.out.println(userMapper.selectUserByMyId("5"));
        System.out.println(userMapper.selectUserByMyId222("5"));
    }

    @Test
    public void testSelectUserLikeName(){
        System.out.println(userMapper.selectUserLikeName("%bb%"));
        System.out.println(userMapper.selectUserLikeName222("李"));
    }

    @Test
    public void testSelectUserByConditions(){
        User user = new User();
//        user.setName("ibbie");
        user.setAge(18);
        List<User> users = userMapper.selectUserByConditions222(user);
        for(User u:users){
            System.out.println(u);
        }
    }

    @Test
    public void testSelectUserInId(){
        List<String> list = new ArrayList<String>();
        list.add("2");
        list.add("3");
        List<User> users = userMapper.selectUserInId(list);
        for(User u:users){
            System.out.println(u);
        }
    }

    @Test
    public void testSelectUserInUserId(){
        List<User> users = new ArrayList<User>();
        User u1 = new User();
        u1.setId("2");
        User u2 = new User();
        u2.setId("5");
        users.add(u1);
        users.add(u2);

        List<User> users1 = userMapper.selectUserInUserId(users);
        for(User u:users1){
            System.out.println(u);
        }
    }

    @Test
    public void testSelectAllUser(){
        List<User> users = userMapper.selectAllUser();
        for(User u:users){
            System.out.println(u);
        }
    }

}
