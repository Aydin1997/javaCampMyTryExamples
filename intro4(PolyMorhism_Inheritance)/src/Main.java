
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new EmailLogger()); //Burada ki mantığımız add içerisine hangi Log'u new'lersek o çalışacaktır!!

	}

}
