package yan.ibbie.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//使用注解要开启aop注解支持
@Aspect
public class MyAspect {

    @Before("execution(* yan.ibbie.service.UserService.*(..))")
    public void method001(){
        System.out.println("+++++@Before()+++++");
    }
    @After("execution(* yan.ibbie.service.UserService.*(..))")
    public void method002(){
        System.out.println("+++++@After()+++++");
    }

    //注意要在环绕通知中调用切入点原方法
    @Around("execution(* yan.ibbie.service.UserService.*(..))")
    public void method003(ProceedingJoinPoint jp){
        System.out.println("+++++@Around  before+++++");
        System.out.println("执行的方法是："+jp.getSignature());
        try {
            Object result = jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("+++++@Around  after+++++");
    }
}
