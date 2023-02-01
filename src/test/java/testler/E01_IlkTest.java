package testler;

import org.junit.Test;
import pages.GoogleHome;
import pages.GoogleResult;
import utilities.Driver;

public class E01_IlkTest {

    @Test
    public void test01() {
        Driver.getDriver().get("https://www.google.com");
        // Google Anasayfası
        GoogleHome googleHome = new GoogleHome();
        googleHome.search.sendKeys("iphone");
        googleHome.button.click();

        //Google Arama Sonuç Sayfası
        GoogleResult googleResult = new GoogleResult();
        googleResult.gorsellerButonu.click();
        googleResult.alisverisButonu.click();

        Driver.quitDriver();
    }
}