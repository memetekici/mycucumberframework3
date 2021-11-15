package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GlobalTraderPage {

    public GlobalTraderPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[@class='icon_widh'])[5]")
    public WebElement computerOfficeButton;

    @FindBy(linkText = "USB Flash Drives")
    public WebElement usbFlashDrivesButton;

    @FindBy(xpath = "//div[@class='col-sm-6 col-md-12 col-xs-12 alert alert-danger ']")
    public WebElement message;

}
