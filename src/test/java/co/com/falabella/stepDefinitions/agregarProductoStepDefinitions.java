package co.com.falabella.stepDefinitions;

import co.com.falabella.questions.ValidacionCantidadQuestion;
import co.com.falabella.questions.ValidacionProductoQuestion;
import co.com.falabella.tasks.AgregarCarritoTask;
import co.com.falabella.tasks.CantidadDeProductTask;
import co.com.falabella.tasks.InicioTask;
import co.com.falabella.tasks.ListaProductosTask;
import io.cucumber.java.Before;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class agregarProductoStepDefinitions {
    @Managed
    WebDriver driver;
    Actor actor = Actor.named("actor");

    @Before
    public void setupActor() {
        actor.can(BrowseTheWeb.with(driver));
    }
    @Dado("que el usuario abre la pagina de Falabella, busque un producto")
    public void queElUsuarioAbreLaPaginaDeFalabellaBusqueUnProducto() {
       // OnStage.setTheStage(new OnlineCast());
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co/")
        );
        actor.attemptsTo(InicioTask.on());


    }

    @Cuando("se seleccione de forma aleatoria un producto")
    public void seSeleccioneDeFormaAleatoriaUnProducto() {
        actor.attemptsTo(
                ListaProductosTask.on()
        );

    }
    @Cuando("seleccione tres unidades del mismo producto y de click en agregar")
    public void seleccioneTresUnidadesDelMismoProductoYDeClickEnAgregar() {
        actor.attemptsTo(CantidadDeProductTask.on());
        actor.attemptsTo(AgregarCarritoTask.on());

    }


    @Entonces("el usuario confirmara que sea el producto y la cantidad establecida")
    public void elUsuarioConfirmaraQueSeaElProductoYLaCantidadEstablecida() {
        actor.should(
                seeThat(
                        ValidacionProductoQuestion.from(), Matchers.equalTo(true)
                ),
                seeThat(
                        ValidacionCantidadQuestion.from(), Matchers.equalTo(true)
                )
        );


    }
}
