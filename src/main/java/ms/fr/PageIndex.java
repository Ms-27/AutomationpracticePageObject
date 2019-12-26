package ms.fr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageIndex extends BannerMenu{
	@FindBy (name="search_query")
	WebElement search_field;
	
	@FindBy (name="submit_search")
	WebElement search_btn;

	public PageResult search(WebDriver driver, String s) {
		search_field.clear();
		search_field.sendKeys(s);
		search_btn.click();
		return PageFactory.initElements(driver, PageResult.class);
	}

}
