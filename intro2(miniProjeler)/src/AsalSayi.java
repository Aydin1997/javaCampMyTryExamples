import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
		
		System.out.println("Asal Say� Bulma Koduma Ho�geldiniz!!");
		
		//Kullan�c�dan input al�nd�!
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Say�:");
		int sayi=scan.nextInt();
		
		boolean asalMi=true;
		
		if (sayi==1) { 	// 1 Asal Say� De�ildir.
			System.out.println("Asal Say� De�ildir!");
			return; // Return komutu ile direkt main Class'� durdurduk i�leme devam etmiyor!
		}
		
		if(sayi<0) {  // Kullan�c� negatif say� girince hata versin.
			System.out.println("Ge�ersiz Say�");
			return;
		}
		
		for(int i=2;i<sayi;i++) {
			if(sayi%i==0) {
				asalMi=false;
			}
		}
		
		if(asalMi) {
			System.out.println("Girilen Say� Asal Say�d�r!!");
			
		}else {
			System.out.println("Asal Say� DE��L!");
		}
		
		
		
	}

}
