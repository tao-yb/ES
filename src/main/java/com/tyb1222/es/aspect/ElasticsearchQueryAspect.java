package com.tyb1222.es.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ElasticsearchQueryAspect {

    @Pointcut("execution(* com.tyb1222.es.dao.*.*(..))")
    public void esQuery(){}

    @Around("esQuery()")
    public void invoke(ProceedingJoinPoint proceedingJoinPoint){
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
