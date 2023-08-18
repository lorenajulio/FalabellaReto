package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ListaProductosUI {
    public static Target LBL_LISTA_PRODUCTOS =Target.the("Lista Productos")
            .locatedBy("//b[@class='jsx-1576191951 title2 primary  jsx-2889528833 bold       pod-subTitle subTitle-rebrand' and not(@is-empty)]");

}
