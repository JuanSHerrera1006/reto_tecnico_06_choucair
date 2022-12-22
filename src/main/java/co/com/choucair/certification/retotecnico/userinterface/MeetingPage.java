package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingPage extends PageObject {
    public static final Target BTN_NEW_MEETING = Target
            .the("")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]"));

    public static final Target INPUT_MEETING_NAME = Target
            .the("")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingName\"]"));

    public static final Target INPUT_MEETING_NUMBER = Target
            .the("")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber\"]"));

    public static final Target DROPDOWN_START_DATE_TIME = Target
            .the("")
            .located(By.xpath(
                    "//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[4]/select"
            ));
    public static final Target INPUT_START_DATE = Target
            .the("")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_StartDate\"]"));

    public static final Target DROPDOWN_END_DATE_TIME = Target
            .the("")
            .located(By.xpath(
                    "//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[5]/select"
            ));
    public static final Target INPUT_END_DATE = Target
            .the("")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_EndDate\"]"));

    public static final Target CONTAINER_INPUT_MEETING_TYPE = Target
            .the("")
            .located(By.xpath(
                    "//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId\"]/a"
            ));

    public static final Target INPUT_MEETING_TYPE = Target
            .the("")
            .located(By.xpath("//*[@id=\"s2id_autogen6_search\"]"));

    public static final Target CONTAINER_INPUT_LOCATION = Target
            .the("")
            .located(By.xpath(
                    "//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId\"]/a"
            ));
    public static final Target INPUT_LOCATION = Target
            .the("")
            .located(By.xpath("//*[@id=\"s2id_autogen7_search\"]"));

    public static final Target CONTAINER_INPUT_ORGANIZED_BY = Target
            .the("")
            .located(By.xpath(
                    "//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId\"]/a"
            ));
    public static final Target INPUT_ORGANIZED_BY = Target
            .the("")
            .located(By.xpath("//*[@id=\"s2id_autogen9_search\"]"));

    public static final Target CONTAINER_INPUT_REPORTER = Target
            .the("")
            .located(By.xpath(
                    "//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId\"]/a"
            ));
    public static final Target INPUT_REPORTER = Target
            .the("")
            .located(By.xpath("//*[@id=\"s2id_autogen10_search\"]"));

    public static final Target CONTAINER_INPUT_UNIT = Target
            .the("")
            .located(By.xpath(
                    "//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId\"]/a"
            ));
    public static final Target INPUT_UNIT = Target
            .the("")
            .located(By.xpath("//*[@id=\"s2id_autogen8_search\"]"));
    public static final Target CONTAINER_ATTENDEE_LIST_INPUT = Target
            .the("")
            .located(By.xpath("//*[@id=\"s2id_autogen11\"]/a"));

    public static final Target ATTENDEE_LIST_INPUT = Target
            .the("")
            .located(By.xpath("//*[@id=\"s2id_autogen12_search\"]"));

    public static final Target BTN_APPLY_CHANGES = Target
            .the("")
            .located(By.xpath(
                    "//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_Toolbar\"]/div/div/div/div[2]"
            ));
}
