import java.util.regex.Pattern;

public class InstructorManager extends BaseUserManager {

	private LoggerService loggerService;

	public InstructorManager(LoggerService loggerService) {
		super();
		this.loggerService = loggerService;
	}

	public static boolean isEmailValid(String email) { // Email control
		final Pattern EMAIL_REGEX = Pattern.compile(
				"[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
				Pattern.CASE_INSENSITIVE);
		return EMAIL_REGEX.matcher(email).matches();
	}

	@Override
	public void add(User user) {

		System.out.println("Instructor Eklendi: " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Instructor Silindi: " + user.getFirstName());

	}

	@Override
	public void update(User user) {
		System.out.println("Instructor G�ncellendi: " + user.getFirstName());

	}

	public void registerInstructor(Instructor instructor) {
		if (instructor.getInstructorPassword().length() < 6) {
			System.out.println("Bir Instructor i�in �ifre en az 6 karakterli olmal�d�r.");
			return;
		}if(isEmailValid(instructor.getEmail())!=true) {
			System.out.println("Ge�ersiz bir email adresi!");
			loggerService.log("Mail adresinizi l�tfen do�ru giriniz!");
			return;
		}
		
		else {
			System.out.println("Ba�ar�l� �ifre Kay�t�: " + instructor.getInstructorPassword());
			loggerService.log(instructor.getInstructorPassword());
		}
	}

}
