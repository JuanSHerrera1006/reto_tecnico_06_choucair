package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusinessUnitPage extends PageObject {
    public static final Target BTN_NEW_BUSINESS_UNIT = Target
            .the("")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]"));
    public static final Target INPUT_NAME_UNIT = Target
            .the("")
            .located(By.id("Serenity_Pro_Organization_BusinessUnitDialog3_Name"));

    public static final Target BTN_ADD_BUSINESS_UNIT = Target
            .the("")
            .located(By.xpath(
                    "//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Toolbar\"]/div/div/div/div[1]"
            ));
    public static final Target INPUT_SEARCH_BUSINESS_UNIT = Target
            .the("")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[1]/input"));
    public static final Target BTN_FILTER_ID = Target
            .the("")
            .located(By.xpath("/html/body/main/section/div/div[3]/div[2]/div/div[1]"));
    public static final Target NAME_BUSINESS_UNIT_FIELD = Target
            .the("")
            .located(By.xpath("/html/body/main/section/div/div[3]/div[5]/div/div[1]/div[2]"));

    public static final Target CONTAINER_PARENT_BUSINESS_UNIT_INPUT = Target
            .the("")
            .located(By.xpath("//*[@id=\"s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId\"]/a"));

    public static final Target PARENT_BUSINESS_UNIT_INPUT = Target
            .the("")
            .located(By.xpath("//*[@id=\"s2id_autogen1_search\"]"));
}
