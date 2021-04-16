package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosPasoTres {

    public static final Target CLICK_YOUR_COMPUTER = Target.the("click en la opcion your computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));

    public static final Target INPUT_COMPUTER = Target.the("selecciona el tipo de computadora")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target VERSION = Target.the("click en la opcion version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));

    public static final Target INPUT_VERSION = Target.the("selecciona la version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target CLICK_LANGUAGE = Target.the("click en la opcion seleccionar lenguaje")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));

    public static final Target INPUT_LANGUAGE = Target.the("selecciona el lenguaje")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target CLICK_DISP = Target.the("click en la opcion seleccionar dispositivo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span/i"));

    public static final Target INPUT_DISP = Target.the("selecciona el dispositivo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target CLICK_MODEL = Target.the("click en la opcion seleccionar model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));

    public static final Target INPUT_MODEL = Target.the("selecciona el modelo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target CLICK_SYSTEM = Target.the("click en la opcion seleccionar sistema operativo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));

    public static final Target INPUT_SYSTEM = Target.the("selecciona el sistema operativo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target NEXT3 = Target.the("siguiente ventana de registro")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
