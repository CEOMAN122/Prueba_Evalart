package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable loginPage() {
        return Task.where("{0} abre la página de inicio de sesión",
                Open.browserOn().thePageNamed("login.page") // Asegúrate de tener esta configuración en serenity.conf
        );
    }
    public static Task formPage() {
        return Task.where("{0} navega a la página del formulario",
                Open.url("https://tasks.evalartapp.com/automatization/forms/test")
        );
    }

}

