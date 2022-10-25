#autor: Wilson Buelvas
Feature: Registro de usuario en AdvantageDemo
  Yo como usuario
  deseo realizar el registro de usuarios en la pagina de Advantage
  para realizar compras de productos

  Background:
    Given Juan esta en la pagina de AdvantageDemo

  Scenario: Registro de usuarios
    When crea una cuenta para comprar productos
    Then la cuenta es creada correctamente

  Scenario: Login de usuario Previamente registrado
    When realiza el proceso de Login con usuario registrado
    Then ingresa a la pagina principal correctamente