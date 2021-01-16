package sk.itsovy.kutka.aopdemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {


//    @Before("execution(public void add*())")

    @Pointcut("execution(* sk.itsovy.kutka.aopdemo.dao.*.*(..))")
    private void forDaoPackage() {

    }

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice() {
        System.out.println("ASPECT @BEFORE");
    }


    @Before("forDaoPackage()")
    public void performApiAnalytics() {
        System.out.println("Performing API Analytics");
    }
}
