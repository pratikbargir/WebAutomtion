package PageObject_Code;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/#");
        WebElement nameField = driver.findElement(By.xpath("//input[@id='username']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='Pratik'", nameField);
        driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
        Set<String> s = driver.getWindowHandles();
        Iterator<String> it = s.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        Thread.sleep(1000);
        String email = driver.findElement(By.xpath("//p[@class='im-para red']")).getCssValue("color");
        System.out.println("Text Color:"+ email);
        String emailId = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentId);

        driver.findElement(By.id("username")).sendKeys(emailId);
    }
}
