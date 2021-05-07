package intro7_MultiplyInterface;

public class Main {

	public static void main(String[] args) {
		
		Worker worker=new Worker();
		WorkerDifference workerDifference=new WorkerDifference();
		
		worker.eat();
		//workerDifference.eat(); Dýþarý çalýþanýna yemek verilmediði için implemente etmemiþtik!
		
		workerDifference.pay();
		worker.pay();

	}

}
