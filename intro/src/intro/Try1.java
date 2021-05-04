package intro;

public class Try1 {

	public static void main(String[] args) {
		
		//IF-ELSE IF-ELSE ÖRNEK
		
		// Ehliyet alma koþulu en az 18 yaþ ve eðitim durumu lise veya üniversite olmalýdýr.
		
		int age=19;
		String education="lise";
		
		
		if(age>18) {
			if(education=="lise" || education=="üniversite") {
				System.out.println("Ehliyet alabilirsiniz!!");
				
			}else {
				System.out.println("Eðitim Durumunuzdan Dolayý Ehliyet Alamazsýnýz!!");
			}
		
		}else {
			System.out.println("Maalesef Yaþýnýz 18'in altýnda\nEhliyet alamazsýnýz!");
		}
	
		System.out.println("---------------------------------------------------------------");
		
		// Bir Sayýnýn 0-100 arasýnda olup olmadýðýný kontrol etmek.
		
		int sayi=-3;
		
		if(sayi>0 || sayi<100) {
			System.out.println("Sayýnýz 0-100 arasýndadýr!!");
		}else {
			System.out.println("Sayý 0-100 arasýnda deðildir!!");
		}
		
		System.out.println("---------------------------------------------------------------");
		
		// Bir sayýnýn pozitif çift sayý olma durumunu inceleyiniz.
		
		int sayi2=16;
		
		if(sayi2>0) {
			if(sayi2%2==0) {
				System.out.println("POZÝTÝF ÇÝFT");
			}else {
				System.out.println("POZÝTÝF TEK");
			}
		}else {
			System.out.println("SAYI NEGATÝF");
		}
		System.out.println("---------------------------------------------------------------");
		
		// 2 vize(%60) ve final(%40) notunu alýp ortalamayý hesaplayýnýz .
		// Eðer ortalama 50 ve üstündeyse geçti deðilse kaldý yazdýrýnýz.

		// a)Ortalama 50 ve üstü olsa bile final notu en az 50 olmalýdýr.
		// b)Finalden 70 alýnýrsa ortalamanýn bir önemi olmasýn.
		
		int vize1=100;
		int vize2=90;
		int Final=55;
		
		int vize1Average=(vize1*30)/100;
		int vize2Average=(vize2*30)/100;
		int FinalAverage=(Final*40)/100;
		int total=vize1Average+vize2Average+FinalAverage;
		
		if(total>=50) {
			if(Final>50) {
				System.out.println("GEÇTÝNÝZ!");
			}else {
				System.out.println("Final Notunuz 50'den düþük olduðu için kaldýnýz!");
			}
		}else {
			if(Final>70) {
				System.out.println("Final notunuz 70 üstü olduðu geçtiniz!!");
			}else {
				System.out.println("Kaldýnýz!!");
			}
		}
	
		
	}
	
	

}
