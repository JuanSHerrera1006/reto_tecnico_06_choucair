package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.MeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class AddNewMeeting implements Task {
    public static final String MEETING_NAME = "TEST MEETING";
    public static final String MEETING_NUMBER = "000000000000";
    public static final String MEETING_TYPE = "General";
    public static final String START_DATE = "12/22/2022";
    public static final String END_DATE = "12/22/2022";
    public static final String START_TIME = "09:00";
    public static final String END_TIME = "09:30";
    public static final String LOCATION = "On Site";

    public static AddNewMeeting onMeetingPage() {
        return Tasks.instrumented(AddNewMeeting.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MeetingPage.BTN_NEW_MEETING),
                Enter.theValue(MEETING_NAME).into(MeetingPage.INPUT_MEETING_NAME),
                Enter.theValue(MEETING_NUMBER).into(MeetingPage.INPUT_MEETING_NUMBER),
                Click.on(MeetingPage.CONTAINER_INPUT_MEETING_TYPE),
                Enter.theValue(MEETING_TYPE).into(MeetingPage.INPUT_MEETING_TYPE),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_MEETING_TYPE),
                Enter.theValue(START_DATE).into(MeetingPage.INPUT_START_DATE),
                Enter.theValue(END_DATE).into(MeetingPage.INPUT_END_DATE),
                SelectFromOptions.byValue(START_TIME).from(MeetingPage.DROPDOWN_START_DATE_TIME),
                SelectFromOptions.byValue(END_TIME).from(MeetingPage.DROPDOWN_END_DATE_TIME),
                Click.on(MeetingPage.CONTAINER_INPUT_LOCATION),
                Enter.theValue(LOCATION).into(MeetingPage.INPUT_LOCATION),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_LOCATION),
                Click.on(MeetingPage.CONTAINER_INPUT_ORGANIZED_BY),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_ORGANIZED_BY),
                Click.on(MeetingPage.CONTAINER_INPUT_UNIT),
                Enter.theValue(AddNewBusinessUnit.TEST_BUSINESS_UNIT_NAME).into(MeetingPage.INPUT_UNIT),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_UNIT),
                Click.on(MeetingPage.CONTAINER_INPUT_REPORTER),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_REPORTER),
                Click.on(MeetingPage.CONTAINER_ATTENDEE_LIST_INPUT),
                Hit.the(Keys.ENTER).into(MeetingPage.ATTENDEE_LIST_INPUT),
                Click.on(MeetingPage.BTN_APPLY_CHANGES)
        );
    }
}
