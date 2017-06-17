package MasterSettingsPageObjects;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.junit.Assert;
import org.openqa.selenium.*;

public class Utility {

	public void captureScreenshot(WebDriver dr, String str, String r, Collection<String> sc) throws IOException
	{
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		File f= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f,new File("D:/fee_screenshots/"+str+"/"+r+"/"+r+sc+timeStamp+".png"));
	}

	public void verifySave(WebDriver dr,String school, String page,Collection<String> sc)throws IOException
	{
		ArrayList<String>list= new ArrayList<String>();
		Date date= new Date();
		int size= sc.toString().length();
		String scenario= sc.toString().substring(2,size-1);
		String msg;
		try {
			Assert.assertFalse(dr.getPageSource().contains("Server Error"));
		}
		catch(Exception e)
		{
			System.out.println("Server Error on page");
			list.add(date.toString());
			list.add(scenario);
            list.add(page);
			list.add("Save: Server Error");
			prepareErrorLog(list,school);
		}
		dr.switchTo().defaultContent();
		try {
			dr.findElement(By.id("defaultSpeechbubbleHeader"));
		}
		catch(Exception e)
		{
			list.add(date.toString());
			list.add(scenario);
			list.add(page);
			list.add("Save: Message Did Not Appear ");
			prepareErrorLog(list,school);
		}
		msg = dr.findElement(By.id("defaultSpeechbubbleHeader")).getText();
		if(!msg.contains("successfully"))
		{
			list.add(date.toString());
			list.add(scenario);
			list.add(page);
			list.add("Save:"+msg);
			prepareErrorLog(list,school);
		}
	}

	public void verifyView(WebDriver dr,String school, String page,Collection<String> sc )throws IOException
	{
	   ArrayList<String>list= new ArrayList<String>();
       Date date= new Date();
       int size= sc.toString().length();
       String scenario= sc.toString().substring(2,size-1);
       String msg;
       try {
			Assert.assertFalse(dr.getPageSource().contains("Server Error"));
	   }
	   catch(Exception e)
	   {
		   System.out.println("Server Error on page");
		   list.add(date.toString());
		   list.add(scenario);
		   list.add(page);
		   list.add("Modify: Server Error on page");
		   prepareErrorLog(list,school);
	   }
       dr.switchTo().defaultContent();
       try {
			dr.findElement(By.id("defaultSpeechbubbleHeader"));
	   }
	   catch(Exception e)
	   {
		   list.add(date.toString());
		   list.add(scenario);
		   list.add(page);
		   list.add("Modify: Message Did Not Appear");
		   prepareErrorLog(list,school);
	   }
	   msg = dr.findElement(By.id("defaultSpeechbubbleHeader")).getText();
       if(msg.contains("Error")||msg.contains("error"))
       {
		   list.add(date.toString());
		   list.add(scenario);
		   list.add(page);
		   list.add("Modify:"+ msg);
		   prepareErrorLog(list,school);
	   }
	}

	public void prepareErrorLog(ArrayList<String>lst, String school )throws IOException
	{
		ArrayList<String>list= new ArrayList<String>(Arrays.asList("Date","Scenario", "Page","Error Message"));
		File file;
		FileInputStream fis;
		HSSFWorkbook wb;
		Sheet sheet;
			file = new File("D:/TestReports/" + school + "/Fees/ErrorLog.xls");
			File pdir= file.getParentFile();
			if(!file.exists()) {
				System.out.println("File Does Not Exist");
				if (pdir != null)
					pdir.mkdirs();

				file.createNewFile();
				System.out.println("New File Created");
			}
			fis = new FileInputStream(file);
			wb = new HSSFWorkbook(fis);
			sheet = wb.getSheet("error log");
		System.out.println(sheet);
		if(sheet==null)
			   sheet = wb.createSheet("error log");
		Row row;
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getFirstRowNum());
		int rowcount= sheet.getPhysicalNumberOfRows()-sheet.getFirstRowNum();
		System.out.println("rowcount: "+rowcount);
		System.out.println(sheet.getPhysicalNumberOfRows());

		int i=0;
		if(rowcount==0){
			row= sheet.createRow(rowcount);
			for(String ls:list){
				Cell cell= row.createCell(i);
				cell.setCellValue(ls);
				i++;
			}
		}
		FileOutputStream fout= new FileOutputStream(file);
		wb.write(fout);
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getFirstRowNum());
		rowcount= sheet.getLastRowNum()-sheet.getFirstRowNum();
		row = sheet.createRow(rowcount+1);
		i=0;
		for (String ls:lst)
		{
			Cell cell= row.createCell(i);
			cell.setCellValue(ls);
			i++;
		}
		FileOutputStream fout1= new FileOutputStream(file);
		wb.write(fout1);
	}
}
