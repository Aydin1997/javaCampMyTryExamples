package intro7_MultiplyInterface;

//Farkli Firma Calisani

public class WorkerDifference implements WorkService, PayService {

	@Override
	public void work() {
		System.out.println("Farkl� Firma �al��an� �al��ma Saatleri\n08.00-15.00");

	}

	// Farkl� Firma �al��an�na yemek verilmedi�i i�in EatService implement etmedik.

	@Override
	public void pay() {
		System.out.println("Farkl� Firma �al��an� maa��:250TL");
	}

}
