
public class DataBaseLogger implements LoggerService {

	@Override
	public void log(String message) {
		System.out.println("DataBase ile logland�: "+message);
		
	}

}
