package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.Homepage;
import objectrepository.RemoveCompareProductsPage;

public class RemoveCompareProductsTest extends Baseclass {
	@Test
	public void RemoveCompareProducts() {
		Homepage homepage = new Homepage(driver);
		RemoveCompareProductsPage removeCompareProductsPage = new RemoveCompareProductsPage(driver);
		homepage.getCompareProductslistLink().click();
		removeCompareProductsPage.getRemoveCompareProductsButton().click();
	}

}
