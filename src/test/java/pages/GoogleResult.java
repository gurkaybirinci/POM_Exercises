package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleResult {
//    public GoogleResult() {
//        PageFactory.initElements(Driver.getDriver(), this);
//    }

    @FindBy(linkText = "Görseller")
    public WebElement gorsellerButonu;

    @FindBy(linkText = "Alışveriş")
    public WebElement alisverisButonu;
}