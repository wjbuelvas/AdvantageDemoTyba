package advantageDemo.stepdefinitions;

import advantage_demo.exceptions.FailedGetTextException;
import advantage_demo.questions.ValidateCreatedAccountQuestion;
import advantage_demo.questions.ValidateLoginSuccesQuestion;
import advantage_demo.tasks.CreateAccount;
import advantage_demo.tasks.LoginUser;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static advantage_demo.exceptions.FailedGetTextException.FAILED_GET_TEXT;
import static advantage_demo.utils.GlobalVariables.ADVANTAGE_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateAccountStepDefinition {

    @Managed(driver = "chrome")
    WebDriver herBrowser;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(herBrowser)));
    }

    @Given("{word} esta en la pagina de AdvantageDemo")
    public void openPageAdvantage(String actor) {
        theActorCalled(actor).wasAbleTo(Open.url(ADVANTAGE_URL));
    }

    @When("crea una cuenta para comprar productos")
    public void createAccountUser() {
        theActorInTheSpotlight().attemptsTo(CreateAccount.toUser());
    }

    @Then("la cuenta es creada correctamente")
    public void validationCreateAccount() {
        theActorInTheSpotlight()
                .should(
                        seeThat(ValidateCreatedAccountQuestion.inAdvantageDemo())
                                .orComplainWith(FailedGetTextException.class, FAILED_GET_TEXT));
    }

    @When("{word} realiza el proceso de Login con usuario registrado")
    public void loginUser(String actor) {
        theActorCalled(actor).wasAbleTo(Open.url(ADVANTAGE_URL));
        theActorInTheSpotlight().attemptsTo(LoginUser.toUser());
    }

    @Then("ingresa a la pagina principal correctamente")
    public void validateLoginUser() {
        theActorInTheSpotlight()
                .should(
                        seeThat(ValidateLoginSuccesQuestion.inAdvantageDemo())
                                .orComplainWith(FailedGetTextException.class, FAILED_GET_TEXT));
    }
}
