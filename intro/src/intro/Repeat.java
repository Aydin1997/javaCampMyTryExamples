package intro;

public class Repeat {

	public static void main(String[] args) {
		
		System.out.println("Hello World\n");
		
		String name="Ayd�n";
		int age =23; // Tam Say�
		double weight=52.1; // Ondal�kl� Say�
		char firstLetter='A'; // Tek Karakter 
		boolean nameIsTrue=true; // True(1),False(0)
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(firstLetter);
		System.out.println(nameIsTrue + "\n");
		
		//OPERATORS
		
		// 1)Arithmetic Operators
		
		int x=10;
		int y=4;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y+"\n");
		
		// 2)Assignment Operators
		
		int z=12;
		System.out.println(z+=3); // z=z+3 
		System.out.println(z-=3); // z=z-3
		System.out.println(z*=3); // z=z*3
		System.out.println(z/=3); // z=z/3
		System.out.println(z%=3); // z=z%3
		
		// 3)Comparison Operators
		
		int a=1;
		int b=2;
		System.out.println("\n");
		
		System.out.println(a==b); // E�it mi?
		System.out.println(a!=b); // E�it De�il mi?
		System.out.println(a>b);  // B�y�k m�?
		System.out.println(a<b);  // K���k m�?
		System.out.println(a>=b); // B�y�k E�it mi?
		System.out.println(a<=b); // K���k E�it mi?
		
		// 4)Java Logical Operators
		
		int f=10;
		System.out.println("\n");
		
		System.out.println(f>0 && f%2==0); // && => And komutu
		System.out.println(f<0 || f%2==0); // || => Or komutu
		System.out.println(!(f>0 && f%2==0)); // ! => not komutu
		
		
		
		
	
	}

}
