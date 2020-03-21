package configuration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfiguracaoNavegador {



    public static WebDriver criarChrome(){
        final String WEBDRIVER = "webdriver.chrome.driver";
        final String CAMINHO = "C:\\Users\\bande\\OneDrive\\Área de Trabalho\\Drivers\\chromedriver.exe";

        System.setProperty(WEBDRIVER,CAMINHO);
        WebDriver navegador = new ChromeDriver();
        navegador.get("file:///C:/workspace-web/ProjetoFinalHtml/index.html");
        navegador.manage().window().maximize();
        return navegador;
    }

}
