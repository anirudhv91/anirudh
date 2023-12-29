package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {

	public Homepage(WebDriver driver) {
	super(driver);	
	}
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingCartLink;
	@FindBy(linkText = "Wishlist")
	private WebElement wishlistLink;
	@FindBy (id = "small-searchterms")
	private WebElement searchTextField;
	@FindBy (css = "[value='Search']")
	private WebElement searchButton;
	@FindBy(linkText = "Books")
	private WebElement bookslink;
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelryLink;
	@FindBy(linkText = "Electronics")
	private WebElement electronicslink;
	@FindBy(linkText = "Computers")
	private WebElement Computerslink;
	@FindBy(linkText = "Apparel & Shoes")
	private WebElement ApparelAndShoesLink;
	@FindBy(linkText = "Digital downloads")
	private WebElement Digitaldownloadslink;
	@FindBy(linkText = "Gift Cards")
	private WebElement GiftCardsLink;
	@FindBy(linkText = "Compare products list")
	private WebElement CompareProductslistLink;
	public WebElement getCompareProductslistLink() {
		return CompareProductslistLink;
	}
	public WebElement getGiftCardsLink() {
		return GiftCardsLink;
	}
	public WebElement getDigitaldownloadslink() {
		return Digitaldownloadslink;
	}
	public WebElement getApparelAndShoesLink() {
		return ApparelAndShoesLink;
	}
	public WebElement getComputerslink() {
		return Computerslink;
	}
	public WebElement getElectronicslink() {
		return electronicslink;
	}
	public WebElement getJewelryLink() {
		return jewelryLink;
	}
	@FindBy(partialLinkText = "Log out")
	private WebElement logoutlink;
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}
	public WebElement getLoginLink() {
		return loginLink;
	}
	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}
	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
	public void setShoppingCartLink(WebElement shoppingCartLink) {
		this.shoppingCartLink = shoppingCartLink;
	}
	public WebElement getWishlistLink() {
		return wishlistLink;
	}
	public void setWishlistLink(WebElement wishlistLink) {
		this.wishlistLink = wishlistLink;
	}
	public WebElement getSearchTextField() {
		return searchTextField;
	}
	public void setSearchTextField(WebElement searchTextField) {
		this.searchTextField = searchTextField;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}
	public WebElement getBookslink() {
		return bookslink;
	}
	public void setBookslink(WebElement bookslink) {
		this.bookslink = bookslink;
	}
	
	

}
