package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductListing_Page extends BaseClass
{
	
	public static WebElement element=null;
	
	public ProductListing_Page(WebDriver driver) {
		super(driver);
		
	}

	public static String itemTitle()
	{
		String itemName=driver.findElement(By.xpath("//a[@class='cross rmargin10 ']")).getText();
		return itemName;
	}
	
}
