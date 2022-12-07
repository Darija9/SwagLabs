package swag.labs.test.log_in;

import org.testng.annotations.Test;
import swag.labs.test.utility.BeforeAndAfter;
import swag.labs.test.utility.coverage.LogInFun;


public class LogIn extends BeforeAndAfter {

    @Test(priority = 1)
    public void logInNoUsername() throws Exception {

        LogInFun.logInNoUsername(driver, wait);
    }

    @Test(priority = 2)
    public void validLogIn() throws Exception {

        LogInFun.logInValidAccount(driver, wait);
        LogInFun.logOutAccount(driver, wait);

    }


}
