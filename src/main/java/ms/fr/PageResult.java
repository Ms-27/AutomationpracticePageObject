package ms.fr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageResult extends BannerMenu {
	@FindBy (xpath="//span[starts-with(@class, 'heading')]")
	WebElement text_search_result;
	
	@FindBy (xpath="//select[@id='selectProductSort']")
	WebElement sort_result_select;

}
