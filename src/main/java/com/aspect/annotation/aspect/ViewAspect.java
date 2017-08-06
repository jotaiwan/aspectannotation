package com.aspect.annotation.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by jotaiwan on 6/08/2017.
 */
@Aspect
@Component
public class ViewAspect {
    @Before("execution(* com.aspect.annotation.controller.*.*View(..))")
    public void beforeAspect() {
        System.out.println("This method will be invoked before the aspect.");
    }

    @After("execution(* com.aspect.annotation.controller.*.*View(..))")
    public void afterAspect() {
        System.out.println("This method will be invoked after the aspect.");
    }
}