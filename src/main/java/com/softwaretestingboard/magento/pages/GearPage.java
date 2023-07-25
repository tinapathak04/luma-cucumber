package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GearPage extends Utility {

    private static final Logger log = LogManager.getLogger(GearPage.class.getName());

    public GearPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Gear')]" )
    WebElement hoverOnGear;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Gear')]")
    WebElement clickGear;

    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Overnight Duffle']")
    WebElement clickOvernightDuffle;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Overnight Duffle')]" )
    WebElement textOvernightDuffel;

    @CacheLookup
    @FindBy(xpath ="//input[@id='qty']" )
    WebElement change3;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Add to Cart')]" )
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]" )
    WebElement verifyCart;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'shopping cart')]" )
    WebElement clickShoppingCart;

    @CacheLookup
    @FindBy(xpath ="//input[@title='Qty']" )
    WebElement verify3;

    @CacheLookup
    @FindBy(xpath = "//span[@data-bind='text: getValue()']")
    WebElement verify$135;

    @CacheLookup
    @FindBy(xpath ="//input[@class='input-text qty']" )
    WebElement change5;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Update Shopping Cart')]")
    WebElement clickUpdate;

    @CacheLookup
    @FindBy(xpath ="//td[@class='col subtotal']//span[text()='$225.00']" )
    WebElement verify$225;


    public void mouseHoverOnGear(){
        mouseHoverToElement(hoverOnGear);
        log.info("Mouse hover on Gear :" + hoverOnGear.toString());
    }
    public void clickOnGear(){
        clickOnElement(clickGear);
        log.info("Click on Gear :" + clickGear.toString());
    }
    public void clickOnOvernightDuffle(){
        clickOnElement(clickOvernightDuffle);
        log.info("Click on overnight duffel :" + clickOvernightDuffle.toString());
    }
    public String verifyOvernightDuffle(String result){
        result = getTextFromElement(textOvernightDuffel);
        log.info("Verify text overnight duffel :" + textOvernightDuffel.toString());
        return  result;
    }
    public void enter3 (String number){
        sendTextToElement(change3,number);
        log.info("Chang qty : " + change3.toString());
    }
    public void addOnCart (){
        clickOnElement(addToCart);
        log.info("Add to cart : " + addToCart.toString());
    }
    public String verifyByCart(String result){
        result = getTextFromElement(verifyCart);
        log.info("Verify cart : " + verifyCart.toString());
        return  result;
    }
    public void clickCart(){
        clickOnElement(clickShoppingCart);
        log.info("Click on cart : "+ clickShoppingCart.toString());
    }
    public String verifyBy3(String result){
        result =  getTextFromElement(verify3);
        log.info("Verify By 3 :"+ verify3.toString());
        return result;
    }
    public String verifyBy$135(String result){
        result = getTextFromElement(verify$135);
      log.info("Verify by $135 :" + verify$135.toString());
      return result;
    }
    public void changeBy5(String number){
        sendTextToElement(change5,number);
        log.info("Change by 5 :" + change5.toString());
    }
    public void clickOnUpdate(){
        clickOnElement(clickUpdate);
        log.info("Click on update :"+ clickUpdate.toString());
    }
    public String verifyBy$225(String result){
        result = getTextFromElement(verify$225);
        log.info("Verify by $225 :"+ verify$225.toString());
        return result;
    }







}
