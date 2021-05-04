import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
		
		System.out.println("Asal Sayý Bulma Koduma Hoþgeldiniz!!");
		
		//Kullanýcýdan input alýndý!
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayý:");
		int sayi=scan.nextInt();
		
		boolean asalMi=true;
		
		if (sayi==1) { 	// 1 Asal Sayý Deðildir.
			System.out.println("Asal Sayý Deðildir!");
			return; // Return komutu ile direkt main Class'ý durdurduk iþleme devam etmiyor!
		}
		
		if(sayi<0) {  // Kullanýcý negatif sayý girince hata versin.
			System.out.println("Geçersiz Sayý");
			return;
		}
		
		for(int i=2;i<sayi;i++) {
			if(sayi%i==0) {
				asalMi=false;
			}
		}
		
		if(asalMi) {
			System.out.println("Girilen Sayý Asal Sayýdýr!!");
			
		}else {
			System.out.println("Asal Sayý DEÐÝL!");
		}
		
		
		
	}

}
