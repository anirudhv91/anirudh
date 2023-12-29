package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.DesktopPage;
import objectrepository.Homepage;

public class Desktoptest extends Baseclass {
	@Test
	public void desktoporder() {
	Homepage homepage = new Homepage(driver);
	DesktopPage desktopPage = new DesktopPage(driver);
	homepage.getComputerslink().click();
	desktopPage.getDesktopslink().click();
	desktopPage.getDesktopimage().click();
	desktopPage.getHDDbutton().click();
	desktopPage.getAddToCartButton().click();
	desktopPage.getShoppingcartlink().click();
	//add country name
	desktopPage.getTermsofservice().click();
	desktopPage.getCheckoutButton().click();
	desktopPage.getFirstname().sendKeys("anirudh");
	desktopPage.getLastname().sendKeys("venkat");
	desktopPage.getEmail().sendKeys("anirudhv91@gmail.com");
	//select country
	desktopPage.getCity().sendKeys("chennai");
	desktopPage.getAddress1().sendKeys("prasad studio");
	desktopPage.getZipcode().sendKeys("600093");
	desktopPage.getPhonenumber().sendKeys("9894850211");
	desktopPage.getBillingaddresscontinuebutton().click();
	desktopPage.getShippingFirstName().sendKeys("anirudh");
	desktopPage.getShippinglastName().sendKeys("venkat");
	desktopPage.getShippingemail().sendKeys("anirudhv91@gmail.com");
	//select country
	desktopPage.getShippingCity().sendKeys("chennai");
	desktopPage.getShippingAddress1().sendKeys("prasad studio");
	desktopPage.getZipcode().sendKeys("600093");
	desktopPage.getShippingPhoneNumber().sendKeys("9894850211");
	desktopPage.getGround().click();
	desktopPage.getMoneyOrder().click();
	desktopPage.getPaymentMethodContinueButton().click();
	desktopPage.getPaymentInfoContinueButton().click();
	desktopPage.getConfirmButton().click();
	
	}
}
