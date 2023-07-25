package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.MenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MenSteps {


    @When("I Mouse Hover on Bottoms")
    public void iMouseHoverOnBottoms() {
        new MenPage().hoverOnBottoms();
    }

    @And("I Click on Pants")
    public void iClickOnPants() {
        new MenPage().clickOnPants();
    }

    @When("I Mouse Hover on product name‘Cronus Yoga Pant’ and click on size {int}.")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSize() {
        new MenPage().clickOnSize32();
    }

    @And("I Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new MenPage().clickOnBlackColour();
    }

    @And("I Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new MenPage().addToShoppingCart();
    }

    @And("I Verify the text‘You added Cronus Yoga Pant to your shopping cart.’")
    public void iVerifyTheTextYouAddedCronusYogaPantToYourShoppingCart(String result) {
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText =new MenPage().verifyByTextShopping(result);
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
    }

    @And("I Click on ‘shopping cart’ Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new MenPage().clickOnCart();
    }

    @And("I Verify the text ‘Shopping Cart.’")
    public void iVerifyTheTextShoppingCart(String result) {
        String expectedText = "Shopping Cart";
        String actualText = new MenPage().verifyTextOnShoppingCart(result);
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
    }

    @And("I Verify the product name ‘Cronus Yoga Pant’")
    public void iVerifyTheProductNameCronusYogaPant(String result) {
        String expectedText = "Cronus Yoga Pant";
        String actualText = new MenPage().verifyCronusYogaPant(result);
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
    }

    @And("I Verify the product size ‘{int}’")
    public void iVerifyTheProductSize(String result) {
        String expectedText = "32";
        String actualText = new MenPage().verifyOn32(result);
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
    }

    @And("I Verify the product colour ‘Black’")
    public void iVerifyTheProductColourBlack(String result) {
        String expectedText = "Black";
        String actualText = new MenPage().verifyOnBlack(result);
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
    }
}
