package testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import genericlibrary.Baseclass;
import objectrepository.Bookpage;
import objectrepository.Homepage;

public class Bookstest extends Baseclass {
	@Test
	public void verifyBookPage_001() {
		Homepage homepage = new Homepage(driver);
		Bookpage bookpage = new Bookpage(driver);
		Reporter.log("verify bookpage is displayed", true);
		homepage.getBookslink().click();
		String pageheading = bookpage.getBooksPageHeading().getText();
		Assert.assertEquals(pageheading, "Books", "Books is not displayed");
		test.log(LogStatus.PASS, "test case completed");
		Reporter.log("test case completed", true);
	    }
		
		public void sortBooksByNameAndPrice_002() throws InterruptedException {
			Homepage homepage = new Homepage(driver);
			Bookpage bookpage = new Bookpage(driver);
			homepage.getBookslink().click();
			selectOptionByIndex(bookpage.getSortByDropDown(), 2);
			Thread.sleep(2000);
			test.log(LogStatus.FAIL, "Test case 2 failed");
			}
		public void sortBooksByPageSize() throws InterruptedException {
			Homepage homepage = new Homepage(driver);
			Bookpage bookpage = new Bookpage(driver);
			homepage.getBookslink().click();
			selectOptionByIndex(bookpage.getPageSizeDropDown(), 2);
			Thread.sleep(2000);
		}
		
	
}