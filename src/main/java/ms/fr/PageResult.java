package ms.fr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageResult extends BannerMenu {
	@FindBy (xpath="//span[starts-with(@class, 'heading')]")
	WebElement text_search_result;
	
	@FindBy (xpath="//select[@id='selectProductSort']")
	WebElement sort_result_select;
	
	@FindBy (xpath="//img[contains(@src, '1/2/12')]")
	WebElement img_01;
	
	public PageProduct selectionProduct(WebDriver driver) {
		img_01.click();
		return PageFactory.initElements(driver, PageProduct.class);
	}
}
