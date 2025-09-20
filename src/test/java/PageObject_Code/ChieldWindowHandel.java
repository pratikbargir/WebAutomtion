package PageObject_Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ChieldWindowHandel {

    public static void main(String[] args) {

        /* Web Driver Initiated */
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();
        driver.findElement(By.className("blinkingText")).click();
        System.out.println(driver.getTitle());

        /*Child Window Handling Logic*/
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String MainWindow = it.next();
        String ChildWindow = it.next();
        driver.switchTo().window(ChildWindow);
        String s = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        System.out.println(s);
        /* Back to Parent Window */
        driver.switchTo().window(MainWindow);
        driver.findElement(By.id("username")).sendKeys(s);
        driver.quit();

    }
}
