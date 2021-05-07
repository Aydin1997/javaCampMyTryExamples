
public class SmsLogger implements LoggerService{

	@Override
	public void log(String message) {
		System.out.println("Sms ile loglandý: "+message);
		
	}

}
