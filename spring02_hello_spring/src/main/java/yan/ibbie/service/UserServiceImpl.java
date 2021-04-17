package yan.ibbie.service;

import yan.ibbie.dao.UserDao;

/*
* IOC是一种编程思想，由主动地编程变成被动地接收
* */
public class UserServiceImpl implements UserService {

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
