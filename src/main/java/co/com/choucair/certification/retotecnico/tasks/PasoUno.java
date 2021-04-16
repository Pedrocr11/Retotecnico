package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.DatosPasoUno;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class PasoUno implements Task {

    private String strfirstname;
    private String strlastname;
    private String stremail;
    private String strmonth;
    private String strday;
    private String stryear;

    public PasoUno(String strfirstname, String strlastname, String stremail, String strmonth, String strday, String stryear){

        this.strfirstname=strfirstname;
        this.strlastname=strlastname;
        this.stremail=stremail;
        this.strmonth=strmonth;
        this.strday=strday;
        this.stryear=stryear;
    }

    public static PasoUno Reg(String strfirstname, String strlastname, String stremail, String strmonth,
                               String strday, String stryear) {
        return Tasks.instrumented(PasoUno.class, strfirstname, strlastname, stremail, strmonth, strday,stryear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strfirstname).into(DatosPasoUno.INPUT_FIRSTNAME),
                Enter.theValue(strlastname).into(DatosPasoUno.INPUT_LASTNAME),
                Enter.theValue(stremail).into(DatosPasoUno.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strmonth).from(DatosPasoUno.INPUT_MONTH),
                SelectFromOptions.byVisibleText(strday).from(DatosPasoUno.INPUT_DAY),
                SelectFromOptions.byVisibleText(stryear).from(DatosPasoUno.INPUT_YEAR),
                Click.on(DatosPasoUno.NEXTBUTTON));
    }
}
