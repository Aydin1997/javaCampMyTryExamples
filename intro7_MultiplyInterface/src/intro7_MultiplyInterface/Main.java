package intro7_MultiplyInterface;

public class Main {

	public static void main(String[] args) {
		
		Worker worker=new Worker();
		WorkerDifference workerDifference=new WorkerDifference();
		
		worker.eat();
		//workerDifference.eat(); D��ar� �al��an�na yemek verilmedi�i i�in implemente etmemi�tik!
		
		workerDifference.pay();
		worker.pay();

	}

}
