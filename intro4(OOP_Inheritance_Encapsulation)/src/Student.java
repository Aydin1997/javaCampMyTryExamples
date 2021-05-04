
public class Student extends User {

	private String studentKullaniciAdý;
	private String studentPassword;

	public Student() {

	}

	public Student(String firstName, String lastName, String nationalityId, int yearOfBirth, String studentKullaniciAdý,
			String studentPassword) {

		super(firstName, lastName, nationalityId, yearOfBirth); // Alt Class AnaSýnýfýn özelliklerini Constructor eder.
		this.studentKullaniciAdý = studentKullaniciAdý;
		this.studentPassword = studentPassword;
	}

	public String getStudentKullaniciAdý() {
		return studentKullaniciAdý;
	}

	public void setStudentKullaniciAdý(String studentKullaniciAdý) {
		this.studentKullaniciAdý = studentKullaniciAdý;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
}
