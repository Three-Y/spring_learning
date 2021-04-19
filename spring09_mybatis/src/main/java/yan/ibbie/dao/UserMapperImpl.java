package yan.ibbie.dao;

import org.mybatis.spring.SqlSessionTemplate;
import yan.ibbie.pojo.User;

import java.util.List;

//方法一：与mybatis不同的是，要多提供一个mapper的实现类，注入sqlSessionTemplate
public class UserMapperImpl implements  UserMapper {

    private SqlSessionTemplate sqlSessionTemplate;

    public List<User> selectUsers() {
        return sqlSessionTemplate.getMapper(UserMapper.class).selectUsers();
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
}
