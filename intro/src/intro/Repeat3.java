package intro;

public class Repeat3 {

	public static void main(String[] args) {
		
		// DÖNGÜLER
		
		// For Döngüsü
		
		for (int i=0;i<100;i++) {
			System.out.println(i);
		}
		System.out.println("\n");
		
		// For-Each Döngüsü
		
		String[] bestFriendsNames= {
				"Ümit",
				"Tuðba",
				"Berker",
				"Ýsmail",
				"Aytek",
				"Mert"
		};
		
		for(String names:bestFriendsNames) {
			System.out.println(names);
		}
		System.out.println("\n");
		
		// Klasik for mantýðý ile de yazýlabilirdi ama Arraylari genel olarak For-Each yazmak daha mantýklý!
		for (int i=0;i<bestFriendsNames.length;i++) {
			System.out.println(bestFriendsNames[i]);
			
		}
		System.out.println("\n");
		
		// While Döngüsü
		
		int i=0;
		
		while(i<5) {
			System.out.println(i);
			i++;
			
		}
		
		
	}

}
