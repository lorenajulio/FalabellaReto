package co.com.falabella.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static co.com.falabella.ui.DetalleProductoUI.NOM_CARRITO;


public class ValidacionProductoQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String nombreProducto = NOM_CARRITO.resolveFor(actor).getText();
        String variableAux = actor.recall("ProductoNombre");
        return nombreProducto.equals(variableAux);
    }

    public static Question<Boolean> from(){
        return new ValidacionProductoQuestion();
    }
}
