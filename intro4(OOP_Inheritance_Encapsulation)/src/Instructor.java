
public class Instructor extends User {

	private String instructorKullaniciAdý;
	private String instructorPassword;

	public Instructor() {

	}

	public Instructor(String firstName, String lastName, String nationalityId, int yearOfBirth,
			String instructorKullaniciAdý, String instructorPassword) {
		super(firstName, lastName, nationalityId, yearOfBirth);
		this.instructorKullaniciAdý = instructorKullaniciAdý;
		this.instructorPassword = instructorPassword;
	}

	public String getInstructorKullaniciAdý() {
		return instructorKullaniciAdý;
	}

	public void setInstructorKullaniciAdý(String instructorKullaniciAdý) {
		this.instructorKullaniciAdý = instructorKullaniciAdý;
	}

	public String getInstructorPassword() {
		return instructorPassword;
	}

	public void setInstructorPassword(String instructorPassword) {
		this.instructorPassword = instructorPassword;
	}
}
