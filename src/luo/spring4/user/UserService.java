package luo.spring4.user;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component(value = "userService")
public class UserService {

//    @Autowired
//    private UserDao userDao;

    @Resource(name = "userDao")
    private  UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void add(){
        System.out.println("this is service ~~~~~~~~~~~~~~~~~~~~~~~~~");
        userDao.add();

    }

}
