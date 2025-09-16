Feature: login en eBay
  @Login
  Scenario Outline: Validar login en eBay
    Given que abro el navegador e ingreso a la URL de eBay
    Then ingreso el usuario "<usuario>"
    Then valido usuario
    Then ingreso la contrasena "<pass>"
    Then valido contraseña
    Then valido que el login fue exitoso

    Examples:
      | usuario   | pass        |
      | testuser1 | password123 |
      | testuser2        | password456 |
      | testuser3        | password789 |