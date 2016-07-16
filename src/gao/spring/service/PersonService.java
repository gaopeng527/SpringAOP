package gao.spring.service;

public interface PersonService {
	public void save(String name);
	public void update(Integer id, String name);
	public String getPersonName(Integer id);
}
