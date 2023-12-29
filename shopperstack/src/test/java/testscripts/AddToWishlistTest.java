package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.ApparelAndShoesPage;
import objectrepository.Homepage;

public class AddToWishlistTest extends Baseclass {
	@Test
	public void AddToWishlist() {
	Homepage homepage = new Homepage(driver);
	ApparelAndShoesPage apparelAndShoesPage = new ApparelAndShoesPage(driver);
	homepage.getWishlistLink().click();
	apparelAndShoesPage.getBlueandgreenSneakerImage().click();
	apparelAndShoesPage.getWishlistButton().click();
	}
}
