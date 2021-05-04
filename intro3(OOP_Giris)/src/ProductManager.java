

public class ProductManager {
	
	// Ýþ Yapan Class (Bu Class içerisine Method Yazmamýz Gerekiyor.)
	
	
	
	public void addToCart(Product product,Category category ) {
		System.out.println("Ürün Sepete Eklendi:"+product.name+"\nÜrün Kategorisi:"+category.name);
	}
	
	public void removeProduct(Product product) {
		System.out.println("Ürün Kaldýrýldý:"+product.name);
	}

	
	}


