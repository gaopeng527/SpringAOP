package gao.spring.service.impl;

import gao.spring.service.PersonService;

public class PersonServiceImpl implements PersonService {

	@Override
	public void save(String name) {	
		System.out.println("����save()������");
	}

	@Override
	public void update(Integer id, String name) {
		System.out.println("����update()������");
	}

	@Override
	public String getPersonName(Integer id) {
		System.out.println("����getPersonName()������");
		return "xxx";
	}
	
}
