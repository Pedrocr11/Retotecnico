package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosPasoUno {

    public static final Target INPUT_FIRSTNAME = Target.the("ingreso del nombre")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("ingreso del segundo nombre")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("ingresa el email")
            .located(By.id("email"));

    public static final Target INPUT_MONTH = Target.the("ingresa el mes de cumpleaños")
            .located(By.name("birthMonth"));

    public static final Target INPUT_DAY = Target.the("ingresa el dia del compleaños")
            .located(By.name("birthDay"));

    public static final Target INPUT_YEAR = Target.the("ingresa el año de cumpleaños")
            .located(By.name("birthYear"));

    public static final Target NEXTBUTTON = Target.the("siguiente pagina")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
