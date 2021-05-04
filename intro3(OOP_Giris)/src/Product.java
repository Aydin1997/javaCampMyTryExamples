
public class Product {
	// Özellik tutan Class!!
	long id;
	String name;
	int price;
	String detail;
	

	
	public Product() {
		System.out.println("Default Constructor Calisti!");
	}
	
	public Product(long id,String name,int price,String detail) { // Yapýcý Constructor ve OverLoading
																	
		this.id=id;
		this.name=name;
		this.price=price;
		this.detail=detail;
		
	}
}
