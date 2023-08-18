package co.com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.falabella.ui.AgregarCarritoUI.*;
import static co.com.falabella.ui.CantidadDeProductUI.INPUT_CANTIDAD;
import static co.com.falabella.ui.DetalleProductoUI.H1_ANTESDEAGREGAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarCarritoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String productoNombre = H1_ANTESDEAGREGAR.resolveFor(actor).getText();
        actor.remember("ProductoNombre",productoNombre);

        String cantidadProducto = INPUT_CANTIDAD.resolveFor(actor).getValue();
        actor.remember("cantidadProducto",cantidadProducto);

        actor.attemptsTo(
                Click.on(BTN_COOKIS),
                Click.on(BTN_AGREGAR),
                Click.on(BTN_IRCARRITO)

        );

    }
    public static AgregarCarritoTask on(){
        return instrumented(AgregarCarritoTask.class);
    }
}
