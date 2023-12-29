package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailAFriendPage extends Basepage {

	public EmailAFriendPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "[alt='Picture of Blue and green Sneaker']")
	private WebElement BlueandgreenSneakerImage;
    @FindBy(css = "[value='Email a friend']")
    private WebElement EmailAFriendButton;
    @FindBy(id = "FriendEmail")
    private WebElement FriendEmailTextField;
    @FindBy(name = "send-email")
    private WebElement sendEmailButton;
	public WebElement getBlueandgreenSneakerImage() {
		return BlueandgreenSneakerImage;
	}
	public WebElement getEmailAFriendButton() {
		return EmailAFriendButton;
	}
	public WebElement getFriendEmailTextField() {
		return FriendEmailTextField;
	}
	public WebElement getSendEmailButton() {
		return sendEmailButton;
	}
}
