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

		UserDao userDao=new AbcUserDao(); //Böyle de yazabiliriz ilk baþta interface ='lik tarafýna onu implemente eden class
		
		GoogleAccountAdapter googleAccountAdapter = new GoogleAccountAdapter(); // Yada Böyle direkt class new'lenebilir!

		User user1 = new User("Aydýn", "Þimþek", "simsekaydin01@hotmail.com", "sifre123456");
		User user2 = new User("Eren", "Þimþek", "simsekaydin01@hotmail.com", "sifre123456");

		UserManager userManager = new UserManager(userDao, googleAccountAdapter);

		userManager.register(user1);
		userManager.register(user2); //Sanki user2 içerisinde ki mail adresi user 1 ile ayný gibi düþündük!
		System.out.println("\n");
		userManager.registerWithGoogle(user1);
		
	}

}
