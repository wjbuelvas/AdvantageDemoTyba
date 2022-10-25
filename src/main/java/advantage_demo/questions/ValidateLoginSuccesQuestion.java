package advantage_demo.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static advantage_demo.userinterfaces.PrincipalPageUserInterfaces.LBL_USER;
import static advantage_demo.utils.SessionVariables.USERNAME;

public class ValidateLoginSuccesQuestion implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    return LBL_USER.resolveFor(actor).getText().equals(Serenity.sessionVariableCalled(USERNAME.toString()));
  }

  public static ValidateLoginSuccesQuestion inAdvantageDemo() {
    return new ValidateLoginSuccesQuestion();
  }
}
