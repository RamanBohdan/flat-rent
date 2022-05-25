package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchFlatPage extends BasePage {

    @FindBy(xpath = "(//div[@class='fast-links-selection'])[2]")
    private WebElement selectCity;
    @FindBy(xpath = "(//div[@class='fast-links-selection'])[4]")
    private WebElement selectCDistrict;

    public SearchFlatPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SearchFlatPage getChooseCity(String nameCity) {
        Actions action = new Actions(driver);
        String selectChooseCity = "(//div[@class='fast-links-selection'])[2]";
        action.moveToElement(driver.findElement(By.xpath(String.format(selectChooseCity, nameCity))))
                .click().build().perform();
        wait.until(ExpectedConditions.visibilityOf(selectCity));
        return this;
    }

    public SearchFlatPage getChooseDistrict(String nameDistrict) {
        Actions action = new Actions(driver);
        String selectChooseDistrict = "(//div[@class='fast-links-selection'])[4]";
        action.moveToElement(driver.findElement(By.xpath(String.format(selectChooseDistrict, nameDistrict))))
                .click().build().perform();
        return this;
    }

}
