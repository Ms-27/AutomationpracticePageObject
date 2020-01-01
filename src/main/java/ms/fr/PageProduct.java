package ms.fr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageProduct extends BannerMenu {
	@FindBy (xpath="//*[@id='color_14']")
	WebElement color_blue;
	
	@FindBy (xpath="//select[contains(@name, 'group_1')]")
	WebElement size_select;
	
	@FindBy (name="qty")
	WebElement quantity_field;
	
	@FindBy (xpath="//span[contains(., 'Add to cart')]")
	WebElement addcart_btn;
	
	@FindBy (xpath="//div[contains(@id, 'layer_cart')]")
	WebElement frame_cart;
	
	@FindBy (xpath="//span[contains(@title, 'Close')]")
	WebElement closewndw_btn;
}
