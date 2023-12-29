package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.ApparelAndShoesPage;
import objectrepository.Homepage;

public class ApparelAndShoesTest extends Baseclass {
	@Test
	public void ApparelAndShoesOrder() {
		Homepage homepage = new Homepage(driver);
		ApparelAndShoesPage apparelAndShoesPage = new ApparelAndShoesPage(driver);
		homepage.getApparelAndShoesLink().click();
		apparelAndShoesPage.getBlueandgreenSneakerImage().click();
		apparelAndShoesPage.getAddtocartbutton().click();
		apparelAndShoesPage.getShoppingcartlink().click();
		//add country
		apparelAndShoesPage.getTermsofservice().click();
		apparelAndShoesPage.getCheckoutButton().click();
		apparelAndShoesPage.getFirstname().sendKeys("anirudh");
		apparelAndShoesPage.getLastname().sendKeys("venkat");
		apparelAndShoesPage.getEmail().sendKeys("anirudhv91@gmail.com");
		//select country
		apparelAndShoesPage.getCity().sendKeys("chennai");
		apparelAndShoesPage.getAddress1().sendKeys("prasad lab");
		apparelAndShoesPage.getZipcode().sendKeys("600093");
		apparelAndShoesPage.getPhonenumber().sendKeys("9894850211");
		apparelAndShoesPage.getBillingaddresscontinuebutton().click();
		apparelAndShoesPage.getShippingFirstName().sendKeys("anirudh");
		apparelAndShoesPage.getShippinglastName().sendKeys("venkat");
		apparelAndShoesPage.getShippingemail().sendKeys("anirudhv91@gmail.com");
		//select country
		apparelAndShoesPage.getShippingCity().sendKeys("chennai");
		apparelAndShoesPage.getShippingAddress1().sendKeys("prasad lab");
		apparelAndShoesPage.getZipcode().sendKeys("600093");
		apparelAndShoesPage.getShippingPhoneNumber().sendKeys("9894850211");
		apparelAndShoesPage.getGround().click();
		apparelAndShoesPage.getcreditCard().click();
		apparelAndShoesPage.getPaymentMethodContinueButton().click();
		apparelAndShoesPage.getPaymentInfoContinueButton().click();
		apparelAndShoesPage.getConfirmButton().click();
		

	}

}
