package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.tasks.Login;
import co.com.proyectobase.screenplay.tasks.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;



public class LoginStepDefinitions {


    @Given("el {string} quiere iniciar sesion en la aplicacion")
    public void elQuiereIniciarSesionEnLaAplicacion(String actorName) {
        OnStage.theActorCalled(actorName).attemptsTo(
                NavigateTo.loginPage()
        );
    }


    @When("ingresa sus credenciales correctas user: {word} and password: {word}")
    public void ingresaSusCredencialesCorrectas(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(username, password)
        );
    }

    @Then("debe ver la pantalla del home")
    public void debeVerLaPantallaDelHome() {

    }
}
