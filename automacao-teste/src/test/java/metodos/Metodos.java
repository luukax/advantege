package metodos;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Metodos {
	
	WebDriver driver;
	
	/**
	 * esse metodo abre o navegador chorme com o endere�o desejado
	 * @param site
	 * @author LUCAS
	 */
	public void abrirNavegador(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.err.println("*****erro ao abrir navegador******" +e.getMessage());
		}
	}
	/**
	 * esse metodo clica no elemento referenciado
	 * @author LUCAS
	 */
	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			} catch (Exception e) {
			System.err.println("****erro ao clicar em elemento*****" +e.getMessage());
			System.err.println("****causa****" +e.getCause());
		}
	}	
	/**
	 * esse metodo procura o campo para digitar e escreve o texto desejado
	 * @author LUCAS
	 */
	public void digitarTexto(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("****erro ao digitar  texto em elemento*****" +e.getMessage());	    
		}
	}
	/**
	 * esse metodo coleta evidencia do passo
	 * @author LUCAS
	 */
	public void TirarEvidencia(String nome) throws IOException {
		try {
			TakesScreenshot screenshot = ((TakesScreenshot) driver);
			File scrFile = screenshot.getScreenshotAs(OutputType.FILE);
			File desFile = new File("./Evidencias/"+nome+".png");
			FileUtils.copyFile(scrFile, desFile);
		} catch (Exception e) {
			System.err.println("****erro ao digitar evidencia*****" +e.getMessage());
		}
		
	}
	public void fecharNavegado() {
		driver.close();
	}
	/**
	 * esse metodo valida a url atual do passo com a url esperada
	 * @author LUCAS
	 */
	public void validarUrl(String urlEsperada) {
		String urlAtual = driver.getCurrentUrl();
		assertEquals(urlAtual, urlEsperada);
		System.out.println(urlAtual);
	}
	/**
	 * esse metodo valida mensagem no elemento pesquisado
	 * @author LUCAS
	 */
	public void validarMensagem(By elemento, String msgEsperada) {
		try {
			String msg = driver.findElement(elemento).getText();

			System.out.println(msg);
		} catch (Exception e) {
			System.err.println("****erro ao validar msg do elemento*****" +e.getMessage());
		}
		
}

}