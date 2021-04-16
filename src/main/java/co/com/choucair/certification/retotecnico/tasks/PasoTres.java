package co.com.choucair.certification.retotecnico.tasks;
import co.com.choucair.certification.retotecnico.userinterface.DatosPasoTres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class PasoTres implements Task {

    private String strcomputer;
    private String strversion;
    private String strlanguage;
    private String strmobiledevice;
    private String strmodel;
    private String strosystem;

    public PasoTres(String strcomputer, String strversion, String strlanguage, String strmobiledevice, String strmodel, String strosystem) {
        this.strcomputer = strcomputer;
        this.strversion = strversion;
        this.strlanguage = strlanguage;
        this.strmobiledevice=strmobiledevice;
        this.strmodel=strmodel;
        this.strosystem=strosystem;

    }



    public static PasoTres Disp(String strcomputer, String strversion, String strlanguage,String strmobiledevice,String strmodel,String strosystem) {
        return Tasks.instrumented(PasoTres.class,strcomputer,strversion,strlanguage, strmobiledevice, strmodel, strosystem);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DatosPasoTres.CLICK_YOUR_COMPUTER),
                Enter.theValue(strcomputer).into(DatosPasoTres.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(DatosPasoTres.INPUT_COMPUTER),
                Click.on(DatosPasoTres.VERSION),
                Enter.theValue(strversion).into(DatosPasoTres.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(DatosPasoTres.INPUT_VERSION),
                Click.on(DatosPasoTres.CLICK_LANGUAGE),
                Enter.theValue(strlanguage).into(DatosPasoTres.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(DatosPasoTres.INPUT_LANGUAGE),

                Click.on(DatosPasoTres.CLICK_DISP),
                Enter.theValue(strmobiledevice).into(DatosPasoTres.INPUT_DISP),
                Hit.the(Keys.ENTER).into(DatosPasoTres.INPUT_DISP),

                Click.on(DatosPasoTres.CLICK_MODEL),
                Enter.theValue(strmodel).into(DatosPasoTres.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(DatosPasoTres.INPUT_MODEL),

                Click.on(DatosPasoTres.CLICK_SYSTEM),
                Enter.theValue(strosystem).into(DatosPasoTres.INPUT_SYSTEM),
                Hit.the(Keys.ENTER).into(DatosPasoTres.INPUT_SYSTEM),


                Click.on(DatosPasoTres.NEXT3));
    }
}
