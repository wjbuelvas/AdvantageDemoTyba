package advantage_demo.tasks;

import advantage_demo.interactions.FilloutForm;
import advantage_demo.interactions.SelectOptRegister;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class CreateAccount implements Task {
    public static CreateAccount toUser() {
        return instrumented(CreateAccount.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectOptRegister.user(),
                FilloutForm.toAccount());
    }
}
