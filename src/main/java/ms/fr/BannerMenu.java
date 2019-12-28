package ms.fr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BannerMenu {
	@FindBy (xpath="//*[@class='login']")
	WebElement signin_btn;
	
	@FindBy (xpath="//a[contains(@title, 'shopping cart')]")
	WebElement cart_btn;
	
	@FindBy (xpath="//a[contains(@class, 'remove_link')]")
	WebElement cart_cross;
}
