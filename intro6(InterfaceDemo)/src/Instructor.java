
public class Instructor extends User {

	private String instructorPassword;

	public Instructor() {

	}

	public Instructor(String instructorPassword, String firstName, String lastName, String email, int age) {
		super(firstName, lastName, email, age);
		this.instructorPassword = instructorPassword;
	}

	public String getInstructorPassword() {
		return instructorPassword;
	}

	public void setInstructorPassword(String instructorPassword) {
		this.instructorPassword = instructorPassword;
	}

}
