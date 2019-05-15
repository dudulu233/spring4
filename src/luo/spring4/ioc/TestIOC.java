package luo.spring4.ioc;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {

    @Test
    public void testUser(){
        //1加载spring配置文件,创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //得到对象
//        User user1 = (User) context.getBean("user");
//        System.out.println(user1.getName());
//        System.out.println(user1.getAge());
//        user1.add();

//        UserService userService = (UserService) context.getBean("userService");
//        userService.add();

        Person person = (Person) context.getBean("person");
        person.showall();



    }

}
