package yan.ibbie.dao;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取用户数据，第二种实现");
    }
}
