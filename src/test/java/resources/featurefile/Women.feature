@regression

Feature: As User I want to search product on Women page

  Background: I Mouse Hover on Women Menu
    And I Mouse Hover on Tops
    And I Click on Jackets

@smoke
  Scenario: verify the  sort by product name filter
  And I  Select Sort By filter “Product Name”
  Then I Verify the products name display in alphabetical order

@sanity
  Scenario: verifyTheSortByPriceFilter
  And  I Select Sort By filter “Price”
  Then I Verify the products price display in Low to High