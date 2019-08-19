package com.kgc.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class Handler {
    //切面 公共的代码 增强类

    public void login(){
        System.out.println("验证登录通过!!!");

    }


    public void afterReturn(){

        System.out.println("后置增强");
    }

    //ProceedingJoinPoint执行连接点
    public void around(ProceedingJoinPoint p) throws Throwable {
        System.out.println("环绕增强前");
        p.proceed(); //调用目标方法  切点
        //int i=1/0;
        System.out.println("环绕增强后");
    }

    public void excep(){
        System.out.println("异常增强");
    }
    public void end(){
        System.out.println("最后增强");

    }


}
