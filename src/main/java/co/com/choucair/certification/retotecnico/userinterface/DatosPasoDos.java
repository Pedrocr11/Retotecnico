package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosPasoDos {

    public static final Target INPUTCITY = Target.the("Seleccion de la ciudad")
            .located(By.id("city"));

    public static final Target INPUT_CPOSTAL = Target.the("ingreso del codigo postal de la ciudad")
            .located(By.id("zip"));

    public static final Target CLICKCOUNTRY = Target.the("selecciona del pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));

    public static final Target INPUT_COUNTRY = Target.the("ingresa el pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target CLICKNEXT = Target.the("siguiente paso del registro")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}