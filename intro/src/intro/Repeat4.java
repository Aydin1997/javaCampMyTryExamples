package intro;

public class Repeat4 {

	public static void main(String[] args) {
		
		// ARRAY
		
		String[] cars= {"Mazda","Volvo","BMW","Ford"}; // ��erisinde ki elemanlar d�ng� ile dola��l�r!!
		
		for(String car:cars) {
			System.out.println(car);
		}
		System.out.println("\n");
		int[] numbers= {1,2,3,4,5};
		
		for(int num:numbers) {
			System.out.println(num);
		}
		
		// Array i�erisinde ki istedi�imiz index i�erisinde ki eleman� de�i�tirebiliriz!
		System.out.println("\n");
		cars[0]="Opel";
		System.out.println(cars[0]);
		
		// Array uzunlu�u length komutu ile bulunur.
		System.out.println("\n");
		System.out.println(numbers.length);
		
		// Multi ARRAY
		System.out.println("\n");
		int[][] sayilar= {{1,2,3},{4,5,6}};
		
		System.out.println(sayilar[0][1]); // 0.indexte ki arraydan 1. eleman� al demek.
		System.out.println("\n");
		
		String[][] cities= {{"Adana","Mersin","Antalya"},
				{"Ankara","Eski�ehir","Konya"},
				{"�stanbul","Bursa","D�zce"}
				};
	
		for(int i=0;i<3;i++) { // ��-i�e for d�ng�s� ile t�m elemanlar� gezebiliriz.
			
			for(int j=0;j<3;j++) {
				System.out.println(cities[i][j]);	
				}
					
			}
		System.out.println("\n");
		
		int[][] oddEven= {{1,3,5},{2,4,6}};
			
			for(int i=0;i<2;i++) {
				for(int j=0;j<=2;j++) {
					System.out.println(oddEven[i][j]);
					}
			}
		
		
		}
	
	
	}


