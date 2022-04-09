package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_Pom {
//Declaration
	@FindBy(xpath="//input[@name='firstname']")private WebElement fname;
	@FindBy(xpath="//input[@name='lastname']")private WebElement lname;
	@FindBy(xpath="//input[@name=\"reg_email__\"]")private WebElement email;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="//select[@name='birthday_day']")private WebElement day;
	@FindBy(xpath="//select[@title='Month']")private WebElement month1;
	@FindBy(xpath="//select[@id='year']")private WebElement year;
	@FindBy(xpath="(//input[@type='radio'])[1]")private WebElement female;
	@FindBy(xpath="(//input[@type='radio'])[2]")private WebElement male;
	@FindBy(xpath="(//input[@type='radio'])[3]")private WebElement custom;
	@FindBy(xpath="//button[@name='websubmit']")private WebElement button;
	
//Initialization (initializing driver in constructor)
	Signup_Pom(WebDriver driver){
		PageFactory.initElements(driver, this);	
	}
	


	//Usage
	public void enterfname( ) {fname.sendKeys("Shreya");}
	public void enterlname() {lname.sendKeys("Deshmukh");}
	public void enternumber( ) {email.sendKeys("Shreya20314@gmail.com");}
	public void enterpassword() {password.sendKeys("2496236");}
	public void selectday( ) {day.click();}
	public void selectmonth1() {month1.click();}
	public void selectyear( ) {year.click();}
	public void clickonfemale() {female.click();}
	public void clickonmale() {male.click();}
	public void clickoncustom() {custom.click();}
	public void enterbutton() {button.click();}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}