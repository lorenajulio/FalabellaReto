package co.com.falabella.tasks;

import co.com.falabella.interactions.ClickRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ListaProductosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                ClickRandom.click()

        );
    }
    public static ListaProductosTask on(){
        return instrumented(ListaProductosTask.class);
    }
}
