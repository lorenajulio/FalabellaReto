package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleProductoUI {

    //antes de ir al carrito
    public static Target H1_ANTESDEAGREGAR = Target.the("producto")
            .locatedBy("//section[@id=\"product-b2c-ui\"]//h1");
    public static Target NOM_CARRITO = Target.the("producto en el carrito")
            .locatedBy("//a[@class='chakra-link css-qpfo7l']");
    public static Target CANTIDAD_CARRITO =Target.the("cantidad en el carrito")
            .locatedBy("//input[@class='chakra-input css-1k2vvg6']");



}
