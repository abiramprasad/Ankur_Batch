package GenericMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class excel {
	public static String getdata (String path, String sheet, int r, int c) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
		String v= "";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		Reporter.log("cell value" +v);
		return v;
		
		
	}

}
