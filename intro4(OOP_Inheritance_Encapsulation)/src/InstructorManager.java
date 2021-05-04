
public class InstructorManager extends BaseUserManager {

	@Override
	public void add(User user) {
		System.out.println("��retmen Eklendi: " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		System.out.println("��retmen Eklendi: " + user.getFirstName());

	}

	@Override
	public void update(User user) {
		System.out.println("��retmen G�ncellendi:  " + user.getFirstName());

	}

	public void instructorInformation(Instructor instructor) {
		System.out.println("��retmen Bilgileri: " + instructor.getFirstName() + " " + instructor.getLastName() + " "
				+ instructor.getNationalityId() + " " + instructor.getYearOfBirth() + " "
				+ instructor.getInstructorKullaniciAd�() + " " + instructor.getInstructorPassword());
	}

}
