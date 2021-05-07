import java.util.regex.Pattern;

public class StudentManager extends BaseUserManager {

	private LoggerService loggerService;

	public StudentManager(LoggerService loggerService) {
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
		System.out.println("Student Eklendi: " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Student Silindi: " + user.getFirstName());

	}

	@Override
	public void update(User user) {
		System.out.println("Student Güncellendi: " + user.getFirstName());

	}

	public void registerStudent(Student student) {
		if (student.getStudentPassword().length() > 10) {
			System.out.println("Bir Öðrencinin þifresi en fazla 10 karakterli olabilir!");
			return;
		}
		if (isEmailValid(student.getEmail()) != true) {
			System.out.println("Geçersiz bir email adresi!");
			loggerService.log("Mail adresinizi lütfen doðru giriniz!");
			return;
		}

		else {
			System.out.println("Baþarýlý Kayýt: " + student.getStudentPassword());
			loggerService.log(student.getStudentPassword());

		}
	}

}
