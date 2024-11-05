package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static org.example.interfaces.PageWord.CARACTERES_SECCION_RESUMEN;

public class ValidarCaracteresDetalles implements Question<String> {

    public static ValidarCaracteresDetalles caracteres(){
        return new ValidarCaracteresDetalles();
    }
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(CARACTERES_SECCION_RESUMEN).getText();
    }
}
