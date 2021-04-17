package yan.ibbie.service;

import yan.ibbie.dao.UserDao;

/*
* IOC是一种编程思想，由主动地编程变成被动地接收
* */
public class UserServiceImpl implements UserService {
    //原来的代码
//    private UserDao userDao = new UserDaoImpl();
    //新增了功能，要修改原来的代码
//    private UserDao userDao = new UserDaoMysqlImpl();
    //又新增了功能，又要修改原来的代码
//    private UserDao userDao = new UserDaoOrcelImpl();

    //改进
    private UserDao userDao;
    //无论dao层怎么修改，这里都不用再修改
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
