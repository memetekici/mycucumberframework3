package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GlobalTraderPage;
import utilities.ConfigReader;
import utilities.Driver;

public class GlobalTrader {
    GlobalTraderPage globalTraderPage = new GlobalTraderPage();

    @Given("User go on the global trader webpage")
    public void user_go_on_the_global_trader_webpage() {
        Driver.getDriver().get(ConfigReader.getProperty("global_trader_url"));
    }

    @Given("click on the Computer&Office button")
    public void click_on_the_Computer_Office_button() {
        globalTraderPage.computerOfficeButton.click();

    }

    @Given("click the USB Flash Drives button")
    public void click_the_USB_Flash_Drives_button() {
        globalTraderPage.usbFlashDrivesButton.click();
    }

    @Then("Verify {string} message")
    public void verify_message(String string) throws InterruptedException {
        Thread.sleep(3000);
        String message1 = globalTraderPage.message.getText();
        Assert.assertEquals("Record Not Found..",message1);

    }

}
