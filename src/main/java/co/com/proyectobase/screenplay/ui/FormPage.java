package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {
    public static final Target TEXT_FIELD = Target.the("campo de texto")
            .located(By.cssSelector("input[name='textField']"));

    public static final Target MATH_RESULT_DROPDOWN = Target.the("desplegable del resultado matemático")
            .located(By.cssSelector("select[name='mathResult']"));

    public static final Target CHECKBOX_144 = Target.the("checkbox 144")
            .located(By.cssSelector("input[value='144']"));

    public static final Target CHECKBOX_120 = Target.the("checkbox 120")
            .located(By.cssSelector("input[value='120']"));

    public static final Target DATE_FIELD = Target.the("campo de fecha")
            .located(By.cssSelector("input[name='dateField']"));

    public static final Target SUBMIT_BUTTON = Target.the("botón de enviar")
            .located(By.cssSelector("button[type='submit']"));

    public static Target getDateLocator(String date) {
        return Target.the("fecha seleccionada")
                .located(By.xpath("//td[@data-date='" + date + "']"));
    }
    public static final Target SUCCESS_HASH = Target.the("hash de éxito")
            .located(By.id("success-hash"));

}