
public class EmailLogger implements LoggerService{

	@Override
	public void log(String message) {
		System.out.println("Email ile logland�: "+message);
		
	}

}
