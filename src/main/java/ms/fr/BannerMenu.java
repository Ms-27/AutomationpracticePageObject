package ms.fr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BannerMenu {
	@FindBy (xpath="//*[@class='login']")
	WebElement signin_btn;
	
	
}
