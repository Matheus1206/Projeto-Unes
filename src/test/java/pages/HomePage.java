package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver navegador){
       super(navegador);
    }

    public QuemSomosPage clicarHomePage(){
        navegador.findElement(By.linkText("Home")).click();
        return new QuemSomosPage(navegador);
    }

    public ContatoPage clicarContato(){
        navegador.findElement(By.linkText("Contato")).click();
        return new ContatoPage(navegador);
    }
}
