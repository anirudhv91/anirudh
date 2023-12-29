package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.GiftCardspage;
import objectrepository.Homepage;

public class GiftCardsTest extends Baseclass {
	@Test
	public void GiftCardsOrder() {
		Homepage homepage = new Homepage(driver);
		GiftCardspage giftCardspage = new GiftCardspage(driver);
		homepage.getGiftCardsLink().click();
		giftCardspage.get$25VirtualGiftCardimage().click();
		giftCardspage.getGiftcardRecipientName().click();
		giftCardspage.getGiftcardRecipientEmail().click();
		giftCardspage.getAddtocartbutton().click();
		giftCardspage.getShoppingcartlink().click();
		// add country
		giftCardspage.getTermsofservice().click();
		giftCardspage.getCheckoutButton().click();
		giftCardspage.getFirstname().sendKeys("anirudh");
		giftCardspage.getLastname().sendKeys("venkat");
		giftCardspage.getEmail().sendKeys("anirudhv91@gmail.com");
		// select country
		giftCardspage.getCity().sendKeys("chennai");
		giftCardspage.getAddress1().sendKeys("balaji hotel");
		giftCardspage.getZipcode().sendKeys("600093");
		giftCardspage.getPhonenumber().sendKeys("9894850211");
		giftCardspage.getBillingaddresscontinuebutton().click();
		giftCardspage.getShippingFirstName().sendKeys("anirudh");
		giftCardspage.getShippinglastName().sendKeys("venkat");
		giftCardspage.getShippingemail().sendKeys("anirudhv91@gmail.com");
		// select country
		giftCardspage.getShippingCity().sendKeys("chennai");
		giftCardspage.getShippingAddress1().sendKeys("balaji hotel");
		giftCardspage.getZipcode().sendKeys("600093");
		giftCardspage.getShippingPhoneNumber().sendKeys("9894850211");
		giftCardspage.getNextDayAir().click();
		giftCardspage.getPurchaseOrder().click();
		giftCardspage.getPaymentMethodContinueButton().click();
		giftCardspage.getPaymentInfoContinueButton().click();
		giftCardspage.getConfirmButton().click();

	}

}
