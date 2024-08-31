package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target HOME_LABEL = Target.the("Etiqueta de Home")
            .located(By.xpath("//h1[text()='Prueba de automatización' and contains(@class, 'text-center')]"));
}
