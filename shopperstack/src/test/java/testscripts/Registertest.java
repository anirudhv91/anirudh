package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.Homepage;
import objectrepository.Registerpage;

public class Registertest extends Baseclass {
	@Test
	public void register() throws InterruptedException {
		Homepage homepage = new Homepage(driver);
		Registerpage registerpage = new Registerpage(driver);
		homepage.getRegisterLink().click();
		Thread.sleep(2000);
		registerpage.getMale().click();
		Thread.sleep(2000);
		registerpage.getFirstName().sendKeys("saran");
		Thread.sleep(2000);
		registerpage.getLastName().sendKeys("raj");
		Thread.sleep(2000);
		registerpage.getEmail().sendKeys("saran583@gmail.com");
		Thread.sleep(2000);
		registerpage.getPassword().sendKeys("saran@123");
		Thread.sleep(2000);
		registerpage.getConfirmPassword().sendKeys("saran@123");
		Thread.sleep(2000);
		registerpage.getRegisterbutton().click();
		Thread.sleep(2000);
	}

}
