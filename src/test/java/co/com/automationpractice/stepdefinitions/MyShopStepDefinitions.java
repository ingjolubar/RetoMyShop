package co.com.automationpractice.stepdefinitions;

import co.com.automationpractice.model.MyShopData;
import co.com.automationpractice.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class MyShopStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Jorge wants to buy a t-shirt on the page$")
    public void jorge_wants_to_buy_a_t_shirt_on_the_page() {
    OnStage.theActorCalled("Jorge").wasAbleTo(OpenUp.thepage());
    }

    @When("^the user selects the item and completes the purchase$")
    public void the_user_selects_the_item_and_completes_the_purchase(List<MyShopData> myshopData) {
    OnStage.theActorInTheSpotlight().attemptsTo(EnterCredentials.thepage(myshopData), Buy.thepage());
    }

    @Then("^purchase is complete when the I confirm my order button appears$")
    public void purchaseIsCompleteWhenTheIConfirmMyOrderButtonAppears() {
//        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(myshopData)));

    }
}