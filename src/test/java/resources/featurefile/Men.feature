@regression
Feature: MenPage
  As user I want to search product into men page

  Background: I Mouse Hover on Men Menu
    When I Mouse Hover on Bottoms
    And I Click on Pants
@smoke
Scenario: user should add product successfully to shopping cart
    When I Mouse Hover on product name‘Cronus Yoga Pant’ and click on size 32.
    And I Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
    And I Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
    And I Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
    And I Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
    And I Click on ‘shopping cart’ Link into message
    And I Verify the text ‘Shopping Cart.’
    And I Verify the product name ‘Cronus Yoga Pant’
    And I Verify the product size ‘32’
    And I Verify the product colour ‘Black’