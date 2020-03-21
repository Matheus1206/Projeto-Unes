package tests;

import configuration.ConfiguracaoNavegador;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import static org.junit.Assert.*;


@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "PrimeiraAutomacaoDados.csv")

public class PrimeiraAutomacao {
    private WebDriver navegador = ConfiguracaoNavegador.criarChrome();
    private HomePage paginaInicial = new HomePage(navegador);

    @Test
   public void navegarPagina(){
        paginaInicial.clicarHomePage().clicarQuemSomos().clicarContato();
   }

    @Test
    public void preencherFormulario(@Param(name="email")String email, @Param(name="tipoDepartamento")String departamento, @Param(name="assunto")String assunto, @Param(name="texto")String texto){
        paginaInicial.clicarContato().preencherFormulario(email,departamento,assunto,texto).validarMensagem().fechaNavegador();

    }


}
