package com_Adv_Selenium_mvn_generic;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_generic 
{
	
		public static String getdata(String Sheet, int r,int c) 
		{
			Workbook book=null;
			FileInputStream fis;
			try {
				fis = new FileInputStream("./excel/testdata.xlsx");
				book= WorkbookFactory.create(fis);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			Sheet sh = book.getSheet(Sheet);
			
		     Row ro = sh.getRow(r);
		    
		     
		    Cell cel = ro.getCell(c);
		    
		   
		    String value = cel.toString();
		    return value;
		  
		}

	

	

}
