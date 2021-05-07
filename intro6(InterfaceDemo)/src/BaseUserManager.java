
public class BaseUserManager implements UserService{

	@Override
	public void add(User user) {
		System.out.println("User Eklendi: "+user.getFirstName());
	}

	@Override
	public void delete(User user) {
		System.out.println("User Silindi: "+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("User Güncellendi: "+user.getFirstName());
		
	}

}
