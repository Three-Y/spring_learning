package yan.ibbie.mapper;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import yan.ibbie.pojo.User;

import java.util.List;
import java.util.Map;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    public List<User> selectUsers() {
        return getSqlSession().getMapper(UserMapper.class).selectUsers();
    }

    public int add(User user) {
        return getSqlSession().getMapper(UserMapper.class).add(user);
    }

    public int updateEmailById(Map<String,String> map) {
        return getSqlSession().getMapper(UserMapper.class).updateEmailById(map);
    }

    public int delete(String id) {
        return getSqlSession().getMapper(UserMapper.class).delete(id);
    }

    public List<User> updateEmailAndAdd(Map<String, String> map,User user) {

        updateEmailById(map);

        add(user);

        return selectUsers();
    }
}
