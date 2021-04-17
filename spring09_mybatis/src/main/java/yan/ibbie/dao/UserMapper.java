package yan.ibbie.dao;

import yan.ibbie.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUsers();
}
