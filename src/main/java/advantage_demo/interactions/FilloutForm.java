package advantage_demo.interactions;

import advantage_demo.utils.Timer;
import lombok.AllArgsConstructor;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Random;

import static advantage_demo.userinterfaces.AdvantageDemoUserInterfaces.*;
import static advantage_demo.utils.SessionVariables.USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class FilloutForm implements Interaction {
    Random randomObj = new Random();

    public static FilloutForm toAccount() {
        return instrumented(FilloutForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String userName = "Juan" + randomObj.nextInt();
        actor.attemptsTo(
                WaitUntil.the(LBL_USERNAME, isVisible()),
                Enter.theValue(userName).into(LBL_USERNAME),
                Enter.theValue("wjbuelvas@gmail.com").into(LBL_EMAIL),
                Enter.theValue("Colombia11").into(LBL_PASSWORD),
                Enter.theValue("Colombia11").into(LBL_PASSWORD_CONFIRM),
                Enter.theValue("Esteban").into(LBL_FIRSTNAME),
                Enter.theValue("Buelvas").into(LBL_LASTNAME),
                Enter.theValue("3202563636").into(LBL_PHONENUMBER),
                Enter.theValue("Monteria").into(LBL_CITY),
                Enter.theValue("Barrio los colores").into(LBL_ADDRESS),
                Enter.theValue("Cordoba").into(LBL_STATE),
                Enter.theValue("05800").into(LBL_POSTAL),
                Click.on(CHK_AGREE),
                Click.on(BTN_REGISTER));
        Serenity.setSessionVariable(String.valueOf(USERNAME)).to(userName);
       // actor.remember(String.valueOf(USERNAME), userName);
        Timer.inSeconds(3);
    }
}
