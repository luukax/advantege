package elementos;

import org.openqa.selenium.By;


public class Elementos {

	private By menuUser = By.id("menuUserLink");
	private By novaConta = By.xpath("//*[text()='CREATE NEW ACCOUNT']");
	private By userName = By.name("usernameRegisterPage");
	private By emailRegisterPage = By.name("emailRegisterPage");
	private By passwordRegisterPage = By.name("passwordRegisterPage");
	private By confirmPasswordRegisterPage = By.name("confirm_passwordRegisterPage");
	private By firstNameRegisterPage = By.name("first_nameRegisterPage");
	private By lastNameRegisterPage = By.name("last_nameRegisterPage");
	private By phoneNumberRegisterPage = By.name("phone_numberRegisterPage");
	private By countryListboxRegisterPage = By.name("countryListboxRegisterPage");
	private By cityRegisterPage = By.name("cityRegisterPage");
	private By addressRegisterPage = By.name("addressRegisterPage");
	private By stateProvinceRegionRegisterPage = By.name("state_/_province_/_regionRegisterPage");
	private By postalCodeRegisterPage = By.name("postal_codeRegisterPage");
	private By i_agree = By.name("i_agree");
	private By registerBtnundefined = By.id("register_btnundefined");
	private By name = By.xpath("//input[@name='username']");
	private By password = By.name("password");
	private By sign = By.id("sign_in_btnundefined");
	private By userLogin = By.xpath("//*[@class='hi-user containMiniTitle ng-binding']");
	private By myAccount = By.xpath("//*[@id=\"loginMiniTitle\"]/label[1]");
	private By signInResultMessage = By.xpath("//*[text()='Incorrect user name or password.']");
	private By msgEmailinvalid = By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/label");
	private By msgSenhaSemRequisto = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/label");
	private By userExists = By.xpath("//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[1]");
	private By deleteAccount = By.xpath("//*[@class='deleteBtnText']");
	private By aceiteDelete = By.xpath("//*[@class='deletePopupBtn deleteRed']");
	
	public By getAceiteDelete() {
		return aceiteDelete;
	}

	public By getDeleteAccount() {
		return deleteAccount;
	}

	public By getUserExists() {
		return userExists;
	}

	public By getMsgSenhaSemRequisto() {
		return msgSenhaSemRequisto;
	}

	public By getMsgEmailinvalid() {
		return msgEmailinvalid;
	}

	public By getSignInResultMessage() {
		return signInResultMessage;
	}

	public By getMyAccount() {
		return myAccount;
	}

	public By getUserLogin() {
		return userLogin;
	}

	public By getName() {
		return name;
	}

	public By getPassword() {
		return password;
	}

	public By getSign() {
		return sign;
	}

	public By getCountryListboxRegisterPage() {
		return countryListboxRegisterPage;
	}

	public By getCityRegisterPage() {
		return cityRegisterPage;
	}

	public By getAddressRegisterPage() {
		return addressRegisterPage;
	}

	public By getStateProvinceRegionRegisterPage() {
		return stateProvinceRegionRegisterPage;
	}

	public By getPostalCodeRegisterPage() {
		return postalCodeRegisterPage;
	}

	public By getI_agree() {
		return i_agree;
	}

	public By getRegisterBtnundefined() {
		return registerBtnundefined;
	}

	public By getEmailRegisterPage() {
		return emailRegisterPage;
	}

	public By getPasswordRegisterPage() {
		return passwordRegisterPage;
	}

	public By getConfirmPasswordRegisterPage() {
		return confirmPasswordRegisterPage;
	}

	public By getFirstNameRegisterPage() {
		return firstNameRegisterPage;
	}

	public By getLastNameRegisterPage() {
		return lastNameRegisterPage;
	}

	public By getPhoneNumberRegisterPage() {
		return phoneNumberRegisterPage;
	}

	public By getUserName() {
		return userName;
	}

	public By getNovaConta() {
		return novaConta;
	}

	public By getMenuUser() {
		return menuUser;
	}

	
	
}
