package D.FurtherCorrection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);
    UserService userService = (UserServiceImpl) context.getBean("userService");
    User user = userService.getById(1);
}
