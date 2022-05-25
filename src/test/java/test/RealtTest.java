package test;

import org.testng.annotations.Test;
import pageobject.RealtPage;
import pageobject.SearchFlatPage;

public class RealtTest extends AbstractTest {

    @Test
    public void testSingleRoomPage() {
        String region = "Минск и обл.";
        String nameCity = "Минск";
        String nameDistrict = "Центральный район";

        SearchFlatPage searchFlatPage = new RealtPage(driver)
                .openHomePage()
                .getChooseRegion(region)
                .openApartmentsPage()
                .getChooseCity(nameCity)
                .getChooseDistrict(nameDistrict);
    }

}
