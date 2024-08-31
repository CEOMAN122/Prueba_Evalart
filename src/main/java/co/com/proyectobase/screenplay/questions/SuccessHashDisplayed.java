package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SuccessHashDisplayed implements Question<String> {

    public static SuccessHashDisplayed value() {
        return new SuccessHashDisplayed();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FormPage.SUCCESS_HASH).answeredBy(actor);
    }
}
