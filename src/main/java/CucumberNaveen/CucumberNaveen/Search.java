package CucumberNaveen.CucumberNaveen;

public class Search {
	public String displayProduct(Product product) {
		if(product.getProductList().contains(product.getProductName())) {
			return product.getProductName();
		}
		else {
			return "Product Not Available";
		}
	}
}