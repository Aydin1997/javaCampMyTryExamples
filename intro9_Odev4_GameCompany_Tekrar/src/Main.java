import java.rmi.RemoteException;

import business.concretes.CampaignManager;
import business.concretes.GameManager;
import business.concretes.SaleManager;
import business.concretes.UserManager;
import core.MersisManagerAdapter;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		MersisManagerAdapter mersisManagerAdapter=new MersisManagerAdapter();
		
		User user1 = new User("Aydýn", "Þimþek", 1997, 44215944902L);
		UserManager userManager = new UserManager(mersisManagerAdapter);

		userManager.add(user1);
		userManager.delete(user1);
		userManager.update(user1);

		System.out.println("-------------------------------------------------------------------------");

		Campaign campaign1 = new Campaign("Öðrenci Kampanyasý");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);

		System.out.println("-------------------------------------------------------------------------");

		Game game1 = new Game("Far Cry5", 250, 75);
		Game game2 = new Game("Crysis3", 185);

		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.delete(game1);
		gameManager.update(game2);
	
		System.out.println("-------------------------------------------------------------------------");
		
		SaleManager saleManager=new SaleManager();
		saleManager.saleWithCampaign(user1, game1, campaign1);
		saleManager.saleWithoutCampaign(user1, game2);
		
		System.out.println("-------------------------------------------------------------------------");
	}

}
