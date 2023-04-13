package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.UtilsClass;

public class RegisterPage extends BaseClass{

	@FindBy(name = "firstName")
	WebElement FirstName;

	@FindBy(name = "lastName")
	WebElement LastName;

	@FindBy(name = "phone")
	WebElement Phone;

	@FindBy(name = "userName")
	WebElement email;

	@FindBy(name = "address1")
	WebElement Address;

	@FindBy(name = "city")
	WebElement City;

	@FindBy(name = "state")
	WebElement State;

	@FindBy(name = "postalCode")
	WebElement PostalCode;

	@FindBy(name = "country")
	WebElement Country;

	@FindBy(name = "email")
	WebElement Username;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(name = "confirmPassword")
	WebElement ConfirmPassword;

	@FindBy(name = "submit")
	WebElement Submit;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void contactInformation(String fname, String lname, String mob, String emailid) {

		UtilsClass.enterDataInTextBox(FirstName, fname);
		UtilsClass.enterDataInTextBox(LastName, lname);
		UtilsClass.enterDataInTextBox(Phone, mob);
		UtilsClass.enterDataInTextBox(email, emailid);
	}
	
	
	public void mailingInformation(String add, String city, String state, String pincode, String country) {
		UtilsClass.enterDataInTextBox(Address, add);
		UtilsClass.enterDataInTextBox(City, city);
		UtilsClass.enterDataInTextBox(State, state);
		UtilsClass.enterDataInTextBox(PostalCode, pincode);
		HandleDropDown.selectValueUsingVisibleText(Country, country);
	}

	public void userInformation(String uname, String pass, String cpass) {
		UtilsClass.enterDataInTextBox(Username, uname);
		UtilsClass.enterDataInTextBox(Password, pass);
		UtilsClass.enterDataInTextBox(ConfirmPassword, cpass);
		UtilsClass.clickOnButton(Submit);
	}

}
