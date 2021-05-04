
public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Aydın", "Şimşek", "123456", 1997, "kullanici1", "password1");
		Student student2 = new Student("Eren", "Şimşek", "114477", 2005, "kullanici2", "password2");
		Student[] students = { student1, student2 };

		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.delete(student1);
		studentManager.update(student1);
		studentManager.informationStudent(student1);
		studentManager.informationStudent(students);

		System.out.println("------------------------------------------------------------------------");

		StudentManager studentManager2 = new StudentManager();
		studentManager2.add(student2);
		studentManager2.delete(student2);
		studentManager2.update(student1);

		System.out.println("------------------------------------------------------------------------");

		Instructor instructor1 = new Instructor("Engin", "Demiroğ", "112233", 1985, "kullanici3", "password3");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		instructorManager.update(instructor1);
		instructorManager.instructorInformation(instructor1);

		System.out.println("------------------------------------------------------------------------");

		BaseUserManager baseUserManager = new BaseUserManager();
		baseUserManager.add(student1);
		baseUserManager.delete(student2);
		baseUserManager.update(instructor1);

	}

}
