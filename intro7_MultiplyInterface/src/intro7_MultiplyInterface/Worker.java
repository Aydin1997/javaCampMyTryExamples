package intro7_MultiplyInterface;
//Kendi Firma calisanimiz

public class Worker implements WorkService, EatService, PayService {

	@Override
	public void work() {
		System.out.println("Kendi Firma �al��an�m�z �al��ma Saatleri\n08.00-18.00");
	}

	@Override
	public void eat() {
		System.out.println("Kendi Firmam�z �al��an�m�za Yemek veriyor");

	}

	@Override
	public void pay() {
		System.out.println("Kendi Firma �al��an�m�z �creti: 500TL");

	}

}
