package stepdefinations;
import PageObject_Code.pageobject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
    pageobject page = new pageobject();
    @Given("I am on the Amazon homepage {string}")
    public void i_am_on_the_amazon_homepage(String url) {
        page.openAmazonHomepage(url);
    }

    @When("I search for {string}")
    public void i_search_for(String product) throws InterruptedException {
        page.searchForProduct(product);
    }

    @Then("I should see search results related to {string}")
    public void i_should_see_search_results_related_to(String product) {
        page.verifySearchResults(product);
    }
}
