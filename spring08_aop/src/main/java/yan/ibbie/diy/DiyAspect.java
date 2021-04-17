package yan.ibbie.diy;

import org.aspectj.lang.ProceedingJoinPoint;

public class DiyAspect {
    public void diyMethod1(){
        System.out.println("-----diyMethod1-----");
    }
    public void diyMethod2(){
        System.out.println("-----diyMethod2-----");
    }
    public void diyMethod3(ProceedingJoinPoint jp){
        System.out.println("-----diyMethod3 before-----");
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("-----diyMethod3 after-----");
    }
}
