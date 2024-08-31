package co.com.proyectobase.screenplay.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/form_completion.feature",
        glue={"co.com.proyectobase.screenplay.stepdefinitions","co.com.proyectobase.screenplay.hooks"},
        snippets= CucumberOptions.SnippetType.CAMELCASE
)
public class FormRunner {
}
