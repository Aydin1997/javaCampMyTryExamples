package intro;

public class Try1 {

	public static void main(String[] args) {
		
		//IF-ELSE IF-ELSE �RNEK
		
		// Ehliyet alma ko�ulu en az 18 ya� ve e�itim durumu lise veya �niversite olmal�d�r.
		
		int age=19;
		String education="lise";
		
		
		if(age>18) {
			if(education=="lise" || education=="�niversite") {
				System.out.println("Ehliyet alabilirsiniz!!");
				
			}else {
				System.out.println("E�itim Durumunuzdan Dolay� Ehliyet Alamazs�n�z!!");
			}
		
		}else {
			System.out.println("Maalesef Ya��n�z 18'in alt�nda\nEhliyet alamazs�n�z!");
		}
	
		System.out.println("---------------------------------------------------------------");
		
		// Bir Say�n�n 0-100 aras�nda olup olmad���n� kontrol etmek.
		
		int sayi=-3;
		
		if(sayi>0 || sayi<100) {
			System.out.println("Say�n�z 0-100 aras�ndad�r!!");
		}else {
			System.out.println("Say� 0-100 aras�nda de�ildir!!");
		}
		
		System.out.println("---------------------------------------------------------------");
		
		// Bir say�n�n pozitif �ift say� olma durumunu inceleyiniz.
		
		int sayi2=16;
		
		if(sayi2>0) {
			if(sayi2%2==0) {
				System.out.println("POZ�T�F ��FT");
			}else {
				System.out.println("POZ�T�F TEK");
			}
		}else {
			System.out.println("SAYI NEGAT�F");
		}
		System.out.println("---------------------------------------------------------------");
		
		// 2 vize(%60) ve final(%40) notunu al�p ortalamay� hesaplay�n�z .
		// E�er ortalama 50 ve �st�ndeyse ge�ti de�ilse kald� yazd�r�n�z.

		// a)Ortalama 50 ve �st� olsa bile final notu en az 50 olmal�d�r.
		// b)Finalden 70 al�n�rsa ortalaman�n bir �nemi olmas�n.
		
		int vize1=100;
		int vize2=90;
		int Final=55;
		
		int vize1Average=(vize1*30)/100;
		int vize2Average=(vize2*30)/100;
		int FinalAverage=(Final*40)/100;
		int total=vize1Average+vize2Average+FinalAverage;
		
		if(total>=50) {
			if(Final>50) {
				System.out.println("GE�T�N�Z!");
			}else {
				System.out.println("Final Notunuz 50'den d���k oldu�u i�in kald�n�z!");
			}
		}else {
			if(Final>70) {
				System.out.println("Final notunuz 70 �st� oldu�u ge�tiniz!!");
			}else {
				System.out.println("Kald�n�z!!");
			}
		}
	
		
	}
	
	

}
