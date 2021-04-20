package yan.ibbie.mapper;

import yan.ibbie.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    public List<User> selectUsers();

    public int add(User user);

    public int updateEmailById(Map<String,String> map);

    public int delete(String id);

    public List<User> updateEmailAndAdd(Map<String,String> map,User user);
}
