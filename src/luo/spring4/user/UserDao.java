package luo.spring4.user;


import org.springframework.stereotype.Component;

@Component(value = "userDao")
public class UserDao {
    public void add(){
        System.out.println("this is dao```````````````````");

    }
}
