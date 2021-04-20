package co.com.choucair.certification.retotecnico.questions;

import co.com.choucair.certification.retotecnico.userinterface.DatosPasoCuatro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answerr implements Question<Boolean> {
    private String strverificado;

    public Answerr(String strverificado){
        this.strverificado=strverificado;
    }

    public static Answerr toThe(String strverificado) {
        return new Answerr(strverificado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String TextConfirm=Text.of(DatosPasoCuatro.CONFIRMA).viewedBy(actor).asString();

        if (strverificado.equals(TextConfirm)){
            result=true;
        }
        else {
            result=false;
        }
        return result;
    }
}

