package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.questions.ValidarCaracteresDetalles;
import org.example.questions.ValidarPalabrasResumen;
import org.example.questions.ValidarTextoResumen;
import org.example.tasks.OpenUrl;
import org.example.tasks.WriteText;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CaracteresStepDefinitions {


    String actor = "Usuario";

    @Before()
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("El usuario abre la pagina wordcounter")
    public void elUsuarioAbreLaPaginaWordcounter() {
        theActorCalled(actor).attemptsTo(OpenUrl.word());
    }
    @Cuando("El usuario ingresa el {string} a verificar")
    public void elUsuarioIngresaElaVerificar(String texto) {

        theActorCalled(actor).attemptsTo(
                WriteText.wordType(texto)
        );
    }

    @Entonces("El usario  visualiza la cantidad de caracteres a verificar {string} en resumen general")
    public void elUsarioVisualizaLaCantidadDeCaracteresAVerificarEnResumenGeneral(String cantidad_caracteres) throws InterruptedException {
        Thread.sleep(3000);
        theActorInTheSpotlight().should(
                seeThat("La cantidad de caracteres en la sección Resumen es correcta : ", ValidarTextoResumen.value(),equalTo(cantidad_caracteres))
        );
    }

    @Y("El usuario visualiza cantidad de caracteres {string}en seccion detalle")
    public void elUsuarioVisualizaCantidadDeCaracteresEnSeccionDetalle(String caracteres_detalle) throws InterruptedException {
        Thread.sleep(3000);
        theActorInTheSpotlight().should(
                seeThat("La cantidad de caracteres en la sección Detalles es correcta : ", ValidarCaracteresDetalles.caracteres(),equalTo(caracteres_detalle))
        );
    }
}
