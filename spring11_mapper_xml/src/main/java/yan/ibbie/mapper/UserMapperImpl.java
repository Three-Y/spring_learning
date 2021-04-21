package yan.ibbie.mapper;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import yan.ibbie.pojo.MyUser;
import yan.ibbie.pojo.User;

import java.util.List;
import java.util.Map;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    public User selectUserById(String id) {
        return getSqlSession().getMapper(UserMapper.class).selectUserById(id);
    }

    public List<User> selectUserByIdAndName(String id, String name) {
        return getSqlSession().getMapper(UserMapper.class).selectUserByIdAndName(id,name);
    }

    public User selectUserByEmail(User user) {
        return getSqlSession().getMapper(UserMapper.class).selectUserByEmail(user);
    }

    public User selectUserByNameAge(Map<String, Object> map) {
        return getSqlSession().getMapper(UserMapper.class).selectUserByNameAge(map);
    }

    public MyUser selectUserByMyId(String myId) {
        return getSqlSession().getMapper(UserMapper.class).selectUserByMyId(myId);
    }

    public MyUser selectUserByMyId222(String myId) {
        return getSqlSession().getMapper(UserMapper.class).selectUserByMyId(myId);
    }

    public User selectUserLikeName(String name) {
        return getSqlSession().getMapper(UserMapper.class).selectUserLikeName(name);
    }

    public User selectUserLikeName222(String name) {
        return getSqlSession().getMapper(UserMapper.class).selectUserLikeName222(name);
    }

    public List<User> selectUserByConditions(User user) {
        return getSqlSession().getMapper(UserMapper.class).selectUserByConditions(user);
    }

    public List<User> selectUserByConditions222(User user) {
        return getSqlSession().getMapper(UserMapper.class).selectUserByConditions222(user);
    }

    public List<User> selectUserInId(List<String> idList) {
        return getSqlSession().getMapper(UserMapper.class).selectUserInId(idList);
    }

    public List<User> selectUserInUserId(List<User> users) {
        return getSqlSession().getMapper(UserMapper.class).selectUserInUserId(users);
    }

    public List<User> selectAllUser() {
        return getSqlSession().getMapper(UserMapper.class).selectAllUser();
    }
}
