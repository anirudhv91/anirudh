package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemovefromCartpage extends Basepage {

	public RemovefromCartpage(WebDriver driver) {
		super(driver);
	}
@FindBy(css = "[value='3792460']")
private WebElement removefromcart;
@FindBy(css = "[value='Update shopping cart']")
private WebElement UpdateShoppingCart;
public WebElement getRemovefromcart() {
	return removefromcart;
}
public WebElement getUpdateShoppingCart() {
	return UpdateShoppingCart;
}

}
