package org.example.interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageWord extends PageObject {

    public static final Target TEXT_WORD = Target.the("Usuario ingresa el texto").located(By.id("box"));
    public static final By LBL_RESUMEN_GENERAL = By.cssSelector("#top_counter > div.pull-left > h1 > span");
    public static final Target CARACTERES_SECCION_RESUMEN = Target.the("Cantidad de caracteres en la sección resumen").located(By.id("character_count"));
    public static final Target PALABRAS_SECCION_RESUMEN = Target.the("Cantidad de Palabras en la sección resumen").located(By.id("word_count"));


}
