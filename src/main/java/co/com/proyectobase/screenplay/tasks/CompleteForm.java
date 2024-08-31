package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompleteForm implements Task {

    private static final int NUMBER_OF_CYCLES = 10;

    public static CompleteForm tenTimes() {
        return instrumented(CompleteForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 1; i <= NUMBER_OF_CYCLES; i++) {
            try {
                // Ingreste el campo de texto
                actor.attemptsTo(
                        Enter.theValue("B".repeat(283)).into(FormPage.TEXT_FIELD)
                );

                // Seleccionar la opcion correcta del desplegable
                actor.attemptsTo(
                        SelectFromOptions.byValue("3").from(FormPage.MATH_RESULT_DROPDOWN)
                );

                // Seleccionar todos los multipos de 8 de los checkbox
                actor.attemptsTo(
                        Click.on(FormPage.CHECKBOX_144),
                        Click.on(FormPage.CHECKBOX_120)
                        // Agregar más selectores de checkbox si es necesario
                );

                //  seleccionar la fecha correcta
                LocalDate fechaBase = LocalDate.of(2024, 8, 29);
                LocalDate fechaObjetivo = fechaBase.minusDays(78);
                String fechaFormateada = fechaObjetivo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                actor.attemptsTo(
                        Click.on(FormPage.DATE_FIELD),
                        Click.on(FormPage.getDateLocator(fechaFormateada))
                );

                actor.attemptsTo(Click.on(FormPage.SUBMIT_BUTTON));
            } catch (Exception e) {
                // reinicio
                i = 0;
            }
        }
    }
}
