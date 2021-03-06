
public class Instructor extends User {

	private String instructorKullaniciAdı;
	private String instructorPassword;

	public Instructor() {

	}

	public Instructor(String firstName, String lastName, String nationalityId, int yearOfBirth,
			String instructorKullaniciAdı, String instructorPassword) {
		super(firstName, lastName, nationalityId, yearOfBirth);
		this.instructorKullaniciAdı = instructorKullaniciAdı;
		this.instructorPassword = instructorPassword;
	}

	public String getInstructorKullaniciAdı() {
		return instructorKullaniciAdı;
	}

	public void setInstructorKullaniciAdı(String instructorKullaniciAdı) {
		this.instructorKullaniciAdı = instructorKullaniciAdı;
	}

	public String getInstructorPassword() {
		return instructorPassword;
	}

	public void setInstructorPassword(String instructorPassword) {
		this.instructorPassword = instructorPassword;
	}
}
