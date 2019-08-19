package com.kgc.annio;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Handler {
    //切面 公共的代码 增强类

    @Before("execution(* com.kgc.annio.Target.*(..))")
    public void login(){
        System.out.println("注解版——验证登录通过!!!");

    }


    @AfterReturning("execution(* com.kgc.annio.Target.*(..))")
    public void afterReturn(){

        System.out.println("注解版——后置增强");
    }

    //ProceedingJoinPoint执行连接点
    @Around("execution(* com.kgc.annio.Target.*(..))")
    public void around(ProceedingJoinPoint p) throws Throwable {
        System.out.println("注解版——环绕增强前");
        p.proceed(); //调用目标方法  切点
        //int i=1/0;
        System.out.println("注解版——环绕增强后");
    }

    @AfterThrowing("execution(* com.kgc.annio.Target.*(..))")
    public void excep(){
        System.out.println("注解版——异常增强");
    }

    @After("execution(* com.kgc.annio.Target.*(..))")
    public void end(){
        System.out.println("注解版——最后增强");

    }


}
