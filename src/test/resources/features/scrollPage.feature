Feature: Funcionalidad de Scroll en la página web

  Scenario: Desplazar la página a un elemento específico marca
    Given el usuario está en la página web ebay
    When el usuario se desplaza hacia el elemento miles de juguetes
    Then el elemento juguetes es visible en la pantalla

