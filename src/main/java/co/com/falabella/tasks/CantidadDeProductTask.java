package co.com.falabella.tasks;

import co.com.falabella.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

import org.openqa.selenium.Keys;

import static co.com.falabella.ui.CantidadDeProductUI.INPUT_CANTIDAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CantidadDeProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(INPUT_CANTIDAD),
        Enter.theValue(Data.extractTo().get(0).get("Cantidad")).into(INPUT_CANTIDAD ).thenHit(Keys.ENTER)

             );

    }
    public static CantidadDeProductTask on(){
        return instrumented(CantidadDeProductTask.class);
    }
}
