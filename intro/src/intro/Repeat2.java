package intro;

public class Repeat2 {

	public static void main(String[] args) {
		
		// �art Bloklar� (if-else-else if)
		
		double oldDollar=8.07;
		double newDollar=8.08;
		String increase="Dolar Y�kseldi!";
		String decrease="Dolar D��t�!";
		String equal="Dolar Sabit Kald�!";
		
		if(oldDollar>newDollar) {
			System.out.println(decrease);
		}else if(newDollar>oldDollar) {
			System.out.println(increase);
			}else {
				System.out.println(equal);
			}
		
		System.out.println("\nSay�lar� B�y�kten K����e S�ralama.");
		
		double sayi1=-12;
		double sayi2=-33;
		double sayi3=-7.3;
		
		
			
			if((sayi1>sayi2 && sayi1>sayi3) && (sayi2>sayi3)) { //Sayi1'in en b�y�k oldu�u kod bloklar�
				System.out.println(sayi1+">"+sayi2+">"+sayi3);
			}else if((sayi1>sayi2 && sayi1>sayi3) && (sayi2<sayi3)) {
				System.out.println(sayi1+">"+sayi3+">"+sayi2);
			}else if((sayi1>sayi2 && sayi1>sayi3) && (sayi2==sayi3)) {
				System.out.println(sayi1+">"+sayi2+"="+sayi3);
			} 
			
			else if((sayi2>sayi1 && sayi2>sayi3) && (sayi1>sayi3)) { //Sayi2'nin en b�y�k oldu�u kod bloklar�
				System.out.println(sayi2+">"+sayi1+">"+sayi3);
				}else if((sayi2>sayi1 && sayi2>sayi3) && (sayi3>sayi1)) {
					System.out.println(sayi2+">"+sayi3+">"+sayi1);
				}else if((sayi2>sayi1 && sayi2>sayi3) && (sayi3==sayi1)) {
					System.out.println(sayi2+">"+sayi3+"="+sayi1);
				}
				
			else if((sayi3>sayi1 && sayi3>sayi2) && (sayi1>sayi2)) {  //Sayi3'�n en b�y�k oldu�u kod bloklar�
				System.out.println(sayi3+">"+sayi1+">"+sayi2);
				}else if((sayi3>sayi1 && sayi3>sayi2) && (sayi2>sayi1)) {
					System.out.println(sayi3+">"+sayi2+">"+sayi1);
				}else if((sayi3>sayi1 && sayi3>sayi2) && (sayi2==sayi1)) {
					System.out.println(sayi3+">"+sayi2+"="+sayi1);
				}
		}		
		
		
	
	}


