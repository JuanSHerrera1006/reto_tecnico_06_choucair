package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.BusinessUnitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class AddNewBusinessUnit implements Task {
    public static final String TEST_BUSINESS_UNIT_NAME = "TEST_BUSINESS_UNIT";
    public static final String TEST_PARENT_BUSINESS_UNIT = "ACME Corp.";
    public static AddNewBusinessUnit onBusinessUnitPage() {
        return Tasks.instrumented(AddNewBusinessUnit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("Business Unit Name", TEST_BUSINESS_UNIT_NAME);
        actor.attemptsTo(
                Click.on(BusinessUnitPage.BTN_NEW_BUSINESS_UNIT),
                Enter.theValue(TEST_BUSINESS_UNIT_NAME).into(BusinessUnitPage.INPUT_NAME_UNIT),
                Click.on(BusinessUnitPage.CONTAINER_PARENT_BUSINESS_UNIT_INPUT),
                Enter.theValue(TEST_PARENT_BUSINESS_UNIT).into(BusinessUnitPage.PARENT_BUSINESS_UNIT_INPUT),
                Hit.the(Keys.ENTER).into(BusinessUnitPage.PARENT_BUSINESS_UNIT_INPUT),
                Click.on(BusinessUnitPage.BTN_ADD_BUSINESS_UNIT),
                Enter.theValue(TEST_BUSINESS_UNIT_NAME).into(BusinessUnitPage.INPUT_SEARCH_BUSINESS_UNIT),
                DoubleClick.on(BusinessUnitPage.BTN_FILTER_ID)
        );
    }
}
