package com.qsp.GeneralUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtils {

	FileInputStream fis;
	Workbook book;
	DataFormatter df;
	FileOutputStream fos;
	
	/**
	 * This method is used to fetch the single row data from Excel sheet
	 * @param path It will fetch the path of the excel where excel sheet is present in the project
	 * @param sheetName It is the name of the sheet
	 * @param cell It refers to the cell from which we want to fetch the data 
	 * @param row It refers to the particular row form which we want fetch the data 
	 * @return
	 */
	public String fetchSingleData(String path,String sheetName,int row,int cell)
	{
		try {
			fis= new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			book =WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		df=new DataFormatter();
		
		return df.formatCellValue(book.getSheet(sheetName).getRow(row).getCell(cell));
	}
	
	/**
	 * This method is used to fetch the last row in the excel sheet
	 * @param path It will fetch the path of the excel where excel sheet is present in the project
	 * @param sheetName It is the name of the sheet
	 * @return
	 */
	public int lastRowNumber(String path,String sheetName)
	{
		try {
			fis=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sheet sh= book.getSheet(sheetName);
		
		return sh.getLastRowNum();
	}
	
	/**
	 * This method is used to fetch multiple data in row wise
	 * @param path It will fetch the path of the excel where excel sheet is present in the project
	 * @param sheetName It is the name of the sheet
	 * @param lastrow It will fetch the last row number present in the excel sheet. 
	 * @return
	 */
	public List fetchDataRowWise(String path,String sheetName,int lastrow)
	{
		List l= new ArrayList();
		
		df = new DataFormatter();
		
		try {
			fis= new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			book= WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sheet sh= book.getSheet(sheetName);
		
		for(int i=0;i<lastrow;i++)
		{
			String data= df.formatCellValue(sh.getRow(i).getCell(0));
			
			l.add(data);
		}
		return l;
	}
	
	public void writeSingleData(String path,String sheetName,int row,int cell)
	{
		try {
			fis =new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			book= WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		book.getSheet(sheetName).createRow(row).createCell(cell);
	
		try {
			fos=new FileOutputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			book.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}


