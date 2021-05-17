package game;

import game.Concrete.CampaignManager;
import game.Concrete.SellingManager;
import game.Concrete.UserManager;
import game.Entities.Campaign;
import game.Entities.Selling;
import game.Entities.User;

public class Main {

	public static void main(String[] args) {
		System.out.println("----------------------User ��lemleri----------------------------");
		User user1 = new User(1,"Ay�e","�lhanl�","12345","03.07.1998");
		User user2 = new User(2,"Sevda","Do�an","1234","23.03.2000");
		UserManager userManager = new UserManager();
		userManager.signUp(user1);
		userManager.signIn(user2);
		
		
		UserManager userManager2 = new UserManager();
		userManager2.CheckIfRealPerson(user1);
		System.out.println(" ");
		System.out.println("---------------------Bilgi g�ncelleme-----------------------------");
		
		userManager.signUpdate(user1);
		
		
		Selling game = new Selling("Counter-Strike" , 100 , 1000 , 15 , 85);
		SellingManager sellingManager = new SellingManager();
		
		System.out.println(" ");		
		System.out.println("-----------------------�ndirim ekleme silme vs.---------------------------");
		
		Campaign campaign = new Campaign(1, "Y�lba�� indirimi", 10, 1111111);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.CampaignAdd(campaign);
		campaignManager.CampaignDelete(campaign);
		campaignManager.CampaignUpdate(campaign);
		System.out.println(" ");
		
		System.out.println("------------------------Sat��--------------------------");
		
		sellingManager.Sell(user1, game,campaign);

	}

}
