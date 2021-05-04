import java.util.Scanner;

public class ArkadasSayilar {

	public static void main(String[] args) {
		System.out.println("Arkadaþ Sayýlarý uygulamama hoþgeldiniz!");
		//Ýki sayý birbirinin kendisi hariç bölenleri toplamýna eþitse bu sayýlara arkadaþ sayýlar denir.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayý1:");
		long sayi1=scan.nextLong();
		System.out.println("Sayý2:");
		long sayi2=scan.nextLong();
		
		int total1=0; // Ýlk sayýnýn bölenleri toplamý tutacak!
		int total2=0; // Ýkinci sayýnýn bölenleri toplamý tutacak!
		
		
		for(int i=1;i<sayi1;i++) { // Ýlk sayýnýn bölenlerini tutar!
			if(sayi1%i==0) {
				total1+=i;
			}
		}
		
		for (int j=1;j<sayi2;j++) { // Ýkinci sayýnýn bölenlerini tutar!
			if(sayi2%j==0) {
				total2+=j;
			}
		}
		
		if(sayi1==total2 && sayi2==total1 ) {
			System.out.println("Arkadaþ Sayýlardýr!!");
		}else {
			System.out.println("Arkadaþ Sayý Deðil!!");
		}
	}

}
