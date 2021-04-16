package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.DatosPasoDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PasoDos implements Task {

    private String strcity;
    private String strcpostal;
    private String strcountry;

    public PasoDos (String strcity, String strcpostal, String strcountry){

        this.strcity=strcity;
        this.strcpostal=strcpostal;
        this.strcountry=strcountry;
    }

    public static PasoDos Ubi(String strcity, String strcpostal, String strcountry) {
        return Tasks.instrumented(PasoDos.class, strcity, strcpostal, strcountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strcity).into(DatosPasoDos.INPUTCITY),
                Enter.theValue(strcpostal).into(DatosPasoDos.INPUT_CPOSTAL),
                Click.on(DatosPasoDos.CLICKCOUNTRY),
                Enter.theValue(strcountry).into(DatosPasoDos.INPUT_COUNTRY),
                Click.on(DatosPasoDos.CLICKNEXT));
    }
}
