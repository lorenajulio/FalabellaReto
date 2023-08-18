package co.com.falabella.tasks;

import co.com.falabella.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.falabella.ui.InicioUI.TXT_BUSQUEDA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InicioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Data.extractTo().get(0).get("Producto")).into(TXT_BUSQUEDA ).thenHit(Keys.ENTER)
        );
    }
    public static InicioTask on(){
        return instrumented(InicioTask.class);

    }
}
