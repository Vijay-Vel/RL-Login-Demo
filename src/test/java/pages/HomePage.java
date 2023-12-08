package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{
	
	Actions a = new Actions(driver);
	
	@FindBy(xpath="//div[@class='col-sm-5 d-flex align-items-center justify-content-end']/descendant::span[3]")
	WebElement MyAccount;
	
	@FindBy(xpath="//div[@class='userpopup']/descendant::a[1]")
	WebElement LoginBtn;
	
	
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void	clickLogin() throws InterruptedException {
		
		a.moveToElement(MyAccount).perform();
		Thread.sleep(1500);
		
		LoginBtn.click();
		
	}
	
	


}
