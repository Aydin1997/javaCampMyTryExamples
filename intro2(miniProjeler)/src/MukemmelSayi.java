import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		
		System.out.println("Mükemmel Sayý Uygulamama Hoþgeldiniz!!");
		
		// Kendisi hariç bütün pozitif bölenlerinin toplamý kendisine eþit olan sayýlara mükemmel sayý denir.

		Scanner scan=new Scanner(System.in);
		System.out.println("Sayý:");
		long sayi=scan.nextLong(); // Kullanýcýdan Sayý Alýndý!
		
		long total=0; // Total'ý tutacak deðiþken
		
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				total+=i;
				System.out.println("Bölenleri:"+i);
				
			}
		}
		
		if(total==sayi) {
			System.out.println("Bölenlerin Toplamý:"+total);
			System.out.println("Mükemmel Sayýdýr!!");
		}else {
			System.out.println("Mükemmel Sayý Deðildir!!");
		}
	
	}

}
