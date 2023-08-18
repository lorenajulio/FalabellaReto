package co.com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.falabella.ui.DetalleProductoUI.CANTIDAD_CARRITO;


public class ValidacionCantidadQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String cantidadProducto = CANTIDAD_CARRITO.resolveFor(actor).getValue();
        String variableAux = actor.recall("cantidadProducto");
        return cantidadProducto.equals(variableAux);
    }

    public static Question<Boolean> from(){
        return new ValidacionCantidadQuestion();
    }
}


