
public class StudentManager extends BaseUserManager {

	@Override
	public void add(User user) {
		System.out.println("��renci Eklendi: " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void delete(User user) {
		System.out.println("��renci Silindi: " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void update(User user) {
		System.out.println("��renci G�ncellendi: " + user.getFirstName() + " " + user.getLastName());

	}

	public void informationStudent(Student student) {
		System.out.println("��renci Bilgileri: " + student.getFirstName() + " " + student.getLastName() + " "
				+ student.getNationalityId() + " " + student.getYearOfBirth() + " " + student.getStudentKullaniciAd�()
				+ " " + student.getStudentPassword());
	}

	public void informationStudent(Student[] student) {
		for (Student students : student) {
			System.out.println("\n�sim:" + students.getFirstName() + "\n" + "Soyisim:" + students.getLastName() + "\n"
					+ "TC:" + students.getNationalityId() + "\n" + "Do�um Y�l�:" + students.getYearOfBirth() + "\n"
					+ "Kullan�c� Ad�:" + students.getStudentKullaniciAd�() + "\n" + "�ifre:"+ students.getStudentPassword());
		}
	}
}
