
public class Student extends User {

	private String studentKullaniciAdı;
	private String studentPassword;

	public Student() {

	}

	public Student(String firstName, String lastName, String nationalityId, int yearOfBirth, String studentKullaniciAdı,
			String studentPassword) {

		super(firstName, lastName, nationalityId, yearOfBirth); // Alt Class AnaSınıfın özelliklerini Constructor eder.
		this.studentKullaniciAdı = studentKullaniciAdı;
		this.studentPassword = studentPassword;
	}

	public String getStudentKullaniciAdı() {
		return studentKullaniciAdı;
	}

	public void setStudentKullaniciAdı(String studentKullaniciAdı) {
		this.studentKullaniciAdı = studentKullaniciAdı;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
}
