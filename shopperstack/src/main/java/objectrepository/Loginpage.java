package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericlibrary.Fileutility;

public class Loginpage extends Basepage {

	public Loginpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "Email")
	private WebElement email;
	@FindBy(id = "Password")
	private WebElement password;
	@FindBy(id = "RememberMe")
	private WebElement rememberme;
	@FindBy(linkText = "Forgot password?")
	private WebElement forgotpassword;
	@FindBy(css = "[value='Log in']")
	private WebElement loginbutton;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRememberme() {
		return rememberme;
	}

	public WebElement getForgotpassword() {
		return forgotpassword;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void login(WebDriver driver) {
		
		Homepage homepage = new Homepage(driver);
		Loginpage loginpage = new Loginpage(driver);
		homepage.getLoginLink().click();
		loginpage.getEmail().sendKeys(Fileutility.getproperty("email"));
		loginpage.getPassword().sendKeys("password");
		loginpage.getRememberme().click();
		loginpage.getLoginbutton().click();

}
   public void logout(WebDriver driver) {
	   
	   Homepage homepage = new Homepage(driver);
	   homepage.getLogoutlink().click();
   }
	

	
}
