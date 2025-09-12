Feature: Seleccionar y filtrar gorras en eBay

  Scenario: Seleccionar el tamaño y la marca de una gorra
    Given que el usuario está en la página de resultados de búsqueda de gorras en eBay
    When el usuario selecciona la talla "<tamano>"
    And selecciona size


