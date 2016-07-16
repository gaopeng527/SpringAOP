package gao.spring.service;

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
	
	@Before("anyMethod()") // 前置通知
	public void doAccessCheck(){
		System.out.println("前置通知！");
	}
}
