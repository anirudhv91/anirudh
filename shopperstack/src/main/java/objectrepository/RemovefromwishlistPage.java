package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemovefromwishlistPage extends Basepage {

	public RemovefromwishlistPage(WebDriver driver) {
		super(driver);
	}
@FindBy(name = "removefromcart")
private WebElement removefromwishlist;
@FindBy(css = "[value='Update wishlist']")
private WebElement UpdateWishlist;
public WebElement getRemovefromwishlist() {
	return removefromwishlist;
}
public WebElement getUpdateWishlist() {
	return UpdateWishlist;
}
}
