package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCompareListPage extends Basepage {

	public AddToCompareListPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css = "[alt='Picture of 3rd Album']")
	private WebElement thirdAlbumimage;
	@FindBy(css = "[value='Add to compare list']")
	private WebElement AddToCompareListButton;
	public WebElement getThirdAlbumimage() {
		return thirdAlbumimage;
	}
	public WebElement getAddToCompareListButton() {
		return AddToCompareListButton;
	}
	
}
