package intro7_MultiplyInterface;
//Kendi Firma calisanimiz

public class Worker implements WorkService, EatService, PayService {

	@Override
	public void work() {
		System.out.println("Kendi Firma Çalýþanýmýz Çalýþma Saatleri\n08.00-18.00");
	}

	@Override
	public void eat() {
		System.out.println("Kendi Firmamýz Çalýþanýmýza Yemek veriyor");

	}

	@Override
	public void pay() {
		System.out.println("Kendi Firma Çalýþanýmýz Ücreti: 500TL");

	}

}
