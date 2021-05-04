package intro;

public class Repeat2 {

	public static void main(String[] args) {
		
		// Şart Blokları (if-else-else if)
		
		double oldDollar=8.07;
		double newDollar=8.08;
		String increase="Dolar Yükseldi!";
		String decrease="Dolar Düştü!";
		String equal="Dolar Sabit Kaldı!";
		
		if(oldDollar>newDollar) {
			System.out.println(decrease);
		}else if(newDollar>oldDollar) {
			System.out.println(increase);
			}else {
				System.out.println(equal);
			}
		
		System.out.println("\nSayıları Büyükten Küçüğe Sıralama.");
		
		double sayi1=-12;
		double sayi2=-33;
		double sayi3=-7.3;
		
		
			
			if((sayi1>sayi2 && sayi1>sayi3) && (sayi2>sayi3)) { //Sayi1'in en büyük olduğu kod blokları
				System.out.println(sayi1+">"+sayi2+">"+sayi3);
			}else if((sayi1>sayi2 && sayi1>sayi3) && (sayi2<sayi3)) {
				System.out.println(sayi1+">"+sayi3+">"+sayi2);
			}else if((sayi1>sayi2 && sayi1>sayi3) && (sayi2==sayi3)) {
				System.out.println(sayi1+">"+sayi2+"="+sayi3);
			} 
			
			else if((sayi2>sayi1 && sayi2>sayi3) && (sayi1>sayi3)) { //Sayi2'nin en büyük olduğu kod blokları
				System.out.println(sayi2+">"+sayi1+">"+sayi3);
				}else if((sayi2>sayi1 && sayi2>sayi3) && (sayi3>sayi1)) {
					System.out.println(sayi2+">"+sayi3+">"+sayi1);
				}else if((sayi2>sayi1 && sayi2>sayi3) && (sayi3==sayi1)) {
					System.out.println(sayi2+">"+sayi3+"="+sayi1);
				}
				
			else if((sayi3>sayi1 && sayi3>sayi2) && (sayi1>sayi2)) {  //Sayi3'ün en büyük olduğu kod blokları
				System.out.println(sayi3+">"+sayi1+">"+sayi2);
				}else if((sayi3>sayi1 && sayi3>sayi2) && (sayi2>sayi1)) {
					System.out.println(sayi3+">"+sayi2+">"+sayi1);
				}else if((sayi3>sayi1 && sayi3>sayi2) && (sayi2==sayi1)) {
					System.out.println(sayi3+">"+sayi2+"="+sayi1);
				}
		}		
		
		
	
	}


