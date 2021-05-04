
public class Main {

	public static void main(String[] args) {
		
		// �nemli Not:Bir Class �al��mas� i�in kesinlikle ama kesinlikle 'new'lenmesi gerekir!!
		Product product1=new Product();
		// Default Constructor ile �r�nlerimizi olu�turabiliriz.
		product1.id=0001;
		product1.name="Asus 1";
		product1.price=5000;
		product1.detail="4GB Ram";
		
		// OverLoading ile olu�turulan Constructor Blo�u.
		Product product2=new Product(0002,"�im Bi�me Makinesi",3500,"100Hp G�c�nde");
		Product product3=new Product(0003,"Iphone 11",10000,"128GB Ram");
		
		// �r�nlerimizi Array i�erisine at�p For-Each ile Gezebiliriz.
		Product[] products= {product1,product2,product3};
	
		for(Product product:products) {
			
			System.out.println("\nID:"+product.id);
			System.out.println("Name:"+product.name);
			System.out.println("Price:"+product.price);
			System.out.println("Detail:"+product.detail);
		}
		
		Category category1=new Category("Bilgisayar");
		Category category2=new Category("Ev/Bah�e");
		Category category3=new Category("Telefon");
		
		System.out.println("\n");
		ProductManager productManager1=new ProductManager();
		ProductManager productManager2=new ProductManager();
		ProductManager productManager3=new ProductManager();
		
		productManager1.addToCart(product1, category1);
		productManager2.addToCart(product2, category2);
		productManager3.addToCart(product3, category3);
		
		productManager1.removeProduct(product1);
		
		
	
	
	
	
	
	}

}
