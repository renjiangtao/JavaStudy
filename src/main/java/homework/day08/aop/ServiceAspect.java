package homework.day08.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ServiceAspect {

    @Pointcut("execution(* homework.day08.service.*.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void doBefore(JoinPoint pjp) throws Throwable {
        log.info("前置通知");
        System.out.println("pjp.getArgs() = " + pjp.getArgs());
    }

    @After("pointCut()")
    public void doAfter(JoinPoint pjp) throws Throwable {
        log.info("pjp.getSignature().getName() = " + pjp.getSignature().getName());
        System.out.println("pjp.getKind() = " + pjp.getKind());
        log.info("后置通知");
    }
}
