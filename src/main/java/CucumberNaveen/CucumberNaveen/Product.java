package CucumberNaveen.CucumberNaveen;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String productName;
	private int price;
	
	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getProductList() {
		List<String> productList = new ArrayList<String>();
		productList.add("Apple MacBook Pro");
		productList.add("Apple MaccBook Air");
		productList.add("Apple iPhone 15");
		return productList;		
	}
	
}
