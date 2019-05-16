package luo.spring4.book;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    //测试混合注解BOOK

    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_book.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.add();
    }

}
