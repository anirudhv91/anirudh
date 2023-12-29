package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveCompareProductsPage extends Basepage {

	public RemoveCompareProductsPage(WebDriver driver) {
		super(driver);
	}
@FindBy(css = "[value='Remove']")
private WebElement RemoveCompareProductsButton;
public WebElement getRemoveCompareProductsButton() {
	return RemoveCompareProductsButton;
}
}
