package co.com.choucair.certification.retotecnico.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class DatosPasoCuatro {

    public static final Target PASSWORD_1 = Target.the("Se ingresa la contraseña de usuairo")
            .located(By.id("password"));

    public static final Target PASSWORD_2 = Target.the("se confirma la contraseña")
            .located(By.id("confirmPassword"));

    public static final Target STAY = Target.the("aceptar Stay")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target TERMINOS = Target.the("acepta los terminos")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target PRIVACY = Target.the("aceptar las politicas")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target NEXT4 = Target.the("boton paso siguiente")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));

    public static final Target CONFIRMA =Target.the("mensaje de verificacion")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[2]"));
}


