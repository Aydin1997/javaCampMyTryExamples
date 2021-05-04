
public class Main {

	public static void main(String[] args) {
		
		// Önemli Not:Bir Class çalýþmasý için kesinlikle ama kesinlikle 'new'lenmesi gerekir!!
		Product product1=new Product();
		// Default Constructor ile ürünlerimizi oluþturabiliriz.
		product1.id=0001;
		product1.name="Asus 1";
		product1.price=5000;
		product1.detail="4GB Ram";
		
		// OverLoading ile oluþturulan Constructor Bloðu.
		Product product2=new Product(0002,"Çim Biçme Makinesi",3500,"100Hp Gücünde");
		Product product3=new Product(0003,"Iphone 11",10000,"128GB Ram");
		
		// Ürünlerimizi Array içerisine atýp For-Each ile Gezebiliriz.
		Product[] products= {product1,product2,product3};
	
		for(Product product:products) {
			
			System.out.println("\nID:"+product.id);
			System.out.println("Name:"+product.name);
			System.out.println("Price:"+product.price);
			System.out.println("Detail:"+product.detail);
		}
		
		Category category1=new Category("Bilgisayar");
		Category category2=new Category("Ev/Bahçe");
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
