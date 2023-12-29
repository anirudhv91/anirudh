package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.Homepage;
import objectrepository.NotebooksPage;

public class Notebooktest extends Baseclass {
	@Test
	public void Notebookorder() {
		Homepage homepage = new Homepage(driver);
		NotebooksPage notebooksPage = new NotebooksPage(driver);
		homepage.getComputerslink().click();
		notebooksPage.getNotebookslink().click();
		notebooksPage.getLaptopimage().click();
		notebooksPage.getAddtocartbuttonlink().click();
		notebooksPage.getShoppingcartlink().click();
		// add country
		notebooksPage.getTermsofservice().click();
		notebooksPage.getCheckoutButton().click();
		notebooksPage.getFirstname().sendKeys("anirudh");
		notebooksPage.getLastname().sendKeys("venkat");
		notebooksPage.getEmail().sendKeys("anirudhv91@gmail.com");
		// select country
		notebooksPage.getCity().sendKeys("chennai");
		notebooksPage.getAddress1().sendKeys("parvati hotel");
		notebooksPage.getZipcode().sendKeys("600093");
		notebooksPage.getPhonenumber().sendKeys("9894850211");
		notebooksPage.getBillingaddresscontinuebutton().click();
		notebooksPage.getShippingFirstName().sendKeys("anirudh");
		notebooksPage.getShippinglastName().sendKeys("venkat");
		notebooksPage.getShippingemail().sendKeys("anirudhv91@gmail.com");
		// select country
		notebooksPage.getShippingCity().sendKeys("chennai");
		notebooksPage.getShippingAddress1().sendKeys("parvati hotel");
		notebooksPage.getZipcode().sendKeys("600093");
		notebooksPage.getShippingPhoneNumber().sendKeys("9894850211");
		notebooksPage.getSecondDayAir().click();
		notebooksPage.getPurchaseOrder().click();
		notebooksPage.getPaymentMethodContinueButton().click();
		notebooksPage.getPaymentInfoContinueButton().click();
		notebooksPage.getConfirmButton().click();

	}

}
