package PageObject_Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageobject {
    WebDriver driver = new ChromeDriver();

    public void openAmazonHomepage(String url) {
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(url);
        System.out.println("Navigating to Amazon homepage: " + url);
    }

    public void searchForProduct(String product) throws InterruptedException {
        Thread.sleep(1000); // Wait for 1 second to ensure the page is loaded
        System.out.println("Searching for product: " + product);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(product);
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        Thread.sleep(1000); // Wait for 1 second to ensure the search results are loaded
        System.out.println("Search completed for product: " + product);
    }

    public void verifySearchResults(String searchTerm) {
        System.out.println("Verifying search results for: " + searchTerm);
        String pageSource = driver.getPageSource();
        assert pageSource != null;
        if (!pageSource.contains(searchTerm)) {
            throw new AssertionError("Search results do not contain the term: " + searchTerm);

        }

        driver.quit(); // Close the browser after verification
        System.out.println("Search results verified successfully for: " + searchTerm);
    }
}
