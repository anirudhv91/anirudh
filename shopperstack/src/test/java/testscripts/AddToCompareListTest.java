package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.AddToCompareListPage;
import objectrepository.Homepage;

public class AddToCompareListTest extends Baseclass {
	@Test
	public void AddToCompareList() {
		Homepage homepage = new Homepage(driver);
		AddToCompareListPage addToCompareListPage = new AddToCompareListPage(driver);
		homepage.getDigitaldownloadslink().click();
		addToCompareListPage.getThirdAlbumimage().click();
		addToCompareListPage.getAddToCompareListButton().click();
		
	}

}
