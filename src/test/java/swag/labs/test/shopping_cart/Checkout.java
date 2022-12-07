package swag.labs.test.shopping_cart;

import org.testng.annotations.Test;
import swag.labs.test.utility.BeforeAndAfter;
import swag.labs.test.utility.coverage.OrderFun;
import swag.labs.test.utility.coverage.LogInFun;

import java.io.IOException;

public class Checkout extends BeforeAndAfter {

@Test
public void checkOutItem() throws IOException {

    LogInFun.logInValidAccount(driver, wait);
    OrderFun.addToCart(driver, wait);

}
}
