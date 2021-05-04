
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

}
