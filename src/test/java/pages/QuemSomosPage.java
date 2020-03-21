package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuemSomosPage extends BasePage {

    public QuemSomosPage(WebDriver navegador) {
       super(navegador);
    }

    public ContatoPage clicarQuemSomos(){
        navegador.findElement(By.linkText("Quem somos")).click();
        return new ContatoPage(navegador);
    }
}
