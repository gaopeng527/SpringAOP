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
 * ��������
 * @author DELL
 *
 */
// ע��ָ������
@Aspect
public class MyInterceptor {
	// ���������
	@Pointcut("execution (* gao.spring.service.impl.PersonServiceImpl.*(..))")
	private void anyMethod() {}; // ����һ�������
	
	@Before("anyMethod() && args(name)") // ǰ��֪ͨ
	public void doAccessCheck(String name){
		System.out.println("ǰ��֪ͨ��"+name);
	}
		
	@AfterReturning(pointcut="anyMethod()", returning="result") // ����֪ͨ
	public void doAfter(String result){
		System.out.println("����֪ͨ��"+result);
	}
	
	@After("anyMethod()") // ����֪ͨ
	public void doAfterReturning(){
		System.out.println("����֪ͨ��");
	}
	
	@AfterThrowing(pointcut="anyMethod()", throwing="e") // �쳣֪ͨ
	public void doAfterThrowing(Exception e){
		System.out.println("�쳣֪ͨ��"+e);
	}
	
	@Around("anyMethod()") // ����֪ͨ����ȫ����ʵ����������
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("���뷽����");
		Object result = pjp.proceed(); // ����ִ�и÷���
		System.out.println("�˳�������");
		return result;
	}
}
