package co.com.automationpractice.tasks;

import co.com.automationpractice.model.MyShopData;
import co.com.automationpractice.userinterface.Authentication;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class EnterCredentials implements Task {

    private List<MyShopData> myShopData;

    public EnterCredentials(List<MyShopData> myShopData) {
        this.myShopData = myShopData;
    }

    public static EnterCredentials thepage(List<MyShopData> myshopData) {
        return Tasks.instrumented(EnterCredentials.class, myshopData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(myShopData.get(0).getTheEmail()).into(Authentication.EMAIL_ADDRESS),
                Enter.theValue(myShopData.get(0).getThePassword()).into(Authentication.PASSWORD),
                Click.on(Authentication.SIGN_IN)
                );

    }
}
