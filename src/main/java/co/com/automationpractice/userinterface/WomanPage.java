package co.com.automationpractice.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WomanPage {

    public static final Target WOMEN_SECTION = Target.the("Women Section")
            .located(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
    public static final Target TOP_SECTION = Target.the("Women Section")
            .located(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[2]/ul/li[1]/div[1]/a"));
    public static final Target TSHIRT = Target.the("Women Section")
            .located(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a"));
    public static final Target ADD_TO_CART = Target.the("Add to cart")
            .located(By.id("add_to_cart"));
    public static final Target PROCEED_TO_CHECKOUT1 = Target.the("Proceed to Checkout 1")
            .located(By.cssSelector("div#layer_cart a> span"));
    public static final Target PROCEED_TO_CHECKOUT2 = Target.the("Proceed to Checkout 2")
            .located(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]"));
    public static final Target PROCEED_TO_CHECKOUT3 = Target.the("Proceed to Checkout 3")
            .located(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
    public static final Target CHECK_BOX = Target.the("Check Box")
            .located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input"));
    public static final Target PROCEED_TO_PAY = Target.the("Proceed to Pay")
            .located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button"));
    public static final Target PAY_BY_CHECK = Target.the("Pay by Check")
            .located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a"));
    public static final Target CONFIRM_ORDER = Target.the("Confirm Order")
            .located(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
//    public static final Target ORDER_COMPLETED = Target.the("Order Completed")
//            .located(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[1]/text()"));
}