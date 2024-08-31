package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.tasks.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;



public class CommonStepDefinitions {

    private Actor user;
    private WebDriver driver;

    public CommonStepDefinitions(WebDriver driver) {
        this.driver = driver;
    }

    @Step("El {actorName} se encuentra logueado con credenciales correctas user: {username} y password: {password}")
    public void elUsuarioIniciaSesion(String actorName, String username, String password) {
        user = Actor.named(actorName);
        user.can(BrowseTheWeb.with(driver).asActor(user));
        user.attemptsTo(
                Login.withCredentials(username, password)
        );
    }
}
