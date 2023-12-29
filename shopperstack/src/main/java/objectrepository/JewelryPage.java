package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JewelryPage extends Basepage {

	public JewelryPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Black & White Diamond Heart")
	private WebElement blackandWhiteDiamondHeartLink;
	@FindBy(css = "[alt='Picture of Black & White Diamond Heart']")
	private WebElement blackandWhiteDiamondHeartImage;
    @FindBy(xpath = "//a[.='Black & White Diamond Heart']/../..//span")
    private WebElement blackandWhiteDiamondHeartPrice;
    @FindBy(xpath = "//a[.='Black & White Diamond Heart']/../..//input")
    private WebElement blackandWhiteDiamondHeartAddToCartButton;
	public WebElement getBlackandWhiteDiamondHeartLink() {
		return blackandWhiteDiamondHeartLink;
	}
	public WebElement getBlackandWhiteDiamondHeartImage() {
		return blackandWhiteDiamondHeartImage;
	}
	public WebElement getBlackandWhiteDiamondHeartPrice() {
		return blackandWhiteDiamondHeartPrice;
	}
	public WebElement getBlackandWhiteDiamondHeartAddToCartButton() {
		return blackandWhiteDiamondHeartAddToCartButton;
	}
    
}
