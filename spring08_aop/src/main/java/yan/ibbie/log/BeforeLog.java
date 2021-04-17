package yan.ibbie.log;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {

    //method: 要增强的方法
    //objects: 要增强的方法的参数
    //o: 调用方法的对象
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("*****before()*****");
    }
}
