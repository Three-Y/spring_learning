package yan.ibbie.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/*
@Component 表示为该类创建bean
           有几个衍生注解，按照mvc三层架构分层，作用与@Component相同
           @Controller
           @Service
           @Repository
@Scope bean的作用域，默认单例singleton
@Value 可作用再属性和set方法上，为该bean的属性赋值
 */

//@Scope("prototype")
@Component
public class User {
    //@Value("ibbie_@value")
    private String name = "ibbie";

    public User() {
        System.out.println("User无参构造器");
    }

    public String getName() {
        return name;
    }

    //@Value("ibbie_@value")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
