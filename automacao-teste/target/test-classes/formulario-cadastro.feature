#Author: lucasarthurpaifilho@lucasarthurpaifilho.com


Feature: Realizar Cadastro
  Eu como usuario quero fazer o cadastro para ter acesso ao servi�o


Background:  
    Given que eu esteja no "https://www.advantageonlineshopping.com/#/"
    And clico no incone USER
    And clico na opcao CREATE NEW ACCOUNT
  
  Scenario: Cadastro com sucesso
    When preencho o formulario de CREATE ACCOUNT
    And aceito os termos de privacidade
    Then regitro o cadastro
    And valido a home page logado com o usuario cadastrado

  
