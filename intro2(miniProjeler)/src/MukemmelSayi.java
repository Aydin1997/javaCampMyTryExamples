import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		
		System.out.println("M�kemmel Say� Uygulamama Ho�geldiniz!!");
		
		// Kendisi hari� b�t�n pozitif b�lenlerinin toplam� kendisine e�it olan say�lara m�kemmel say� denir.

		Scanner scan=new Scanner(System.in);
		System.out.println("Say�:");
		long sayi=scan.nextLong(); // Kullan�c�dan Say� Al�nd�!
		
		long total=0; // Total'� tutacak de�i�ken
		
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				total+=i;
				System.out.println("B�lenleri:"+i);
				
			}
		}
		
		if(total==sayi) {
			System.out.println("B�lenlerin Toplam�:"+total);
			System.out.println("M�kemmel Say�d�r!!");
		}else {
			System.out.println("M�kemmel Say� De�ildir!!");
		}
	
	}

}
