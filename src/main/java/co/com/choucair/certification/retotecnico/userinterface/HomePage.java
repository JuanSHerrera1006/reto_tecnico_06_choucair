package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static final Target BUSINESS_UNIT_MENU = Target
            .the("")
            .located(By.
                    xpath("//*[@id=\"nav_menu1_3\"]/li[1]/a")
            );
    public static final Target BUSINESS_UNIT_ACTION = Target
            .the("")
            .located(By.xpath("//*[@id=\"nav_menu1_3_1\"]/li[1]/a"));

    public static final Target MEETING_MENU = Target
            .the("")
            .located(By.xpath("//*[@id=\"nav_menu1_3\"]/li[2]/a"));

    public static final Target MEETING_ACTION = Target
            .the("")
            .located(By.xpath("//*[@id=\"nav_menu1_3_2\"]/li[1]/a"));

    public static final Target POPUP_SUCCESS =  Target
            .the("")
            .located(By.xpath("//*[@id=\"toast-container\"]/div/div"));
}
