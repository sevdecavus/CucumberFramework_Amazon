package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonSearchSD {
    AmazonPage amazonPage = new AmazonPage();
    @Given("user go to Amazon webpage")
    public void user_go_to_amazon_webpage() {
        System.out.println("First Step");
        Driver.getDriver().get("https://amazon.com");
    }

    @Given("user write iphone on searchbox")
    public void user_write_iphone_on_searchbox() {
        System.out.println("Second Step");
        amazonPage.searchBox.sendKeys("iphone"+ Keys.ENTER);
    }
    @Then("user get resultNumber on the screen")
    public void user_get_result_number_on_the_screen() {
        System.out.println("Third Step");
        String resultNumber = amazonPage.resultNumber.getText();
        System.out.println(resultNumber);

    }
}
