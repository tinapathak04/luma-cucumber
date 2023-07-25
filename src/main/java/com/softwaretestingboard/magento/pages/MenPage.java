package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MenPage extends Utility {

    private static final Logger log = LogManager.getLogger(MenPage.class.getName());

    public MenPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Men')]" )
    WebElement menMenu;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Men')]" )
    WebElement clickingMenu;
    @CacheLookup
    @FindBy(linkText ="Bottoms" )
    WebElement mouseHoverBottoms;

    @CacheLookup
    @FindBy(linkText ="Pants" )
    WebElement hoverPants;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement clickPants;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Cronus Yoga Pant')]" )
    WebElement hoverCronusYogaPant;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]" )
    WebElement clickSize32;

    @CacheLookup
    @FindBy(xpath ="//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]" )
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]" )
    WebElement clickBlackColour;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]" )
    WebElement verifyTextProductName;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'shopping cart')]" )
    WebElement clickCart;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[1]/h1[1]/span[1]" )
    WebElement textShoppingCart;

    @CacheLookup
    @FindBy(xpath ="//tbody/tr[1]/td[1]/div[1]/strong[1]/a[1]" )
    WebElement textCronusYogaPant;

    @CacheLookup
    @FindBy(xpath ="//dd[contains(text(),'32')]" )
    WebElement verifyProduct32;
    @CacheLookup
    @FindBy(xpath ="//dd[contains(text(),'Black')]" )
    WebElement verifyProductBlack;


    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(menMenu);
        log.info("Mouse hover on Menu :" + menMenu.toString());
    }
    public void clickingOnMenu(){
        clickOnElement(clickingMenu);
        log.info("Click on menu : " + clickingMenu.toString());
    }
    public void hoverOnBottoms(){
        mouseHoverToElement(mouseHoverBottoms);
        log.info("Mouse hover on bottom : " + mouseHoverBottoms.toString());
    }
    public void hoverOnPants(){
        mouseHoverToElement(hoverPants);
        log.info("Mouse hover on pants : " + hoverPants.toString());
    }
    public void clickOnPants(){
        clickOnElement(clickPants);
        log.info("Click on pants : " + clickPants.toString());
    }
    public void hoverOnCronusYogaPant(){
        mouseHoverToElement(hoverCronusYogaPant);
        log.info("Mouse hover on CronusYoga pant: " + hoverCronusYogaPant.toString());
    }
    public void clickOnSize32(){
        clickOnElement(clickSize32);
        log.info("Click on siz2 32 : "+ clickSize32.toString());
    }
    public void addToShoppingCart(){
        clickOnElement(addToCart);
        log.info("Add into shopping cart :"+ addToCart.toString());
    }
    public void clickOnBlackColour(){
        clickOnElement(clickBlackColour);
        log.info("Click on black colour :" + clickBlackColour.toString());
    }
    public String verifyByTextShopping(String result){
        result =  getTextFromElement(verifyTextProductName);
        log.info("Verify Product name :"+ verifyTextProductName.toString());
        return  result;
    }
    public void clickOnCart(){
        clickOnElement(clickCart);
        log.info("Click on cart : " + clickCart.toString());
    }
    public String verifyTextOnShoppingCart(String result){
        result = getTextFromElement(textShoppingCart);
        log.info("verify text shopping cart :" + textShoppingCart.toString());
        return result;
    }
    public String verifyCronusYogaPant(String result){
        result = getTextFromElement(textCronusYogaPant);
        log.info("Verify text on CronusYoga pant :" + textCronusYogaPant.toString());
        return  result;
    }
    public String verifyOn32(String result){
        result = getTextFromElement(verifyProduct32);
        log.info("Verify product on 32 : " + verifyProduct32.toString());
        return result;
    }
    public String verifyOnBlack(String result){
        result = getTextFromElement(verifyProductBlack);
        log.info("Verify product black : " + verifyProductBlack.toString());
        return result;
    }
}
