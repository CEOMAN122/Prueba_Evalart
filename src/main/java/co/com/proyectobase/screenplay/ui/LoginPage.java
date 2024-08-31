package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USER_FIELD = Target.the("campo de usuario")
            .located(By.cssSelector("input[name='username'].rounded-md"));

    public static final Target PASSWORD_FIELD = Target.the("campo de contraseña")
            .located(By.cssSelector("input[name='password'].rounded-md"));

    public static final Target LOGIN_BUTTON = Target.the("botón de iniciar sesión")
            .located(By.cssSelector("div.mx-auto.flex.flex-col.border.border-solid.border-gray-300.bg-black.w-1\\/2.justify-center form > button"));
}
