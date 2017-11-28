package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SystemLogAspect {

    //Controller层切点，也就是上面那个注解的路径
    @Pointcut("execution(* service.IBeanService.get(..))")
    public  void controllerAspect() {
    }

    /**
     * 前置通知 用于拦截Controller层记录用户的操作
     *
     * @param joinPoint 切点
     */
    @Before("controllerAspect()")
    public  void doBefore(JoinPoint joinPoint) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>rizhi<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

}