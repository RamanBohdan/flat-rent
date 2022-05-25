package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class AbstractPage {
    public WebDriver driver;
    public static final Logger logger = LogManager.getLogger();
    public final static String BASE_URL = "https://realt.by/";
    public final static String APARTMENTS_URL = BASE_URL + "/rent/flat-for-long/";
    public final static String APARTMENTS_SINGLE_ROOM_URL = BASE_URL + "rent/flat-for-long/1k/";

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public RealtPage openHomePage() {
        driver.get(BASE_URL);
        return new RealtPage(driver);
    }
}