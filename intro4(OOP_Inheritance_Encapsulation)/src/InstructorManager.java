
public class InstructorManager extends BaseUserManager{
	
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


}
