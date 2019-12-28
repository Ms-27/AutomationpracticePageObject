package ms.fr;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class APTest01 {
	WebDriver driver;
	
	//JDD
	String keyword = "summer";
	
	@Before
	public void setUp() {
		driver = TechnicalTools.chooseBrowser(EBrowsers.Opera);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}
	
	@Test
	public void test01() {
		//on se connecte au site
		driver.get("http://automationpractice.com/index.php");
		//on instancie une page et on fait une recherche avec la variable keyword
		PageIndex page_index = PageFactory.initElements(driver, PageIndex.class);
		PageResult page_result = page_index.search(driver, keyword);
		//on vérifie l'affichage du nombre de résultats
		assertTrue(page_result.text_search_result.getText().contains("results"));
		
		Select select = new Select(page_result.sort_result_select);
		select.selectByValue("quantity:desc");
		
		PageProduct page_product = page_result.selectionProduct(driver);
		page_product.color_blue_select.click();
		select = new Select(page_product.size_select);
		select.selectByVisibleText("M");
		TechnicalTools.fillField(page_product.quantity_field, "2");
		page_product.addcart_btn.click();
		page_product.closewndw_btn.click();
		
		Actions a = new Actions(driver);
		a.moveToElement(page_product.cart_btn).build().perform();
		a.moveToElement(page_product.cart_cross).click().build().perform();
		
	}
}
