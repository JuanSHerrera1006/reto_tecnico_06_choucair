package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.tasks.Login;
import co.com.choucair.certification.retotecnico.tasks.OpenUp;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;

public class loginStepDefinition {
    @Given("I am on StartSharp login page")
    public void iAmOnStartSharpLoginPage() {
        OnStage
                .theActorCalled("I")
                .wasAbleTo(OpenUp.thePage());
    }
    @Given("I logged with specify Username as {string} and Password as {string}")
    public void iLoggedWithSpecifyUsernameAsAndPasswordAs(String username, String password) {
        OnStage
                .theActorInTheSpotlight()
                .attemptsTo(Login.as(username, password));
    }

}
