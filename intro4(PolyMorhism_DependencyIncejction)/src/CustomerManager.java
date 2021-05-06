
public class CustomerManager {
	
	LoggerServices loggerServices;
	
	public CustomerManager(LoggerServices loggerServices) {
		super();
		this.loggerServices = loggerServices;
	}

	public void add() {
		System.out.println("M��teri Eklendi");
		System.out.println("Loglama ��lemi:");
		
		loggerServices.log();
	
	}

}
