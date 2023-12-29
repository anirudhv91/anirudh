package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.Homepage;
import objectrepository.JewelryPage;

public class JewelryTest extends Baseclass {
	@Test
	public void diamondHeartTest_001() {
		Homepage homepage = new Homepage(driver);
		JewelryPage jewelryPage = new JewelryPage(driver);
        getScreenshotOfWebpage(driver);
        clickElement(homepage.getJewelryLink());
        getScreenshotOfWebElement(jewelryPage.getBlackandWhiteDiamondHeartImage());
        String str = "hi";
		
	}

}
