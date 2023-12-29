package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.Cellphonepage;
import objectrepository.Homepage;

public class Cellphonetest extends Baseclass {
	@Test
	public void cellPhoneOrder() {
		Homepage homepage = new Homepage(driver);
		Cellphonepage cellphonepage = new Cellphonepage(driver);
		homepage.getElectronicslink().click();
		cellphonepage.getCellphonelink().click();
		cellphonepage.getCellphoneimage().click();
		cellphonepage.getAddtocartbutton().click();
		cellphonepage.getShoppingcartlink().click();
		//add country name
		cellphonepage.getTermsofservice().click();
		cellphonepage.getCheckout().click();
		cellphonepage.getFirstname().sendKeys("anirudh");
		cellphonepage.getLastname().sendKeys("venkat");
		cellphonepage.getEmail().sendKeys("anirudhv91@gmail.com");
		//get country name
		cellphonepage.getCity().sendKeys("chennai");
		cellphonepage.getAddress1().sendKeys("rajendra colony");
		cellphonepage.getZipcode().sendKeys("600093");
		cellphonepage.getPhonenumber().sendKeys("9894850211");
		cellphonepage.getBillingaddresscontinuebutton().click();
		cellphonepage.getShippingFirstName().sendKeys("anirudh");
		cellphonepage.getShippinglastName().sendKeys("venkat");
		cellphonepage.getShippingemail().sendKeys("anirudhv91@gmail.com");
		cellphonepage.getShippingAddress1().sendKeys("saligrammam");
		cellphonepage.getShippingZipCode().sendKeys("600093");
		cellphonepage.getShippingPhoneNumber().sendKeys("9894850211");
		cellphonepage.getShippingaddressbutton().click();
		cellphonepage.getGround().click();
		cellphonepage.getShippingmethodcontinuebuttons().click();
		cellphonepage.getCashOnDelivery().click();
		cellphonepage.getPaymentMethodContinueButton().click();
		cellphonepage.getPaymentInfoContinueButton().click();
		cellphonepage.getConfirmButton().click();
		
		
		
		
	}
	
	

}
