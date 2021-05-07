package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Statik Yap�c� blok �al��t�.");
	}
	//NEW 'lenince �al���r.
	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�.");
	}
	
	//Statikler direkt class ismiyle �a�r�l�r.
	public static boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public void bisey() {
		
	}
	
}
