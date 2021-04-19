package yan.ibbie.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import yan.ibbie.pojo.User;

import java.util.List;

//方法二：不用注入SqlSessionTemplate
//继承SqlSessionDaoSupport，可以通过getSqlSession()，获取SqlSessionTemplate
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> selectUsers() {
        return getSqlSession().getMapper(UserMapper.class).selectUsers();
    }
}
