
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new EmailLogger()); //Burada ki mant���m�z add i�erisine hangi Log'u new'lersek o �al��acakt�r!!

	}

}
