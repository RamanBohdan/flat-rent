package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class RealtPage extends BasePage {

    @FindBy(xpath = "//a[@href='https://realt.by/rent/flat-for-long/1k/']")
    private WebElement buttonApartmentsForRent;
    @FindBy(xpath = "(//div[@class='region-selection'])[1]")
    private WebElement buttonRegion;

    public RealtPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public RealtPage getChooseRegion(String region) {
        buttonRegion.click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonRegion));
        String selectChooseRegion = "(//div[@class='region-selection'])[1]";
        List<WebElement> chooseRegion = driver.findElements(By.xpath(selectChooseRegion));
        for (WebElement regionPlace : chooseRegion) {
            if (region.equals(regionPlace.getText().trim())) {
                regionPlace.click();
                break;
            }

        }
        return this;
    }

    public SearchFlatPage openApartmentsPage() {
        buttonApartmentsForRent.click();
        return new SearchFlatPage(driver);
    }
}
