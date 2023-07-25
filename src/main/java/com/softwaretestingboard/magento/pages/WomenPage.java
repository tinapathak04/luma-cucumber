package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage extends Utility {

    private static final Logger log = LogManager.getLogger(WomenPage.class.getName());

    public WomenPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Women')]" )
    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Women')]")
     WebElement clickMenu;
    @CacheLookup
    @FindBy(linkText ="Tops" )
    WebElement hoverTop ;

    @CacheLookup
    @FindBy(linkText ="Jackets" )
    WebElement hoverJackets;
    //By clickJackets = By.xpath("//strong[contains(text(),'Jackets')]");

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]" )
     WebElement selectProduct;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]" )
    WebElement clickElement;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]" )
    WebElement verifyProductName;

    @CacheLookup
    @FindBy(linkText ="Tops" )
    WebElement mouseHoverTops;

    @CacheLookup
    @FindBy(linkText ="Jackets" )
    WebElement mouseHoverJackets;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]" )
    WebElement sortPrice;

    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]" )
    WebElement verifyByLowToHigh;







    public void mouseHoverOnWomenMenu(){
        mouseHoverToElement(womenMenu);
        log.info("Mouse hover on Women menu : " + womenMenu.toString());
    }
    public void clickOnMenu(){
        clickOnElement(clickMenu);
        log.info("Click on menu : "+ clickMenu.toString());
    }
    public void mouseHoverOnTop(){
        mouseHoverToElement(hoverTop);
        log.info("mouse hover on top : " + hoverTop.toString());
    }
    public void mouseHoverToJackets(){
        clickOnElement(hoverJackets);
        log.info("Mouse hover to Jackets : " + hoverJackets.toString());
    }

    //public void clickOnJackets(){
        //mouseHoverToElement(clickJackets);
   // }

    public void sortByProductName(String productName){
        selectByValueFromDropDown(selectProduct,productName);
        log.info("Sort by Productname :"+ selectProduct.toString());
    }
    public void clickOnElement(){
        clickOnElement(clickElement);
        log.info("click on element : " + clickElement.toString());
    }
    public String verifyProductInAlphabeticalOrder(String result){
        result = getTextFromElement(verifyProductName);
        log.info("Verify Product in alphabetical order : " + verifyProductName.toString());
        return  result;
    }
    public void mouseHoverOnTops(){
        mouseHoverToElement(mouseHoverTops);
        log.info("Mouse hover on tops :"+ mouseHoverTops.toString());
    }
    public void mouseHoverOnJackets(){
        mouseHoverToElement(mouseHoverJackets);
        log.info("Mouse hover on Jackets : "+ mouseHoverJackets.toString());
    }
    public void sortByPrice(String Price){
        selectByValueFromDropDown(sortPrice,Price);
        log.info("Sort by price : " + sortPrice.toString());
    }
    public String verifyLowToHigh(String result){
        result = getTextFromElement(verifyByLowToHigh);
        log.info("Verify low to high :"+ verifyByLowToHigh.toString());
        return result;
    }


}
