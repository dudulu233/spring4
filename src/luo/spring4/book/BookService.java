package luo.spring4.book;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class BookService {

    @Autowired
    private BookDao bookDao;

    @Resource(name = "ordersDao")
    private OrdersDao ordersDao;

    public void add(){
        System.out.println("this is Bookservice~~~~~~~~~~~~~~");
        bookDao.add();
        ordersDao.buy();
    }


}
