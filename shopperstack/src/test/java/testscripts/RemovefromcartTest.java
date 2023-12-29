package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.Homepage;
import objectrepository.RemovefromCartpage;

public class RemovefromcartTest extends Baseclass {
	@Test
	public void removefromcart() {
	Homepage homepage = new Homepage(driver);
	RemovefromCartpage removefromCartpage = new RemovefromCartpage(driver);
	homepage.getShoppingCartLink().click();
	removefromCartpage.getRemovefromcart().click();
	removefromCartpage.getUpdateShoppingCart().click();
	}
}
