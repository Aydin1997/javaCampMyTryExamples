
public class BaseUserManager {

	// Bu BaseUserManager class�m�z'da Managerlar i�erisinde ki ana class'�m�z ve
	// burada yaz�lan metotlar override edilecek.
	// Bu metotlar�n parametrelerine User verilme sebebi ise User'da ana class
	// oldu�u i�in ondan inherit eden t�m s�n�flar o �zelli�i kullanabilecek.

	public void add(User user) {
		System.out.println("Ana Sistemden Kullan�c� getirildi: " + user.getFirstName());
	}

	public void delete(User user) {
		System.out.println("Ana Sistemden Kullan�c� silindi: " + user.getFirstName());

	}

	public void update(User user) {
		System.out.println("Ana Sistemde Kullan�c� g�ncellendi: " + user.getFirstName());

	}
}
