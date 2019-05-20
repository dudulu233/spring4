package luo.spring4.aop;

public class MyBook {
    public void before1(){
        System.out.println("test 前置增强~~~~~~~~~~");
    }

    public void after1(){
        System.out.println("后置增强~~~~~~~");
    }

    //环绕通知
    public void around(){

    }
}
