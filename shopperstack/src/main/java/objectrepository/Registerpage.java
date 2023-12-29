package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends Basepage {

	public Registerpage(WebDriver driver) {
		super(driver);
	}
@FindBy(id = "gender-male")
private WebElement male;
@FindBy(id = "FirstName")
private WebElement FirstName;
@FindBy(id = "LastName")
private WebElement LastName;
@FindBy(id = "Email")
private WebElement email;
@FindBy(id = "Password")
private WebElement password;
@FindBy(id = "ConfirmPassword")
private WebElement ConfirmPassword;
@FindBy(id = "register-button")
private WebElement registerbutton;
public WebElement getMale() {
	return male;
}
public WebElement getFirstName() {
	return FirstName;
}
public WebElement getLastName() {
	return LastName;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getConfirmPassword() {
	return ConfirmPassword;
}
public WebElement getRegisterbutton() {
	return registerbutton;
}

}
