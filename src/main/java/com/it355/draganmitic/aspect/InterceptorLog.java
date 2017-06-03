package com.it355.draganmitic.aspect;

import java.lang.reflect.Method;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * InterceptorLog
 */
@Aspect
public class InterceptorLog implements MethodBeforeAdvice {
    
    @Override
    public void before(Method arg0, Object[] arg1, Object arg2)throws Throwable {
        System.out.println("logBefore() is running!");
        System.out.println("hijacked : " + arg0.getName());
        System.out.println("******");
    }
}
