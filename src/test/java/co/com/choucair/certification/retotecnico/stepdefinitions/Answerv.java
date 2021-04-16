package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.userinterface.DatosPasoCuatro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.mockito.stubbing.Answer;

public class Answerv implements Question<Boolean> {
    private String strverificado;

    public Answerv (String strverificado){
        this.strverificado=strverificado;
    }

    public static Answerv toThe(String strverificado) {
        return new Answerv(strverificado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String TextConfirm= Text.of(DatosPasoCuatro.CONFIRMA).viewedBy(actor).asString();

        if (strverificado.equals(TextConfirm)){
            result=true;
        }
        else {
            result=false;
        }
        return result;
    }
}
