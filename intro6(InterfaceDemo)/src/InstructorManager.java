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
		System.out.println("Instructor Güncellendi: " + user.getFirstName());

	}

	public void registerInstructor(Instructor instructor) {
		if (instructor.getInstructorPassword().length() < 6) {
			System.out.println("Bir Instructor için þifre en az 6 karakterli olmalýdýr.");
			return;
		}if(isEmailValid(instructor.getEmail())!=true) {
			System.out.println("Geçersiz bir email adresi!");
			loggerService.log("Mail adresinizi lütfen doðru giriniz!");
			return;
		}
		
		else {
			System.out.println("Baþarýlý Þifre Kayýtý: " + instructor.getInstructorPassword());
			loggerService.log(instructor.getInstructorPassword());
		}
	}

}
