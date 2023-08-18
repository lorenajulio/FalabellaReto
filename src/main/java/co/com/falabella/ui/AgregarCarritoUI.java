package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

import javax.swing.table.TableRowSorter;

public class AgregarCarritoUI {

    public static Target BTN_COOKIS = Target.the("btn cookies")
            .locatedBy("//button[@id=\"testId-accept-cookies-btn\"]");
    public static Target BTN_AGREGAR = Target.the("agregar al cariito")
            .locatedBy("//button[@id='add-to-cart-button']");
    public static Target BTN_IRCARRITO = Target.the("ir al cariito")
            .locatedBy("//a[@id='linkButton']");


}
