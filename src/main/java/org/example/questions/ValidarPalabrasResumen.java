package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.example.interfaces.PageWord.LBL_RESUMEN_GENERAL;

public class ValidarPalabrasResumen implements Question<String> {

    public static Question<String> value (){
        return new ValidarPalabrasResumen();
    }
    @Override
    public String answeredBy(Actor actor) {
        String text_resumen = BrowseTheWeb.as(actor).find(LBL_RESUMEN_GENERAL).getText();

        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text_resumen);
        int[] numeros = new int[2];
        int contador = 0;

        // Recorre el texto buscando números
        while (matcher.find() && contador < 2) {
            numeros[contador] = Integer.parseInt(matcher.group());
            contador++;
        }
        System.out.println("El numero de palabras es : "+ numeros[0]);
        return String.valueOf(numeros[0]);
    }
}
