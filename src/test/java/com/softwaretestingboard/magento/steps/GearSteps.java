package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GearSteps {

    @Given("I Mouse Hover on Gear Menu")
    public void iMouseHoverOnGearMenu() {
        new GearPage().mouseHoverOnGear();
    }

    @When("I Click on Bags")
    public void iClickOnBags() {
    }

    @And("I Click on Product Name ‘Overnight Duffle’")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().clickOnOvernightDuffle();
    }

    @And("I Verify the text ‘Overnight Duffle’")
    public void iVerifyTheTextOvernightDuffle(String result) {
        String expectedText = "Overnight Duffle";
        String actualText = new GearPage().verifyOvernightDuffle(result);
        Assert.assertEquals(actualText, expectedText, "Message not displayed");
    }

    @And("I Change Qty {int}")
    public void iChangeQty(int arg0) {
        new GearPage().enter3("3");
    }

    @And("I Click on ‘Add to Cart’ Button.")
    public void iClickOnAddToCartButton() {
        new GearPage().addOnCart();
    }

    @And("I Verify the text ‘You added Overnight Duffle to your shopping cart.’")
    public void iVerifyTheTextYouAddedOvernightDuffleToYourShoppingCart(String result) {
        String expectedText = "You added Overnight Duffle to your shopping cart.";
        String actualText = new GearPage().verifyByCart(result);
        Assert.assertEquals(actualText, expectedText, "Message not displayed");
    }

    @And("I Verify the Qty is ‘{int}’")
    public void iVerifyTheQtyIs(String result) {
        String expectedText = "3";
        String actualText = new GearPage().verifyBy3(result);
        Assert.assertEquals(actualText, expectedText, "Message not displayed");
    }

    @And("I Verify the product price ‘${double}’")
    public void iVerifyTheProductPrice$(String result) {
        String expectedText = "$135";
        String actualText = new GearPage().verifyBy$135(result);
        Assert.assertEquals(actualText, expectedText, "Message not displayed");
    }

    @And("I Change Qty to ‘{int}’")
    public void iChangeQtyTo(int arg0) {
        new GearPage().changeBy5("5");
    }

    @And("I Click on ‘Update Shopping Cart’ button")
    public void iClickOnUpdateShoppingCartButton() {
        new GearPage().clickOnUpdate();
    }

    @Then("I Verify the product price ‘${double}’")
    public void iVerifyTheProductPrice$225(String result) {
        String expectedText = "$225";
        String actualText = new GearPage().verifyBy$225(result);
        Assert.assertEquals(actualText, expectedText, "Message not displayed");
    }
}
