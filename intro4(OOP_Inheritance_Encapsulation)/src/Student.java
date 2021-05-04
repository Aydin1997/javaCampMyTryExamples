
public class Student extends User {

	private String studentKullaniciAd�;
	private String studentPassword;

	public Student() {

	}

	public Student(String firstName, String lastName, String nationalityId, int yearOfBirth, String studentKullaniciAd�,
			String studentPassword) {

		super(firstName, lastName, nationalityId, yearOfBirth); // Alt Class AnaS�n�f�n �zelliklerini Constructor eder.
		this.studentKullaniciAd� = studentKullaniciAd�;
		this.studentPassword = studentPassword;
	}

	public String getStudentKullaniciAd�() {
		return studentKullaniciAd�;
	}

	public void setStudentKullaniciAd�(String studentKullaniciAd�) {
		this.studentKullaniciAd� = studentKullaniciAd�;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
}
