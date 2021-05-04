
public class User {

	// Base Class

	private String firstName;
	private String lastName;
	private String nationalityId;
	private int yearOfBirth;

	public User() {
		// Default Constructor:E�er Main i�erisinde set etmek istersek diye yaz�ld�.
	}

	public User(String firstName, String lastName, String nationalityId, int yearOfBirth) { // Yap�c� Constructor:E�er
																							// Main i�erisinde direkt
																							// uzun uzun yazmaya
																							// u�ra�mak istemezsek
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.yearOfBirth = yearOfBirth;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}
