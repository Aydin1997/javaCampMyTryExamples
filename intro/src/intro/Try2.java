package intro;

public class Try2 {

	public static void main(String[] args) {
		// FOR - FOR EACH �RNEK
		// WH�LE �RNEK
		
		int[] sayi= {1,2,3,5,6,9,12,216,1003,99};
		
		// Hangi say�lar 3'�n kat�d�r. Ekrana Yazd�r.
		
		// FOR-EACH 
		for(int sayilar:sayi) {
			if (sayilar%3==0) {
				System.out.println(sayilar);
			}
		}
		// KLAS�K FOR 
		for(int i=0;i<sayi.length;i++) {
			if(sayi[i]%3==0) {
				System.out.println(sayi[i]);
			}
		}
	
		System.out.println("---------------------------------------------------------------");
		
		// Listede ki say�lar�n toplam� ka�t�r?
		int total=0;
		
		for(int sayilar:sayi) {
			total+=sayilar;
		}
		System.out.println("Say�lar�n Toplam�:"+total);
		
		System.out.println("---------------------------------------------------------------");
		
		// Listede ki say�lardan TEK say� olanlar�n KARE'si al�n
		
		for(int sayilar:sayi) {
			if(sayilar%2==1) {
				System.out.println(sayilar*sayilar);
			}
		}

		System.out.println("---------------------------------------------------------------");
		
		String[] sehirler= {"Adana","Ankara","Eski�ehir","�stanbul","Rize","Ordu"};
		
		//Sehirlerden en fazla 5 karakter olan�n� ekrana yazd�r
		
		for(String sehir:sehirler) {
			if(sehir.length()<=5) {
				System.out.println(sehir);
			}
		}
		
		System.out.println("---------------------------------------------------------------");
		
		// While D�ng�s�
		
				int i=0;
				
				while(i<5) {
					System.out.println(i);
					i++;
	
	
	
				}
	
		// 0-100 aras�nda ki say�lar� azalan �ekilde ekrana while d�ng�s� ile yazd�r�n.
		
			System.out.println("---------------------------------------------------------------");
			int z=100;
			
			while(z>0) {
				System.out.println(z);
				z--;
			}
			
			
			
				
	
				
				
				
				
				
				
				
	}
	}
