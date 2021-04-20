package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.model.Data;
import co.com.choucair.certification.retotecnico.questions.Answerr;
import co.com.choucair.certification.retotecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



import java.util.List;

public class RetotecnicoStepdefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El usuario quiere registrarse en la pagina de UTtest$")
    public void elUsuarioQuiereRegistrarseEnLaPaginaDeUTtest() {
        OnStage.theActorCalled("pedro").wasAbleTo(OpenUp.thePage(),Join.ThePage());
    }


    @When("^Diligencia el formulario de inscripcion en la pagina de UTest$")
    public void diligenciaElFormularioDeInscripcionEnLaPaginaDeUTest(List<Data> data) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(PasoUno.Reg(data.get(0).getStrfirstname(),data.get(0).getStrlastname(),data.get(0).getStremail(),
                data.get(0).getStrmonth(),data.get(0).getStrday(),data.get(0).getStryear()),
                PasoDos.Ubi(data.get(0).getStrcity(),data.get(0).getStrcpostal(),data.get(0).getStrcountry()),
                PasoTres.Disp(data.get(0).getStrcomputer(),data.get(0).getStrversion(),data.get(0).getStrlanguage(),data.get(0).getStrmobiledevice(),data.get(0).getStrmodel(),data.get(0).getStrosystem()),
                PasoCuatro.comp(data.get(0).getStrpassword()));
    }

    @Then("^el se registro satisfactoriamente$")
    public void elSeRegistroSatisfactoriamente(List<Data> data) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answerr.toThe(data.get(0).getStrverificado())));

    }
}
