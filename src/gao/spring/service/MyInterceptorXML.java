package gao.spring.service;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 定义切面，XML方式实现AOP
 * @author DELL
 *
 */

public class MyInterceptorXML {
	
	public void doAccessCheck(){
		System.out.println("前置通知");
	}
		
	public void doAfter(){
		System.out.println("后置通知");
	}
	
	public void doAfterReturning(){
		System.out.println("最终通知！");
	}
	
	public void doAfterThrowing(){
		System.out.println("异常通知");
	}
	
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("进入方法！");
		Object result = pjp.proceed(); // 必须执行该方法
		System.out.println("退出方法！");
		return result;
	}
}
