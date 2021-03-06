package co.com.automationpractice.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/shopcart.feature",
        tags = "@stories",
        glue = "co.com.automationpractice.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerTags {
}


