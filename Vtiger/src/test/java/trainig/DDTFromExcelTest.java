package trainig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class DDTFromExcelTest {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fi = new FileInputStream("");
		Workbook wb = WorkbookFactory.create(fi);
		String value = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
	}

}
