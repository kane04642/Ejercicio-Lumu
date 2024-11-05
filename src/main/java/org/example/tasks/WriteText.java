package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.interfaces.PageWord.TEXT_WORD;

public class WriteText implements Task {

    private String text;
    public WriteText(String text){
        this.text= text;
    }

    public static WriteText wordType(String text){
        return instrumented(WriteText.class, text);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(text).into(TEXT_WORD)
        );

    }
}
