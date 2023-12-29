package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bookpage extends Basepage {
public Bookpage(WebDriver driver) {
       super(driver);
}
@FindBy(xpath = "//div[@class='page-title']//h1")
private WebElement booksPageHeading;

@FindBy(id = "products-orderby")
private WebElement sortByDropDown;

@FindBy(id = "products-pagesize")
private WebElement pageSizeDropDown;

@FindBy(id = "products-viewmode")
private WebElement viewAsDropDown;

public WebElement getSortByDropDown() {
	return sortByDropDown;
}
public WebElement getPageSizeDropDown() {
	return pageSizeDropDown;
}
public WebElement getViewAsDropDown() {
	return viewAsDropDown;
}
public WebElement getBooksPageHeading() {
	return booksPageHeading;
}
public void setBooksPageHeading(WebElement booksPageHeading) {
	this.booksPageHeading = booksPageHeading;
}

}
