package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page extends BaseClass
{

	private static WebElement element = null;
	public LogIn_Page(WebDriver driver)
	{
		super(driver);
		
	}

	public static WebElement txtbx_UserName() throws Exception{
		 
    	try{

            element = driver.findElement(By.xpath("//div[@id='fk-mainbody-id']//input[@placeholder='Enter email/mobile']"));

           

    	}catch (Exception e){

       		

       		throw(e);

       		}

       	return element;

        }

    public static WebElement txtbx_Password() throws Exception{

    	try{

        	element = driver.findElement(By.xpath("//div[@id='fk-mainbody-id']//input[@placeholder='Enter password']"));

           

    	}catch (Exception e){

    		
       		throw(e);

       		}

       	return element;

    }

    public static WebElement btn_LogIn() throws Exception{

    	try{

        	element = driver.findElement(By.xpath("//div[@id='fk-mainbody-id']//input[@type='button' and @class='submit-btn login-btn btn']"));

            System.out.println(element.getText());
            System.out.println("THis is the element");
    	}catch (Exception e){


       		throw(e);

       		}

       	return element;

    }
	
}
