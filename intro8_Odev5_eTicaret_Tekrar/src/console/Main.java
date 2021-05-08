package console;

import java.util.Scanner;

import business.concretes.UserManager;
import core.GoogleAccountAdapter;
import core.GoogleService;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.AbcUserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserDao userDao=new AbcUserDao(); //B�yle de yazabiliriz ilk ba�ta interface ='lik taraf�na onu implemente eden class
		
		GoogleAccountAdapter googleAccountAdapter = new GoogleAccountAdapter(); // Yada B�yle direkt class new'lenebilir!

		User user1 = new User("Ayd�n", "�im�ek", "simsekaydin01@hotmail.com", "sifre123456");
		User user2 = new User("Eren", "�im�ek", "simsekaydin01@hotmail.com", "sifre123456");

		UserManager userManager = new UserManager(userDao, googleAccountAdapter);

		userManager.register(user1);
		userManager.register(user2); //Sanki user2 i�erisinde ki mail adresi user 1 ile ayn� gibi d���nd�k!
		System.out.println("\n");
		userManager.registerWithGoogle(user1);
		
	}

}
