package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;



public class FormularioDeCadastro {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {
		metodo.abrirNavegador(site);
	}
	@Given("clico no incone USER")
	public void clico_no_incone_user() {
		metodo.clicar(el.getMenuUser());
	
	}
	@When("preencho o formulario de CREATE ACCOUNT")
	public void preencho_o_formulario_de_create_account() throws InterruptedException {
		Thread.sleep(2000);
		metodo.clicar(el.getNovaConta());
		metodo.digitarTexto(el.getUserName(), "Robervalino");
		metodo.digitarTexto(el.getEmailRegisterPage(), "lukaz_somar@hotmail.com");
		metodo.digitarTexto(el.getPasswordRegisterPage(), "Test2@21");
		metodo.digitarTexto(el.getConfirmPasswordRegisterPage(), "Test2@21");
		metodo.digitarTexto(el.getFirstNameRegisterPage(), "Ribamar");
		metodo.digitarTexto(el.getLastNameRegisterPage(), "Silva");
		metodo.digitarTexto(el.getPhoneNumberRegisterPage(), "11950504040");
		metodo.digitarTexto(el.getCountryListboxRegisterPage(), "Brazil");
		metodo.digitarTexto(el.getCityRegisterPage(), "São Paulo");
		metodo.digitarTexto(el.getAddressRegisterPage(), "Av. Paulista");
		metodo.digitarTexto(el.getStateProvinceRegionRegisterPage(), "São Paulo");
		metodo.digitarTexto(el.getPostalCodeRegisterPage(), "15370-496");
		
	}
	@When("aceito os termos de privacidade")
	public void aceito_os_termos_de_privacidade() {
		metodo.clicar(el.getI_agree());
	}

	@Then("regitro o cadastro")
	public void regitro_o_cadastro() throws InterruptedException {
		Thread.sleep(1000);
		metodo.clicar(el.getRegisterBtnundefined());
	}

	@Then("valido a home page logado com o usuario cadastrado")
	public void valido_a_home_page_logado_com_o_usuario_cadastrado() throws IOException, InterruptedException {
		Thread.sleep(2000);
		metodo.TirarEvidencia("Evidencia de cadastro; tela logada, após preenchimento de cadastro");
		metodo.fecharNavegado();
	}
	@When("preencho o formulario de CREATE ACCOUNT com usuario ja existente")
	public void preencho_o_formulario_de_create_account_com_usuario_ja_existente() throws InterruptedException {
		Thread.sleep(2000);
		metodo.clicar(el.getNovaConta());
		metodo.digitarTexto(el.getUserName(), "Ribamarzeroaa");
		metodo.digitarTexto(el.getEmailRegisterPage(), "lukaz_somar@hotmail.com");
		metodo.digitarTexto(el.getPasswordRegisterPage(), "Test2@21");
		metodo.digitarTexto(el.getConfirmPasswordRegisterPage(), "Test2@21");
		metodo.digitarTexto(el.getFirstNameRegisterPage(), "Ribamar");
		metodo.digitarTexto(el.getLastNameRegisterPage(), "Silva");
		metodo.digitarTexto(el.getPhoneNumberRegisterPage(), "11950504040");
		metodo.digitarTexto(el.getCountryListboxRegisterPage(), "Brazil");
		metodo.digitarTexto(el.getCityRegisterPage(), "São Paulo");
		metodo.digitarTexto(el.getAddressRegisterPage(), "Av. Paulista");
		metodo.digitarTexto(el.getStateProvinceRegionRegisterPage(), "São Paulo");
		metodo.digitarTexto(el.getPostalCodeRegisterPage(), "15370-496");
	}
	@When("o regitro o cadastro nao e permitido")
	public void o_regitro_o_cadastro_nao_e_permitido() throws InterruptedException, IOException {
		metodo.clicar(el.getI_agree());
		Thread.sleep(1000);
		metodo.clicar(el.getI_agree());
		metodo.clicar(el.getRegisterBtnundefined());
		Thread.sleep(1000);
		metodo.validarMensagem(el.getUserExists(), "User name already exists");
		metodo.TirarEvidencia("Evidencia de cadastro; após preenchimento com dados de usuario já cadastrado");
		metodo.fecharNavegado();
	}
		@When("faz login")
		public void faz_login() {
			  metodo.digitarTexto(el.getName(), "Robervalino");
			  metodo.digitarTexto(el.getPassword(), "Test2@21");
			  metodo.clicar(el.getSign());
		}
		@When("acessar My Account")
		public void acessar_my_account() throws InterruptedException {
			Thread.sleep(2000);
			metodo.clicar(el.getUserLogin());
		    metodo.clicar(el.getMyAccount());
		}
		@When("clicar na opcao Delete Account")
		public void clicar_na_opcao_delete_account() throws InterruptedException {
			 Thread.sleep(2000);
		   metodo.clicar(el.getDeleteAccount());
		   metodo.clicar(el.getAceiteDelete());
		}
		@Then("valido exclusao da conta")
		public void valido_exclusao_da_conta() throws IOException, InterruptedException {
			Thread.sleep(2000);
		   metodo.TirarEvidencia("Evidencia de exclir conta existente");
		   metodo.fecharNavegado();
		}	
	@When("preencher formulario de CREATE ACCOUNT de forma incorreta")
	public void preencher_formulario_de_create_account_de_forma_incorreta() throws InterruptedException, IOException {
		Thread.sleep(2000);
		metodo.clicar(el.getNovaConta());
		metodo.digitarTexto(el.getUserName(), "teste");
		metodo.digitarTexto(el.getEmailRegisterPage(), "testestets");
		metodo.digitarTexto(el.getPasswordRegisterPage(), "1010");
		metodo.validarMensagem(el.getMsgEmailinvalid(), "Your email address isn't formatted correctly");
		metodo.digitarTexto(el.getConfirmPasswordRegisterPage(), "1010");
		metodo.validarMensagem(el.getMsgSenhaSemRequisto(), "One lower letter required");
		Thread.sleep(1000);
		metodo.TirarEvidencia("Evidencia de cadastro; preenchimento incorreto de email e senha");
		metodo.digitarTexto(el.getFirstNameRegisterPage(), "Ribamar");
		metodo.digitarTexto(el.getLastNameRegisterPage(), "Silva");
		metodo.digitarTexto(el.getPhoneNumberRegisterPage(), "11950504040");
		metodo.digitarTexto(el.getCountryListboxRegisterPage(), "Brazil");
		metodo.digitarTexto(el.getCityRegisterPage(), "São Paulo");
		metodo.digitarTexto(el.getAddressRegisterPage(), "Av. Paulista");
		metodo.digitarTexto(el.getStateProvinceRegionRegisterPage(), "São Paulo");
		metodo.digitarTexto(el.getPostalCodeRegisterPage(), "15370-496");
	}
	@When("nao conclui o cadastro")
	public void nao_conclui_o_cadastro() throws IOException, InterruptedException {
	   metodo.clicar(el.getI_agree());
	   metodo.clicar(el.getRegisterBtnundefined());
	   Thread.sleep(1000);
	   metodo.TirarEvidencia("Evidencia de cadastro; teste de preenchimento incorreto Botão 'REGISTER' não fica clicavel com preenchimento incorreto");
	   metodo.fecharNavegado();
	}
}