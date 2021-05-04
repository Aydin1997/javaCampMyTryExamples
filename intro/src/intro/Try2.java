package intro;

public class Try2 {

	public static void main(String[] args) {
		// FOR - FOR EACH ÖRNEK
		// WHÝLE ÖRNEK
		
		int[] sayi= {1,2,3,5,6,9,12,216,1003,99};
		
		// Hangi sayýlar 3'ün katýdýr. Ekrana Yazdýr.
		
		// FOR-EACH 
		for(int sayilar:sayi) {
			if (sayilar%3==0) {
				System.out.println(sayilar);
			}
		}
		// KLASÝK FOR 
		for(int i=0;i<sayi.length;i++) {
			if(sayi[i]%3==0) {
				System.out.println(sayi[i]);
			}
		}
	
		System.out.println("---------------------------------------------------------------");
		
		// Listede ki sayýlarýn toplamý kaçtýr?
		int total=0;
		
		for(int sayilar:sayi) {
			total+=sayilar;
		}
		System.out.println("Sayýlarýn Toplamý:"+total);
		
		System.out.println("---------------------------------------------------------------");
		
		// Listede ki sayýlardan TEK sayý olanlarýn KARE'si alýn
		
		for(int sayilar:sayi) {
			if(sayilar%2==1) {
				System.out.println(sayilar*sayilar);
			}
		}

		System.out.println("---------------------------------------------------------------");
		
		String[] sehirler= {"Adana","Ankara","Eskiþehir","Ýstanbul","Rize","Ordu"};
		
		//Sehirlerden en fazla 5 karakter olanýný ekrana yazdýr
		
		for(String sehir:sehirler) {
			if(sehir.length()<=5) {
				System.out.println(sehir);
			}
		}
		
		System.out.println("---------------------------------------------------------------");
		
		// While Döngüsü
		
				int i=0;
				
				while(i<5) {
					System.out.println(i);
					i++;
	
	
	
				}
	
		// 0-100 arasýnda ki sayýlarý azalan þekilde ekrana while döngüsü ile yazdýrýn.
		
			System.out.println("---------------------------------------------------------------");
			int z=100;
			
			while(z>0) {
				System.out.println(z);
				z--;
			}
			
			
			
				
	
				
				
				
				
				
				
				
	}
	}
