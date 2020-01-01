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
	
	@FindBy (xpath="//h1")
	WebElement title;

	public PageResult search(WebDriver driver, String s) throws EmptyFieldEx{
		search_field.clear();
		if(s.equals(null)) {
			throw new EmptyFieldEx("Champ vide");
		}else {
			search_field.sendKeys(s);
		}
		search_btn.click();
		return PageFactory.initElements(driver, PageResult.class);
	}

}
