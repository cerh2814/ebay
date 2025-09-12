Feature: Validar pagina de eBay
  @ebay
  Scenario: Validar URL de la pagina principal
    Given que abro el navegador e ingreso a la URL de eBay
    Then valido que la URL es correcta