# Autor: Jorge Luis Barrios Mejia
@stories
Feature: As a register user, I want to buy a t-shirt on the page.
  @scenario1
  Scenario: Successful purchase
    Given Jorge wants to buy a t-shirt on the page
    When the user selects the item and completes the purchase
    | theEmail                        | thePassword  |
    | alt.co-04x3oit@yopmail.com      | georgedj     |
    Then purchase is complete when the I confirm my order button appears
