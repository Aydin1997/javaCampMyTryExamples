package business.concretes;

import java.util.ArrayList;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import core.GoogleService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private GoogleService googleService;

	public UserManager(UserDao userDao, GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
	}

	public static boolean isEmailValid(String email) { // Email control
		final Pattern EMAIL_REGEX = Pattern.compile(
				"[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
				Pattern.CASE_INSENSITIVE);
		return EMAIL_REGEX.matcher(email).matches();
	}

	public static boolean isEmailValidOnClick() { // Tiklama onayi
		return true;
	}

	ArrayList<String> emailList = new ArrayList<String>();
	ArrayList<String> passwordList = new ArrayList<String>();
	ArrayList<String> googleEmailList = new ArrayList<String>();

	@Override
	public void register(User user) {

		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ýsim veya soyisim hatalý!\nKural:Ýsim ve soyisim en az 2 karakterden oluþmalýdýr");
			return;
		}
		if (user.getPassword().length() < 6) {
			System.out.println("Þifre hatalý!\nKural:Þifre en az 6 karakterden oluþmalýdýr.");
			return;
		}
		if (isEmailValid(user.getEmail()) != true) {
			System.out.println("Geçersiz email adresi girdiniz!");
			return;
		}

		if (emailList.contains(user.getEmail())) {
			System.out.println("Bu mail adresi sistemde kayýtlý baþka bir mail adresi deneyiniz.");
			return;
		} else {

			if (isEmailValidOnClick() == true) {
				
				System.out.println("Mail adresinizi Onayladýnýz!!");
				System.out.println("Kayýt Ýþlemi Baþarýlý bir þekilde yapýlmýþtýr!!");
				userDao.add(user.getEmail());
				emailList.add(user.getEmail());
				passwordList.add(user.getPassword());
			} else {
				System.out.println("Mail Adresi Doðrulamasý yapýlmadý!");
				System.out.println("Kayýt Ýþlemi Baþarýsýz!");

			}

		}

	}

	@Override
	public void registerWithGoogle(User user) {
		googleService.withGoogle(user.getFirstName());

	}

	@Override
	public void login(String email, String password) {

		if (emailList.contains(email) && passwordList.contains(password)) {
			System.out.println("Giriþ iþlemi baþarýlý!");
		} else {
			System.out.println("Kullanýcý Adý veya Þifre hatalý");
		}

	}

}
