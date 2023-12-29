package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.Digitaldownloadspage;
import objectrepository.Homepage;

public class Digitaldownloadstest extends Baseclass {
	@Test
	public void digitalDownloadsorder() {
		Homepage homepage = new Homepage(driver);
		Digitaldownloadspage digitaldownloadspage = new Digitaldownloadspage(driver);
		homepage.getDigitaldownloadslink().click();
		digitaldownloadspage.getThirdAlbumimage().click();
		digitaldownloadspage.getAddToCartButton().click();
		digitaldownloadspage.getShoppingcartlink().click();
		// add country
		digitaldownloadspage.getTermsofservice().click();
		digitaldownloadspage.getCheckoutButton().click();
		digitaldownloadspage.getFirstname().sendKeys("anirudh");
		digitaldownloadspage.getLastname().sendKeys("venkat");
		digitaldownloadspage.getEmail().sendKeys("anirudhv91@gmail.com");
		// select country
		digitaldownloadspage.getCity().sendKeys("chennai");
		digitaldownloadspage.getAddress1().sendKeys("prasad hotel");
		digitaldownloadspage.getZipcode().sendKeys("600093");
		digitaldownloadspage.getPhonenumber().sendKeys("9894850211");
		digitaldownloadspage.getBillingaddresscontinuebutton().click();
		digitaldownloadspage.getShippingFirstName().sendKeys("anirudh");
		digitaldownloadspage.getShippinglastName().sendKeys("venkat");
		digitaldownloadspage.getShippingemail().sendKeys("anirudhv91@gmail.com");
		// select country
		digitaldownloadspage.getShippingCity().sendKeys("chennai");
		digitaldownloadspage.getShippingAddress1().sendKeys("prasad hotel");
		digitaldownloadspage.getZipcode().sendKeys("600093");
		digitaldownloadspage.getShippingPhoneNumber().sendKeys("9894850211");
		digitaldownloadspage.getGround().click();
		digitaldownloadspage.getPurchaseOrder().click();
		digitaldownloadspage.getPaymentMethodContinueButton().click();
		digitaldownloadspage.getPaymentInfoContinueButton().click();
		digitaldownloadspage.getConfirmButton().click();

	}

}
