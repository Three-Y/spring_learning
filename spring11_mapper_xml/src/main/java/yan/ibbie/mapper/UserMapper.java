package yan.ibbie.mapper;

import org.apache.ibatis.annotations.Param;
import yan.ibbie.pojo.MyUser;
import yan.ibbie.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //一个参数，基本数据类型或者字符串
    public User selectUserById(String id);
    //多个参数，建议使用@Param给参数命名
    public List<User> selectUserByIdAndName(@Param("id666") String id, @Param("name888") String name);
    //传递的参数是对象
    public User selectUserByEmail(User user);
    //使用Map传递参数
    public User selectUserByNameAge(Map<String,Object> map);

    public MyUser selectUserByMyId(String myId);
    public MyUser selectUserByMyId222(String myId);

    //模糊查询
    public User selectUserLikeName(String name);
    public User selectUserLikeName222(String name);

    //动态SQL
    public List<User> selectUserByConditions(User user);
    public List<User> selectUserByConditions222(User user);
    public List<User> selectUserInId(List<String> idList);
    public List<User> selectUserInUserId(List<User> users);

    //代码片段
    public List<User> selectAllUser();
}
