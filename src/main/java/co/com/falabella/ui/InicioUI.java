package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class InicioUI {
    public static Target TXT_BUSQUEDA =Target.the("busqueda")
            .locatedBy("//input[@id='testId-SearchBar-Input']");

}
