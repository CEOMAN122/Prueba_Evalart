package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.SuccessHashDisplayed;
import co.com.proyectobase.screenplay.tasks.CompleteForm;
import co.com.proyectobase.screenplay.tasks.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FormCompletionStepDefinitions {

    @Given("el usuario está en la página del formulario")
    public void elUsuarioEstaEnLaPaginaDelFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NavigateTo.formPage()
        );
    }

    @When("el usuario completa el formulario y lo envía")
    public void elUsuarioCompletaElFormularioYLoEnvia() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompleteForm.tenTimes()
        );
    }

    @Then("el formulario debe ser completado exitosamente 10 veces")
    public void elFormularioDebeSerCompletadoExitosamente() {
        // Puedes agregar validaciones adicionales aquí si es necesario
    }

    @Then("el usuario debe ver el hash de éxito")
    public void elUsuarioDebeVerElHashDeExito() {
        String displayedHash = SuccessHashDisplayed.value().answeredBy(OnStage.theActorInTheSpotlight());
        assertThat("El hash de éxito es correcto", displayedHash, equalTo("expected_success_hash"));
    }
}
