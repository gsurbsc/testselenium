package testcases;

import configproperties.Constant;
import excelread.ExcelRead;
import keywords.Keywords;

public class Registration {

	public static void main(String[] args) throws Exception {
		
		ExcelRead.setExcelFile(Constant.excelPath + Constant.excelName, Constant.sheetName);
		
		for(int i=1; i<=7; i++)
		{
			String ActionsKeyword = ExcelRead.getCellData(i, 2);
			
			if(ActionsKeyword.equals("openBrowser"))
			{
				Keywords.openBrowser();
			}
			else if(ActionsKeyword.equals("navigateUrl"))
			{
				Keywords.navigateUrl();
			}
			else if(ActionsKeyword.equals("inputUsername"))
			{
				Keywords.inputUsername();
			}
			else if(ActionsKeyword.equals("inputPassword"))
			{
				Keywords.inputPassword();
			}
			else if(ActionsKeyword.equals("inputConfirmPassword"))
			{
				Keywords.inputConfirmPassword();
			}
			else if(ActionsKeyword.equals("selectSecQuestion"))
			{
				Keywords.selectSecQuestion();
			}
			else if(ActionsKeyword.equals("inputSecAnswer"))
			{
				Keywords.inputSecAnswer();
			}
		}

	}

}
