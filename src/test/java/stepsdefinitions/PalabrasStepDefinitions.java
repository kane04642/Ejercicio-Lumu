package stepsdefinitions;

import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.example.questions.ValidarCaracteresDetalles;
import org.example.questions.ValidarPalabrasDetalles;
import org.example.questions.ValidarPalabrasResumen;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class PalabrasStepDefinitions {

    @Entonces("El usario  visualiza la cantidad de palabras a verificar {string} en resumen general")
    public void elUsarioVisualizaLaCantidadDePalabrasAVerificarEnResumenGeneral(String cantida_palabras) throws InterruptedException {
        Thread.sleep(3000);
        theActorInTheSpotlight().should(
                seeThat("La cantidad de palabras en la sección Resumen es correcta : ", ValidarPalabrasResumen.value(),equalTo(cantida_palabras))
        );
    }

    @Y("El usuario visualiza cantidad de palabras {string}en seccion detalle")
    public void elUsuarioVisualizaCantidadDePalabrasEnSeccionDetalle(String cantida_palabras) throws InterruptedException {
        Thread.sleep(3000);
        theActorInTheSpotlight().should(
                seeThat("La cantidad de palabras en la sección Detalle es correcta : ", ValidarPalabrasDetalles.palabras(),equalTo(cantida_palabras))
        );
    }
}
