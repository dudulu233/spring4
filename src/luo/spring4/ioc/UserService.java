package luo.spring4.ioc;

public class UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("this is service ~~~~~~~~~~~~~~~~~~~~~~~~~");
        userDao.add();

    }

}
