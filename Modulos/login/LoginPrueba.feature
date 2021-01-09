Feature: Realizar un login sobre una pagina
  I want to use this template for my feature file

  @prioridadBaja
  Scenario: Realiza login con datos validos
    Given Abrir el navegador y la pagina
    And una vez que se abra dar el usuario y password y hacer login
    When Se inicie sesion
    And realizas una accion
    And validas otras accion
    Then cuando termines de validar
    And realiza log out
    
  @prioridadAlta
  Scenario: Registrar nuevo usuario
    Given Abrir el navegador y la pagina Contact Us
    And Una vez que se abra seleccionar el subject heading
    When Se ingresa un email address "aprendiendoselenium@gmail.com"
    And Se ingresa una order reference "12345678-2021"
    And Luego attach file "\\src\\Recursos\\dataset.txt"
    Then Escribes a message "Mensaje de prueba"
    And Send information
    And Cierra el navegador
    
  @prioridadAlta
  Scenario: Click en loguearse
    Given Abrir el navegador y la pagina Contact Us
    And Una vez que se abra seleccionar el subject heading
    When Se ingresa un email address "aprendiendoselenium@gmail.com"
    And Se ingresa una order reference "12345678-2021"
    And Luego attach file "\\src\\Recursos\\dataset.txt"
    Then Escribes a message "Mensaje de prueba"
    And Hace click en SignIn
    And Cierra el navegador

  @prioridadBaja
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
