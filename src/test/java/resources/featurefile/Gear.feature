
@regression
Feature: GearPage
  As user I want to add product  successfully into cart on Gear page
@smoke
  Scenario: user should add product successfully to shopping cart
  Given  I Mouse Hover on Gear Menu
  When  I Click on Bags
  And I Click on Product Name ‘Overnight Duffle’
  And I Verify the text ‘Overnight Duffle’
  And I Change Qty 3
  And  I Click on ‘Add to Cart’ Button.
  And I Verify the text ‘You added Overnight Duffle to your shopping cart.’
  And I Click on ‘shopping cart’ Link into message
  And  I Verify the product name ‘Cronus Yoga Pant’

  And  I Verify the Qty is ‘3’
  And I Verify the product price ‘$135.00’
  And I Change Qty to ‘5’
  And I Click on ‘Update Shopping Cart’ button
  Then I Verify the product price ‘$225.00’