package co.com.choucair.certification.retotecnico.tasks;
import co.com.choucair.certification.retotecnico.userinterface.DatosPasoCuatro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PasoCuatro implements Task {

    private String strpassword;

    public PasoCuatro (String strpassword){
        this.strpassword=strpassword;
    }
    public static PasoCuatro comp(String strpassword) {
        return Tasks.instrumented(PasoCuatro.class,strpassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strpassword).into(DatosPasoCuatro.PASSWORD_1),
                Enter.theValue(strpassword).into(DatosPasoCuatro.PASSWORD_2),
                Click.on(DatosPasoCuatro.STAY),
                Click.on(DatosPasoCuatro.TERMINOS),
                Click.on(DatosPasoCuatro.PRIVACY),
                Click.on(DatosPasoCuatro.NEXT4));
    }
}


