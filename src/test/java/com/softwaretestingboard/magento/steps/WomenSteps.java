package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class WomenSteps {

    @Given("I Mouse Hover on Women Menu")
    public void iMouseHoverOnWomenMenu() {
        new WomenPage().mouseHoverOnWomenMenu();
    }
    @When("I Mouse Hover on Tops")
    public void iMouseHoverOnTops() {
        new WomenPage().mouseHoverOnTop();
    }

    @And("I Click on Jackets")
    public void iClickOnJackets() {
        new WomenPage().mouseHoverOnJackets();
    }

    @And("I  Select Sort By filter “Product Name”")
    public void iSelectSortByFilterProductName(String name) {
        new WomenPage().sortByProductName(name);
    }

    @Then("I Verify the products name display in alphabetical order")
    public void iVerifyTheProductsNameDisplayInAlphabeticalOrder(String result) {
        String expectedText = "Set Ascending Direction";
        String actualText =new WomenPage().verifyProductInAlphabeticalOrder(result);
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
    }

    @And("I Select Sort By filter “Price”")
    public void iSelectSortByFilterPrice(String price) {
        new WomenPage().sortByPrice(price);
    }

    @Then("I Verify the products price display in Low to High")
    public void iVerifyTheProductsPriceDisplayInLowToHigh(String result) {
        String expectedText = "Set Ascending Direction";
        String actualText = new WomenPage().verifyLowToHigh(result);
        Assert.assertEquals(actualText,expectedText,"Message not displayed");

    }
}
