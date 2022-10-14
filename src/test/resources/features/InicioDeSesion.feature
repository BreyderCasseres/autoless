#Autor: Breyder
#language:en

@InicioDeSesion
Feature: Inicio de sesion en el aplicativo LESS

  Scenario Outline: Inicio de sesion exitoso
    Given Que el usuario ingresa al aplicativo LESS
      | url   |
      | <url> |
    When Ingresa las credenciales de autenticacion
      | usuario   | contrasenia   |
      | <usuario> | <contrasenia> |
    Then visualiza su nombre en el home
      | <nombreDeUsuario> |
    Examples:
      | url                                                                                                  | usuario  | contrasenia | nombreDeUsuario   |
      | http://internal-ed0ed212-onboarding-apigat-0647-640244979.us-east-1.elb.amazonaws.com/portal/#/login | casserbr | C4ss3r3s*   | Breyder Casseres. |

