package excelread;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static XSSFWorkbook workbook;
	
	public static XSSFSheet sheet;
	
	public static XSSFCell cell;
	
	public static void setExcelFile(String path, String sheetname) throws Exception
	{
		File file = new File(path);
	    
	    FileInputStream inputStream = new FileInputStream(file);
	    
	    workbook = new XSSFWorkbook(inputStream);
	    
	    sheet = workbook.getSheet(sheetname);
	}
	
	public static String getCellData(int rownum, int colnum) throws Exception
	{
	    cell = sheet.getRow(rownum).getCell(colnum);
	    
		String CellData = cell.getStringCellValue();

		return CellData;
	}

}
