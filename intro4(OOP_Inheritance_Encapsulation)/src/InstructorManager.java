
public class InstructorManager extends BaseUserManager {

	@Override
	public void add(User user) {
		System.out.println("Öðretmen Eklendi: " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Öðretmen Eklendi: " + user.getFirstName());

	}

	@Override
	public void update(User user) {
		System.out.println("Öðretmen Güncellendi:  " + user.getFirstName());

	}

	public void instructorInformation(Instructor instructor) {
		System.out.println("Öðretmen Bilgileri: " + instructor.getFirstName() + " " + instructor.getLastName() + " "
				+ instructor.getNationalityId() + " " + instructor.getYearOfBirth() + " "
				+ instructor.getInstructorKullaniciAdý() + " " + instructor.getInstructorPassword());
	}

}
