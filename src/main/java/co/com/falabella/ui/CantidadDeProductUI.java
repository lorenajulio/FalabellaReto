package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CantidadDeProductUI {
    public static Target INPUT_CANTIDAD =Target.the("cantidad de productos")
            .locatedBy("//input[@id='quantity-selector-increment-input']");
}
