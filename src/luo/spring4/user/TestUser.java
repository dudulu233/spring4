package luo.spring4.user;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
//    public void testUser(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring_context.xml");
//        User user = (User) context.getBean("user");
//        System.out.println(user);
//        user.add();
//    }

    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_context.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();

    }

}
