package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.questions.AnswerBusinessUnit;
import co.com.choucair.certification.retotecnico.tasks.AddNewBusinessUnit;
import co.com.choucair.certification.retotecnico.tasks.Go;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class businessUnitStepDefinition {

    @Given("I want to create a organization")
    public void iWantToCreateAOrganization() {
        OnStage
                .theActorCalled("I")
                .wasAbleTo(Go.toBusinessUnit());
    }
    @When("I fill new business unit form")
    public void iFillNewBusinessUnitForm() {
        OnStage.
                theActorInTheSpotlight()
                .attemptsTo(AddNewBusinessUnit.onBusinessUnitPage());
    }
    @Then("I should give the Business Unit")
    public void iShouldGiveTheBusinessUnit() {
        OnStage
                .theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(AnswerBusinessUnit.itHasBeenCreated()));

    }
}
