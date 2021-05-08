package dataAccess.concretes;

import dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(String message) {
		System.out.println("Hibernate ile user eklendi: "+message);
		
	}

	@Override
	public void delete(String message) {
		System.out.println("Hibernate ile user silindi: "+message);
		
	}

	@Override
	public void update(String message) {
		System.out.println("Hibernate ile user güncellendi: "+message);
		
	}
	

}
