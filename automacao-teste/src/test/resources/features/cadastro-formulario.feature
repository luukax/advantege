#Author: lucasarthurpaifilho@lucasarthurpaifilho.com

@cadastro 
Feature: Realizar Cadastro
  Eu como usuario quero fazer o cadastro para ter acesso ao servico


Background:  
    Given que eu esteja no "https://www.advantageonlineshopping.com/#/"
    And clico no incone USER
   
  @positvo
  Scenario: Cadastro com sucesso
    When preencho o formulario de CREATE ACCOUNT
    And aceito os termos de privacidade
    Then regitro o cadastro
    And valido a home page logado com o usuario cadastrado
   @negativo
   Scenario: Cadastro usuario ja existente
    When preencho o formulario de CREATE ACCOUNT com usuario ja existente
    And aceito os termos de privacidade
    But o regitro o cadastro nao e permitido
   @positivo
   Scenario: Excluir conta
    When faz login
    And acessar My Account
    And clicar na opcao Delete Account
    Then valido exclusao da conta
   @negativo
   Scenario: Preecher de forma incorreta
    When preencher formulario de CREATE ACCOUNT de forma incorreta
    But nao conclui o cadastro