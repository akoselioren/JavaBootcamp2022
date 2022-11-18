package staticDemo;

public class ProductManager {
	public void add(Product product) {
		if (ProductValidator.isValid(product)) {
			System.out.println("Ürün Eklendi.");
		} else {
			System.out.println("Koşulu sağlamadığı için ürün eklenemedi.");
		}
	}
}
