package yan.ibbie.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yan.ibbie.pojo.User;

@Configuration
public class AppConfig2 {
    @Bean
    public User userConfig2(){
        return new User();
    }
}
