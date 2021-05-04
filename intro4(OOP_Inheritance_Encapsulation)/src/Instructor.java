
public class Instructor extends User {

	private String instructorKullaniciAd�;
	private String instructorPassword;

	public Instructor() {

	}

	public Instructor(String firstName, String lastName, String nationalityId, int yearOfBirth,
			String instructorKullaniciAd�, String instructorPassword) {
		super(firstName, lastName, nationalityId, yearOfBirth);
		this.instructorKullaniciAd� = instructorKullaniciAd�;
		this.instructorPassword = instructorPassword;
	}

	public String getInstructorKullaniciAd�() {
		return instructorKullaniciAd�;
	}

	public void setInstructorKullaniciAd�(String instructorKullaniciAd�) {
		this.instructorKullaniciAd� = instructorKullaniciAd�;
	}

	public String getInstructorPassword() {
		return instructorPassword;
	}

	public void setInstructorPassword(String instructorPassword) {
		this.instructorPassword = instructorPassword;
	}
}
