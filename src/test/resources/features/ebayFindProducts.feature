Feature: Validar pagina de eBay
  @FindProdutcs
  Scenario Outline: Validar URL de la pagina principal
    Given que abro el navegador e ingreso a la URL de eBay
    Then valido que la URL es correcta
    Then buscar el producto "<producto>"

    Examples:
      | producto       |
      | PlayStation 5  |
      | Xbox Series X  |
      | Nintendo Switch|