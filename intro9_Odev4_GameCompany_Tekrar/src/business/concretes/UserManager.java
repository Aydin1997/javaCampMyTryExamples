package business.concretes;

import java.rmi.RemoteException;

import business.abstracts.UserService;
import core.MersisService;
import entities.concretes.User;

public class UserManager implements UserService {
	
	private MersisService mersisService;
	
	public UserManager(MersisService mersisService) {
		super();
		this.mersisService = mersisService;
	}

	@Override
	public void add(User user) throws RemoteException {
		if(mersisService.validate(user)) {
			System.out.println("B�yle bir ki�i mevcuttur. Sisteme Kullan�c� Eklendi. "+user.getFirstName());
		}else {
			System.out.println("B�yle bir kullan�c� �lkede yok!");
			
		}

	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� sistemden silindi: " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� sistemde g�ncellendi: " + user.getFirstName() + " " + user.getLastName());
	}

}
