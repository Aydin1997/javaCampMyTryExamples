
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

}
