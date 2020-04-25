package D.FurtherCorrection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("java")
public class AppConfig {
    @Bean
    public UserDao userDao(){
        return  new UserDaoImpl();
    }

    @Bean
    public UserService userService(){
        return  new UserServiceImpl(userDao());
    }
}
