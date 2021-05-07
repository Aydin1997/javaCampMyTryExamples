
public class Student extends User{
	
	private String studentPassword;
	
	public Student() {
		
	}

	public Student(String studentPassword,String firstName, String lastName, String email, int age) {
		super(firstName,lastName,email,age);
		this.studentPassword = studentPassword;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

}
