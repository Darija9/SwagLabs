package swag.labs.test.utility.coverage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderFun {

    public static void addToCart (WebDriver driver, WebDriverWait wait) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]"))).isDisplayed();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Ime");
        driver.findElement(By.id("last-name")).sendKeys("Prezime");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]"))).isDisplayed();
        driver.findElement(By.id("finish")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]"))).isDisplayed();


    }

}
