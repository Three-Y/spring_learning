package yan.ibbie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import yan.ibbie.pojo.User;
/*
* @Configuration 表示该类是一个配置类，此类相当于beans.xml
*                本质也是一个@Component，使用该注解的类也会由spring管理
* @ComponentScan 开启组件扫描
* @Bean 相当于<bean/>
*       方法名表示bean的id
*       返回值表示bean的class
*       注意！！！：
*           假如@Bean在config类中配置了，并且@Component也都对同一个类进行了配置
*           如果两个注解给bean设置的id不同，该类的bean会创建两次
*           如果两个注解给bean设置的id相同，或者都没有指定id，则该类的bean只有一个
* @Import 导入其它配置类
* */

@Import(AppConfig2.class)
@Configuration
@ComponentScan("yan.ibbie.pojo")
public class AppConfig {

    @Bean("user66")
    public User user(){
        return new User();
    }
}
