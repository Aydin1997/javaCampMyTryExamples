package core;

import jGoogle.GoogleAccount;

public class GoogleAccountAdapter implements GoogleService{

	@Override
	public void withGoogle(String message) {
		GoogleAccount googleAccount=new GoogleAccount();
		googleAccount.add(message);
		
	}

}
