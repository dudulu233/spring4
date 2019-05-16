package luo.spring4.user;


import org.springframework.stereotype.Component;

@Component(value = "user")
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void add(){
        System.out.println("``````````````this is a add function````````````````");
    }

//    public static void main(String[] args) {
//        User user = new User();
//        user.add();
//    }
}
