
public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar= {1,2,5,7,9,0};
		int aranacak=1;
		boolean varMi=false;
		
		for(int sayi:sayilar) {
			if(aranacak==sayi) {
				varMi=true;
				break; // Eðer sayý varsa break komutu ile durdururuz!!
			}
		}
		if(varMi==true) {
			System.out.println("VAR");
		}else {
			System.out.println("YOK");
		}
		
	System.out.println();
	}
}


