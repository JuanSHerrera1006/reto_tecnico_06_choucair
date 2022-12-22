package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.StartSharpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String username;

    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Login as(String username, String password) {
        return Tasks.instrumented(Login.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(StartSharpPage.INPUT_USERNAME),
                Clear.field(StartSharpPage.INPUT_PASSWORD),
                Enter.theValue(username).into(StartSharpPage.INPUT_USERNAME),
                Enter.keyValues(password).into(StartSharpPage.INPUT_PASSWORD),
                Click.on(StartSharpPage.SIGNIN_BUTTON)
        );
    }
}
