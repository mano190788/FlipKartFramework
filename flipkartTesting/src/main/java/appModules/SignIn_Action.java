package appModules;

import pageObjects.Home_Page_main;
import pageObjects.LogIn_Page;
import utility.Constant;
import utility.ExcelUtils;


public class SignIn_Action 
{

	public static void Execute(int iTestCaseRow) throws Exception
	{
	
		Home_Page_main.lnk_LogIn().click();
		
		String sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
		
		LogIn_Page.txtbx_UserName().sendKeys(sUserName);
		
		String sPassword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);

        LogIn_Page.txtbx_Password().sendKeys(sPassword);
        
        System.out.println("now the signin button will be clicked");
        LogIn_Page.btn_LogIn().click();
        System.out.println("The signin button is clicked");
        
        
        
	}
	
}
