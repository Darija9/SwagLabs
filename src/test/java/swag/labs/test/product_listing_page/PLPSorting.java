package swag.labs.test.product_listing_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import swag.labs.test.utility.BeforeAndAfter;
import swag.labs.test.utility.coverage.LogInFun;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PLPSorting extends BeforeAndAfter {

    @Test
    public void sortingPLP() throws IOException, InterruptedException {

        LogInFun.logInValidAccount(driver, wait);
        Thread.sleep(1000);

        List<WebElement> beforeFilterPrice = driver.findElements(By.className("inventory_item_price"));
        List<Double> beforeFilterPriceList = new ArrayList<>();

        for (WebElement p : beforeFilterPrice){
            beforeFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
        }

        Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
        dropdown.selectByVisibleText("Price (high to low)");

        List<WebElement> afterFilterPrice = driver.findElements(By.className("inventory_item_price"));

        List<Double> afterFilterPriceList = new ArrayList<>();

        for (WebElement p: afterFilterPrice){
            afterFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
        }

        Collections.sort(beforeFilterPriceList);
        Collections.reverse(beforeFilterPriceList);

        Assert.assertEquals(beforeFilterPriceList, afterFilterPriceList);
    }
}


