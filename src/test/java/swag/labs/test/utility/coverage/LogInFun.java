package swag.labs.test.utility.coverage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.labs.test.utility.jsonFilesParser.JSONManagement;
import swag.labs.test.utility.page_object.LogInPage;
import swag.labs.test.utility.page_object.MenuOption;
import swag.labs.test.utility.page_object.ProductListingPage;

import java.io.IOException;

public class LogInFun {


    public static void logInNoUsername (WebDriver driver, WebDriverWait wait) throws IOException {

        driver.findElement(LogInPage.passwordField).sendKeys(JSONManagement.readProperty("password"));
        driver.findElement(LogInPage.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPage.ErrorMessageNoUsername));

    }

    public static void logInValidAccount (WebDriver driver, WebDriverWait wait) throws IOException {

        driver.findElement(LogInPage.userNameField).sendKeys(JSONManagement.readProperty("standardUser"));
        driver.findElement(LogInPage.passwordField).clear();
        driver.findElement(LogInPage.passwordField).sendKeys(JSONManagement.readProperty("password"));
        driver.findElement(LogInPage.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductListingPage.productTitle));

    }


    public static void logOutAccount (WebDriver driver, WebDriverWait wait){

        driver.findElement(MenuOption.menu).click();
        driver.findElement(MenuOption.logOut).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPage.logInButton));


    }
}
