package intro;

public class Repeat3 {

	public static void main(String[] args) {
		
		// D�NG�LER
		
		// For D�ng�s�
		
		for (int i=0;i<100;i++) {
			System.out.println(i);
		}
		System.out.println("\n");
		
		// For-Each D�ng�s�
		
		String[] bestFriendsNames= {
				"�mit",
				"Tu�ba",
				"Berker",
				"�smail",
				"Aytek",
				"Mert"
		};
		
		for(String names:bestFriendsNames) {
			System.out.println(names);
		}
		System.out.println("\n");
		
		// Klasik for mant��� ile de yaz�labilirdi ama Arraylari genel olarak For-Each yazmak daha mant�kl�!
		for (int i=0;i<bestFriendsNames.length;i++) {
			System.out.println(bestFriendsNames[i]);
			
		}
		System.out.println("\n");
		
		// While D�ng�s�
		
		int i=0;
		
		while(i<5) {
			System.out.println(i);
			i++;
			
		}
		
		
	}

}
