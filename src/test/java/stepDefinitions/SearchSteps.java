package stepDefinitions;

import CucumberNaveen.CucumberNaveen.Product;
import CucumberNaveen.CucumberNaveen.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	Product product;
	Search search;
	@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Implement Given");
	}

	@When("I search for a prodct with name {string} and price {int}")
	public void i_search_for_a_prodct_with_name_and_price(String productName, Integer price) {
		System.out.println("Implement When");
		product = new Product(productName, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String procutName) {
		System.out.println("Implement Then");
		search = new Search();
		search.displayProduct(product);
		System.out.println("Searched product is ... " + search.displayProduct(product));
	}

}
