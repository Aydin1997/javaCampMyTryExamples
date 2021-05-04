
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new EmailLogger()); //Burada ki mantýðýmýz add içerisine hangi Log'u new'lersek o çalýþacaktýr!!

	}

}
