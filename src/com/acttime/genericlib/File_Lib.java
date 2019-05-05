package com.acttime.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author by Ranjeet Kumar on 5/4/2019
 *
 */
public class File_Lib {
	/**
	 * it's used to property key value from commanData.properties..
	 * 
	 * @param key
	 * @return value
	 * @throws Throwable
	 */
	public String getProperty(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./data/commonData.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;

	}

	/**
	 * it's used to read data from Excel-workBok, based on user argument..
	 * 
	 * @param SheetName
	 * @param rowNum
	 * @param celNum
	 * @return data
	 * @throws Throwable
	 */
	public String getExcelData(String SheetName, int rowNum, int celNum) throws Throwable {
		FileInputStream fisi = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fisi);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(celNum).getStringCellValue();
		wb.close();
		return data;
	}

	/**
	 * it's used to write data back to excel based on user..
	 * 
	 * @param SheetName
	 * @param rowName
	 * @param celNum
	 * @param data
	 * @throws Throwable
	 */
	public void setExcelData(String SheetName, int rowName, int celNum, String data) throws Throwable {
		FileInputStream fisi = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fisi);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(rowName);
		Cell cel = row.createCell(celNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);
		wb.close();
	}

}
