package advantage_demo.interactions;

import advantage_demo.utils.Timer;
import lombok.AllArgsConstructor;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static advantage_demo.userinterfaces.LoginUserInterfaces.*;
import static advantage_demo.userinterfaces.PrincipalPageUserInterfaces.USER_BUTTON;
import static advantage_demo.utils.SessionVariables.USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class Login implements Interaction {
    public static Login toUser() {
        return instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String userName = Serenity.sessionVariableCalled(USERNAME.toString());
        actor.attemptsTo(
                WaitUntil.the(USER_BUTTON, isVisible()),
                Click.on(USER_BUTTON));
        WaitUntil.angularRequestsHaveFinished();
        actor.attemptsTo(WaitUntil.the(LBL_USERNAME, isVisible()),
                Enter.theValue(userName).into(LBL_USERNAME),
                WaitUntil.the(LBL_PASSWORD, isVisible()),
                Enter.theValue("Colombia11").into(LBL_PASSWORD),
                WaitUntil.the(LBL_USERNAME, isVisible()),Click.on(BTN_SING_IN));
    }
}
