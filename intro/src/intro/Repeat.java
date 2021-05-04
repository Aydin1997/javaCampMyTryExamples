package intro;

public class Repeat {

	public static void main(String[] args) {
		
		System.out.println("Hello World\n");
		
		String name="Aydýn";
		int age =23; // Tam Sayý
		double weight=52.1; // Ondalýklý Sayý
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
		
		System.out.println(a==b); // Eþit mi?
		System.out.println(a!=b); // Eþit Deðil mi?
		System.out.println(a>b);  // Büyük mü?
		System.out.println(a<b);  // Küçük mü?
		System.out.println(a>=b); // Büyük Eþit mi?
		System.out.println(a<=b); // Küçük Eþit mi?
		
		// 4)Java Logical Operators
		
		int f=10;
		System.out.println("\n");
		
		System.out.println(f>0 && f%2==0); // && => And komutu
		System.out.println(f<0 || f%2==0); // || => Or komutu
		System.out.println(!(f>0 && f%2==0)); // ! => not komutu
		
		
		
		
	
	}

}
