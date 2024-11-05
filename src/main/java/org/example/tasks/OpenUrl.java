package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.core.Serenity.getDriver;

public class OpenUrl implements Task {

    String urlBase= "https://wordcounter.net/";

    public static OpenUrl word(){
        return Tasks.instrumented(OpenUrl.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        getDriver().manage().window().maximize();
        actor.attemptsTo(
                Open.url(urlBase)
        );

    }
}
