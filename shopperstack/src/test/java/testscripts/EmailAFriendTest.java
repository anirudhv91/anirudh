package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.EmailAFriendPage;
import objectrepository.Homepage;

public class EmailAFriendTest extends Baseclass {
	@Test
	public void EmailAFriend() {
		Homepage homepage = new Homepage(driver);
		EmailAFriendPage emailAFriendPage = new EmailAFriendPage(driver);
		homepage.getApparelAndShoesLink().click();
		emailAFriendPage.getBlueandgreenSneakerImage().click();
		emailAFriendPage.getEmailAFriendButton().click();
		emailAFriendPage.getFriendEmailTextField().sendKeys("saran@gmail.com");
		emailAFriendPage.getSendEmailButton().click();
		
	}

}
