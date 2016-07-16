package gao.spring.service;

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
	
	@Before("anyMethod()") // ǰ��֪ͨ
	public void doAccessCheck(){
		System.out.println("ǰ��֪ͨ��");
	}
}
