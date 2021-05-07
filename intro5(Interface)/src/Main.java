
public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager=new CustomerManager(new OracleDao(),new SmsLogger());
		customerManager.add();
	}	

}
