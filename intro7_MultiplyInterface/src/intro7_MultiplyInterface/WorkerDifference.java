package intro7_MultiplyInterface;

//Farkli Firma Calisani

public class WorkerDifference implements WorkService, PayService {

	@Override
	public void work() {
		System.out.println("Farklý Firma Çalýþaný Çalýþma Saatleri\n08.00-15.00");

	}

	// Farklý Firma Çalýþanýna yemek verilmediði için EatService implement etmedik.

	@Override
	public void pay() {
		System.out.println("Farklý Firma Çalýþaný maaþý:250TL");
	}

}
