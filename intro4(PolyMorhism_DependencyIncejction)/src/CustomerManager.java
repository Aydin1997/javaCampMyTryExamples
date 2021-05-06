
public class CustomerManager {
	
	LoggerServices loggerServices;
	
	public CustomerManager(LoggerServices loggerServices) {
		super();
		this.loggerServices = loggerServices;
	}

	public void add() {
		System.out.println("Müþteri Eklendi");
		System.out.println("Loglama Ýþlemi:");
		
		loggerServices.log();
	
	}

}
