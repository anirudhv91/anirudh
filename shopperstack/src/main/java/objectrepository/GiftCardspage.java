package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardspage extends Basepage {

	public GiftCardspage(WebDriver driver) {
		super(driver);
	}
@FindBy(css = "[alt='Picture of $25 Virtual Gift Card']")
private WebElement $25VirtualGiftCardimage;
@FindBy(id = "add-to-cart-button-2")
private WebElement addtocartbutton;
@FindBy(id = "giftcard_2_RecipientName")
private WebElement giftcardRecipientName;
@FindBy(id = "giftcard_2_RecipientEmail")
private WebElement giftcardRecipientEmail;
@FindBy(linkText = "Shopping cart")
private WebElement Shoppingcartlink;
@FindBy(id = "termsofservice")
private WebElement termsofservice;
@FindBy(id = "checkout")
private WebElement checkoutButton;
@FindBy(id = "BillingNewAddress_FirstName")
private WebElement firstname;
@FindBy(id = "BillingNewAddress_LastName")
private WebElement lastname;
@FindBy(id = "BillingNewAddress_Email")
private WebElement email;
@FindBy(id = "BillingNewAddress_CountryId")
private WebElement countryname;
@FindBy(id = "BillingNewAddress_City")
private WebElement city;
@FindBy(id = "BillingNewAddress_Address1")
private WebElement address1;
@FindBy(id = "BillingNewAddress_ZipPostalCode")
private WebElement zipcode;
@FindBy(id = "BillingNewAddress_PhoneNumber")
private WebElement phonenumber;
@FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/input")
private WebElement billingaddresscontinuebutton;
@FindBy(id = "ShippingNewAddress_FirstName")
private WebElement shippingFirstName;
@FindBy(id = "ShippingNewAddress_LastName")
private WebElement shippinglastName;
@FindBy(id = "ShippingNewAddress_Email")
private WebElement shippingemail;
@FindBy(id = "ShippingNewAddress_CountryId")
private WebElement shippingcountryid;
@FindBy(id = "ShippingNewAddress_City")
private WebElement ShippingCity;
@FindBy(id = "ShippingNewAddress_Address1")
private WebElement ShippingAddress1;
@FindBy(id = "ShippingNewAddress_ZipPostalCode")
private WebElement ShippingZipCode;
@FindBy(id = "ShippingNewAddress_PhoneNumber")
private WebElement ShippingPhoneNumber;
@FindBy(xpath = "//*[@id=\"shipping-buttons-container\"]/input")
private WebElement shippingaddressbutton;
@FindBy(id = "shippingoption_1")
private WebElement NextDayAir;
public WebElement get$25VirtualGiftCardimage() {
	return $25VirtualGiftCardimage;
}
public WebElement getAddtocartbutton() {
	return addtocartbutton;
}
public WebElement getGiftcardRecipientName() {
	return giftcardRecipientName;
}
public WebElement getGiftcardRecipientEmail() {
	return giftcardRecipientEmail;
}
public WebElement getShoppingcartlink() {
	return Shoppingcartlink;
}
public WebElement getTermsofservice() {
	return termsofservice;
}
public WebElement getCheckoutButton() {
	return checkoutButton;
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getEmail() {
	return email;
}
public WebElement getCountryname() {
	return countryname;
}
public WebElement getCity() {
	return city;
}
public WebElement getAddress1() {
	return address1;
}
public WebElement getZipcode() {
	return zipcode;
}
public WebElement getPhonenumber() {
	return phonenumber;
}
public WebElement getBillingaddresscontinuebutton() {
	return billingaddresscontinuebutton;
}
public WebElement getShippingFirstName() {
	return shippingFirstName;
}
public WebElement getShippinglastName() {
	return shippinglastName;
}
public WebElement getShippingemail() {
	return shippingemail;
}
public WebElement getShippingcountryid() {
	return shippingcountryid;
}
public WebElement getShippingCity() {
	return ShippingCity;
}
public WebElement getShippingAddress1() {
	return ShippingAddress1;
}
public WebElement getShippingZipCode() {
	return ShippingZipCode;
}
public WebElement getShippingPhoneNumber() {
	return ShippingPhoneNumber;
}
public WebElement getShippingaddressbutton() {
	return shippingaddressbutton;
}
public WebElement getNextDayAir() {
	return NextDayAir;
}
public WebElement getShippingmethodcontinuebuttons() {
	return shippingmethodcontinuebuttons;
}
public WebElement getPurchaseOrder() {
	return purchaseOrder;
}
public WebElement getPaymentMethodContinueButton() {
	return paymentMethodContinueButton;
}
public WebElement getPaymentInfoContinueButton() {
	return paymentInfoContinueButton;
}
public WebElement getConfirmButton() {
	return confirmButton;
}
@FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/input")
private WebElement shippingmethodcontinuebuttons;
@FindBy(id = "paymentmethod_3")
private WebElement purchaseOrder;
@FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/input")
private WebElement paymentMethodContinueButton;
@FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/input")
private WebElement paymentInfoContinueButton;
@FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/input")
private WebElement confirmButton;

}
