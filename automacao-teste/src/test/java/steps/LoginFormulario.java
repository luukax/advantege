package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class LoginFormulario {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	@Given("que eu esteja no endereço {string}")
	public void que_eu_esteja_no_endereço(String site) {
	    metodo.abrirNavegador(site);
	}
	@Given("acesso o incone USER")
	public void acesso_o_incone_user() {
	   metodo.clicar(el.getMenuUser());
	}
	@When("preencher o formuario de login")
	public void preencher_o_formuario_de_login() {
	  metodo.digitarTexto(el.getName(), "Ribamarz");
	  metodo.digitarTexto(el.getPassword(), "Test2@21");
	  metodo.clicar(el.getSign());
	}
	@Then("valido usuario logado no MY ACCOUNT")
	public void valido_usuario_logado() throws InterruptedException, IOException {
		Thread.sleep(2000);
		metodo.TirarEvidencia("Evidencia de Login; pagina logada após preencher formulario de login");
	    metodo.clicar(el.getUserLogin());
	    Thread.sleep(2000);
	    metodo.clicar(el.getMyAccount());
	    Thread.sleep(2000);
	    metodo.validarUrl("https://www.advantageonlineshopping.com/#/myAccount");
	    metodo.TirarEvidencia("Evidencia de teste de Login; dados da conta no My Account");
	    metodo.fecharNavegado();
	}
	@When("preencher o formuario de login com dados nao cadastrados")
	public void preencher_o_formuario_de_login_com_dados_nao_cadastrados() {
		 metodo.digitarTexto(el.getName(), "testenegativo");
		  metodo.digitarTexto(el.getPassword(), "Teste00");
	}
	@Then("valido que o sistema nao permite o login")
	public void valido_que_o_sistema_nao_permite_o_login() throws IOException, InterruptedException {
		 metodo.clicar(el.getSign());
		 Thread.sleep(2000);
		 metodo.validarMensagem(el.getSignInResultMessage(), "Incorrect user name or password.");
		 metodo.TirarEvidencia("Evidencia de Login; preechimento com dados de usuario não cadastrado.");
		 metodo.fecharNavegado();
	}
	@When("preencher formuario de login com usuario cadastrado e senha incorreta")
	public void preencher_formuario_de_login_com_usuario_cadastrado_e_senha_incorreta() {
		metodo.digitarTexto(el.getName(), "Ribamarz");
		  metodo.digitarTexto(el.getPassword(), "Teste00");
	}
	@Then("valido que o sistema nao permite efetuar o login")
	public void valido_que_o_sistema_nao_permite_efetuar_o_login() throws InterruptedException, IOException {
		 metodo.clicar(el.getSign());
		 metodo.validarMensagem(el.getSignInResultMessage(), "Incorrect user name or password.");
		 Thread.sleep(2000);
		 metodo.TirarEvidencia("Evidencia de Login; preechimento com usuario cadastrado com senha incorreta.");
		 metodo.fecharNavegado();
	}
}
