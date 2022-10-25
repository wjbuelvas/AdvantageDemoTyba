package advantageDemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
@CucumberOptions(
    features = "src/test/resources/features/gestion_productos_advantage.feature",
    glue = "src/test/java/advantageDemo/stepdefinitions/GestionProductosStepDefinition.java")
public class GestionAdvantageDemoRunner {}
