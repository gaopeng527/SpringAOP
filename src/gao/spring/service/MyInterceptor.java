package gao.spring.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 定义切面
 * @author DELL
 *
 */
// 注解指明切面
@Aspect
public class MyInterceptor {
	// 定义切入点
	@Pointcut("execution (* gao.spring.service.impl.PersonServiceImpl.*(..))")
	private void anyMethod() {}; // 声明一个切入点
	
	@Before("anyMethod() && args(name)") // 前置通知
	public void doAccessCheck(String name){
		System.out.println("前置通知："+name);
	}
		
	@AfterReturning(pointcut="anyMethod()", returning="result") // 后置通知
	public void doAfter(String result){
		System.out.println("后置通知："+result);
	}
	
	@After("anyMethod()") // 最终通知
	public void doAfterReturning(){
		System.out.println("最终通知！");
	}
	
	@AfterThrowing(pointcut="anyMethod()", throwing="e") // 异常通知
	public void doAfterThrowing(Exception e){
		System.out.println("异常通知："+e);
	}
	
	@Around("anyMethod()") // 环绕通知，完全可以实现上述功能
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("进入方法！");
		Object result = pjp.proceed(); // 必须执行该方法
		System.out.println("退出方法！");
		return result;
	}
}
