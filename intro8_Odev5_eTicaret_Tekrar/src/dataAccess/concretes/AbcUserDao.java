package dataAccess.concretes;

import dataAccess.abstracts.UserDao;

public class AbcUserDao implements UserDao {

	@Override
	public void add(String message) {
		System.out.println("Abc ile user eklendi: " + message);

	}

	@Override
	public void delete(String message) {
		System.out.println("Abc ile user silindi: " + message);

	}

	@Override
	public void update(String message) {
		System.out.println("Abc ile user güncellendi: " + message);

	}

}
