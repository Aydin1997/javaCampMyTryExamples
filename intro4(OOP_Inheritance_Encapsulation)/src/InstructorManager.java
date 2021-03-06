
public class InstructorManager extends BaseUserManager {

	@Override
	public void add(User user) {
		System.out.println("Öğretmen Eklendi: " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Öğretmen Eklendi: " + user.getFirstName());

	}

	@Override
	public void update(User user) {
		System.out.println("Öğretmen Güncellendi:  " + user.getFirstName());

	}

	public void instructorInformation(Instructor instructor) {
		System.out.println("Öğretmen Bilgileri: " + instructor.getFirstName() + " " + instructor.getLastName() + " "
				+ instructor.getNationalityId() + " " + instructor.getYearOfBirth() + " "
				+ instructor.getInstructorKullaniciAdı() + " " + instructor.getInstructorPassword());
	}

}
