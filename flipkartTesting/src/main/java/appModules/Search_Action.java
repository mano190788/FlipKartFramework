package appModules;

import pageObjects.Home_Page_main;
import utility.Constant;
import utility.ExcelUtils;

public class Search_Action
{
	
	public static void  searchAnItem(int iTestCaseRow) throws Exception
	{
		
		String TextToSearch = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_saerchItem);
		Home_Page_main.search_AnItem(Home_Page_main.lnk_Search(), TextToSearch);
	}

}
