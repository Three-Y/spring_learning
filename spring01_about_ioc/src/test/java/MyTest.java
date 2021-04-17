import yan.ibbie.dao.UserDaoMysqlImpl;
import yan.ibbie.service.UserService;
import yan.ibbie.service.UserServiceImpl;

//用户调用
public class MyTest {
    public static void main(String[] args) {

        //用户实际调用的是业务层，不直接接触dao层
//        UserService userService = new UserServiceImpl();
//        userService.getUser();

        //改进后，创建对象的主动权从程序员交给了用户，用户自己决定要使用的功能
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserDaoMysqlImpl());
        userService.getUser();

    }
}
