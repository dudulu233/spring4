package luo.spring4.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testaop {
    @Test
    public void testaop(){
        ApplicationContext context= new ClassPathXmlApplicationContext("spring_aop.xml");
        Book book = (Book) context.getBean("book");
        book.add();
    }

}
