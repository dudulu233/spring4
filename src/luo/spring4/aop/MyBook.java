package luo.spring4.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyBook {
    public void before1(){
        System.out.println("test 前置增强~~~~~~~~~~");
    }

    public void after1(){
        System.out.println("后置增强~~~~~~~");
    }

    //环绕通知
    public void around1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //before
        System.out.println("方法之前~~~~~~~~~~~~~~~");

        //被增强方法
        proceedingJoinPoint.proceed();

        //after
        System.out.println("方法之后~~~~~~~~~~~~~~~~~");

    }
}
