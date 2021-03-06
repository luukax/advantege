#Author: lucasarthurpaifilho@lucasarthurpaifilho.com

@login 
Feature: Login
  Eu com usuario quero realizar o login para ter acesso ao servico

  Background:  
    Given que eu esteja no endereço "https://www.advantageonlineshopping.com/#/"
    And acesso o incone USER
    
  @positivo  
  Scenario: Login de usuario cadastrado
    When preencher o formuario de login
    Then valido usuario logado no MY ACCOUNT
  @negativo
    Scenario: Login de usuario nao cadastrado
    When preencher o formuario de login com dados nao cadastrados
    Then valido que o sistema nao permite o login
  @negativo
    Scenario: Login de usuario com senha incorreta
    When preencher formuario de login com usuario cadastrado e senha incorreta 
    Then valido que o sistema nao permite efetuar o login
    
    

 
