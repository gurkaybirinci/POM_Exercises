package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleHome {
//    public GoogleHome() {
//        PageFactory.initElements(Driver.getDriver(), this);
//    }

    @FindBy(name = "q")
    public WebElement search;

    @FindBy(name = "btnK")
    public WebElement button;
}