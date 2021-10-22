package co.com.automationpractice.tasks;

import co.com.automationpractice.userinterface.WomanPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Buy implements Task {


    public static Buy thepage() {
        return Tasks.instrumented(Buy.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(WomanPage.WOMEN_SECTION),
                Click.on(WomanPage.TOP_SECTION),
                Click.on(WomanPage.TSHIRT),
                Click.on(WomanPage.ADD_TO_CART),
                Click.on(WomanPage.PROCEED_TO_CHECKOUT1),
                Click.on(WomanPage.PROCEED_TO_CHECKOUT2),
                Click.on(WomanPage.PROCEED_TO_CHECKOUT3),
                Click.on(WomanPage.CHECK_BOX),
                Click.on(WomanPage.PROCEED_TO_PAY),
                Click.on(WomanPage.PAY_BY_CHECK),
                Click.on(WomanPage.CONFIRM_ORDER));
//                Click.on(WomanPage.ORDER_COMPLETED));

    }
}
