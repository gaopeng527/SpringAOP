package gao.spring.service.impl;

import gao.spring.service.PersonService;

public class PersonServiceImpl implements PersonService {

	@Override
	public void save(String name) {	
//		throw new RuntimeException("运行时异常！");
		System.out.println("这是save()方法！");
	}

	@Override
	public void update(Integer id, String name) {
		System.out.println("这是update()方法！");
	}

	@Override
	public String getPersonName(Integer id) {
		System.out.println("这是getPersonName()方法！");
		return "xxx";
	}
	
}
