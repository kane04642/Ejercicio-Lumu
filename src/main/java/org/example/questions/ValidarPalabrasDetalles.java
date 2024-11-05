package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static org.example.interfaces.PageWord.PALABRAS_SECCION_RESUMEN;

public class ValidarPalabrasDetalles implements Question<String> {
    public static ValidarPalabrasDetalles palabras(){
        return new ValidarPalabrasDetalles();
    }
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(PALABRAS_SECCION_RESUMEN).getText();
    }
}
