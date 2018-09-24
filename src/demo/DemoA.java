package demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoA {
 public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	 FileInputStream fis = new FileInputStream("./data/Book1.xlsx");
	 Workbook w =  WorkbookFactory.create(fis);
	String s = w.getSheet("sheet1").getRow(0).getCell(0).toString();
	 System.out.println(s);
	 
 }
}
