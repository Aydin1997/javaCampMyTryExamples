
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1=new Instructor("sifre123241","Eren","Şimşek","123@gmail.com",15);
		
		InstructorManager instructorManager=new InstructorManager(new SmsLogger());
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		instructorManager.update(instructor1);
		System.out.println("--------------------------------------------------------------");
		instructorManager.registerInstructor(instructor1);
		
		System.out.println("--------------------------------------------------------------");
		
		Student student1=new Student("1231","Aydın","Şimşek","simsekaydin01@",23);
		
		StudentManager studentManager=new StudentManager(new SmsLogger());
		studentManager.add(student1);
		studentManager.delete(student1);
		studentManager.update(student1);
		System.out.println("--------------------------------------------------------------");
		studentManager.registerStudent(student1);

	}

}
