package gao.spring.service;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * �������棬XML��ʽʵ��AOP
 * @author DELL
 *
 */

public class MyInterceptorXML {
	
	public void doAccessCheck(){
		System.out.println("ǰ��֪ͨ");
	}
		
	public void doAfter(){
		System.out.println("����֪ͨ");
	}
	
	public void doAfterReturning(){
		System.out.println("����֪ͨ��");
	}
	
	public void doAfterThrowing(){
		System.out.println("�쳣֪ͨ");
	}
	
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("���뷽����");
		Object result = pjp.proceed(); // ����ִ�и÷���
		System.out.println("�˳�������");
		return result;
	}
}
