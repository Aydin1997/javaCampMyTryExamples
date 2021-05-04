import java.util.Scanner;

public class ArkadasSayilar {

	public static void main(String[] args) {
		System.out.println("Arkada� Say�lar� uygulamama ho�geldiniz!");
		//�ki say� birbirinin kendisi hari� b�lenleri toplam�na e�itse bu say�lara arkada� say�lar denir.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Say�1:");
		long sayi1=scan.nextLong();
		System.out.println("Say�2:");
		long sayi2=scan.nextLong();
		
		int total1=0; // �lk say�n�n b�lenleri toplam� tutacak!
		int total2=0; // �kinci say�n�n b�lenleri toplam� tutacak!
		
		
		for(int i=1;i<sayi1;i++) { // �lk say�n�n b�lenlerini tutar!
			if(sayi1%i==0) {
				total1+=i;
			}
		}
		
		for (int j=1;j<sayi2;j++) { // �kinci say�n�n b�lenlerini tutar!
			if(sayi2%j==0) {
				total2+=j;
			}
		}
		
		if(sayi1==total2 && sayi2==total1 ) {
			System.out.println("Arkada� Say�lard�r!!");
		}else {
			System.out.println("Arkada� Say� De�il!!");
		}
	}

}
