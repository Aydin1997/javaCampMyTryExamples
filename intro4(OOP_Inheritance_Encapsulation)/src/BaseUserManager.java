
public class BaseUserManager {

	// Bu BaseUserManager classýmýz'da Managerlar içerisinde ki ana class'ýmýz ve
	// burada yazýlan metotlar override edilecek.
	// Bu metotlarýn parametrelerine User verilme sebebi ise User'da ana class
	// olduðu için ondan inherit eden tüm sýnýflar o özelliði kullanabilecek.

	public void add(User user) {
		System.out.println("Ana Sistemden Kullanýcý getirildi: " + user.getFirstName());
	}

	public void delete(User user) {
		System.out.println("Ana Sistemden Kullanýcý silindi: " + user.getFirstName());

	}

	public void update(User user) {
		System.out.println("Ana Sistemde Kullanýcý güncellendi: " + user.getFirstName());

	}
}
