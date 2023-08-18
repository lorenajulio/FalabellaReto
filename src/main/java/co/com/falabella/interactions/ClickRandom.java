package co.com.falabella.interactions;


import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.Random;

import static co.com.falabella.ui.ListaProductosUI.LBL_LISTA_PRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRandom implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades listProducts = LBL_LISTA_PRODUCTOS.resolveAllFor(actor);
        Random random= new Random();
        int indexRandom= random.nextInt(listProducts.size());
        listProducts.get(indexRandom).click();
        }


        public static Performable click(){
        return instrumented(ClickRandom.class);
        }
    }


