package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContatoPage extends BasePage {
    public ContatoPage(WebDriver navegador) {
        super(navegador);
    }

    public ContatoPage clicarContato(){
        navegador.findElement(By.linkText("Contato")).click();
        return this;
    }

    public ContatoPage escreverEmail(String email){
        navegador.findElement(By.name("email")).sendKeys(email);
        return this;
    }

    public ContatoPage selecionaDepartamento(String tipoDepartamento){
        navegador.findElement(By.id(tipoDepartamento.toLowerCase())).click();
        return this;
    }

    public ContatoPage selecionaAssunto(String assunto){
       WebElement select = navegador.findElement(By.id("assunto"));
       new Select(select).selectByValue(assunto.toLowerCase());
       return this;
    }

    public ContatoPage escreverDescricao(String texto){
        navegador.findElement(By.id("descricao")).sendKeys(texto);
        return this;
    }

    public ContatoPage clicarEnviar(){
        navegador.findElement(By.id("enviar")).click();
        return this;
    }

    public ContatoPage validarMensagem(){
        String validaMensagem = navegador.switchTo().alert().getText();
        Assert.assertEquals("Enviado com sucesso!",validaMensagem);
        return this;
    }

    public void fechaNavegador(){
        navegador.quit();
    }

    public ContatoPage preencherFormulario(String email, String tipoDepartamento, String assunto, String texto){
        escreverEmail(email).selecionaDepartamento(tipoDepartamento).selecionaAssunto(assunto).escreverDescricao(texto).clicarEnviar();
        return this;
    }
}
