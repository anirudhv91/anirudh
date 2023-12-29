package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.Homepage;
import objectrepository.RemovefromwishlistPage;

public class RemovefromwishlistTest extends Baseclass {
	@Test
	public void Removefromwishlist() {
		Homepage homepage = new Homepage(driver);
		RemovefromwishlistPage removefromwishlistPage = new RemovefromwishlistPage(driver);
		homepage.getWishlistLink().click();
		removefromwishlistPage.getRemovefromwishlist().click();
		removefromwishlistPage.getUpdateWishlist().click();
	}

}
