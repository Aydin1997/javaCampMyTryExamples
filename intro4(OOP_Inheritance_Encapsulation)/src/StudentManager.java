
public class StudentManager extends BaseUserManager {

	@Override
	public void add(User user) {
		System.out.println("Öðrenci Eklendi: " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Öðrenci Silindi: " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void update(User user) {
		System.out.println("Öðrenci Güncellendi: " + user.getFirstName() + " " + user.getLastName());

	}

	public void informationStudent(Student student) {
		System.out.println("Öðrenci Bilgileri: " + student.getFirstName() + " " + student.getLastName() + " "
				+ student.getNationalityId() + " " + student.getYearOfBirth() + " " + student.getStudentKullaniciAdý()
				+ " " + student.getStudentPassword());
	}

	public void informationStudent(Student[] student) {
		for (Student students : student) {
			System.out.println("\nÝsim:" + students.getFirstName() + "\n" + "Soyisim:" + students.getLastName() + "\n"
					+ "TC:" + students.getNationalityId() + "\n" + "Doðum Yýlý:" + students.getYearOfBirth() + "\n"
					+ "Kullanýcý Adý:" + students.getStudentKullaniciAdý() + "\n" + "Þifre:"+ students.getStudentPassword());
		}
	}
}
