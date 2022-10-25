package advantage_demo.interactions;

import advantage_demo.utils.Timer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static advantage_demo.userinterfaces.PrincipalPageUserInterfaces.OPC_CREATE_NEW_ACCOUNT;
import static advantage_demo.userinterfaces.PrincipalPageUserInterfaces.USER_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectOptRegister implements Interaction {
    public static SelectOptRegister user() {
        return instrumented(SelectOptRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(USER_BUTTON, isVisible()),
                Click.on(USER_BUTTON),
                Timer.inSeconds(3),
                WaitUntil.the(OPC_CREATE_NEW_ACCOUNT, isVisible()),
                Click.on(OPC_CREATE_NEW_ACCOUNT));
    }
}
