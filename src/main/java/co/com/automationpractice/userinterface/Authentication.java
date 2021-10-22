package co.com.automationpractice.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Authentication {

    public static final Target EMAIL_ADDRESS = Target.the("Email Address")
            .located(By.id("email"));
    public static final Target PASSWORD = Target.the("Password")
            .located(By.id("passwd"));
    public static final Target SIGN_IN = Target.the("Sign in Button")
            .located(By.id("SubmitLogin"));
}
