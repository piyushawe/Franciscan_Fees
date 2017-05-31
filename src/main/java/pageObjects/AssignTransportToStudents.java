package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignTransportToStudents {
   WebDriver dr;
   By cls= By.id("ContentPlaceHolder1_ddlclass");
   By section= By.id("ContentPlaceHolder1_ddlsection");
   By update= By.name("ctl00$ContentPlaceHolder1$btnUpdate$ctl00");
   
   public AssignTransportToStudents(WebDriver d)
   {
	   this.dr=d;
   }
   public void openAssignTransportToStudents()
   {
	   WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Transport.png']"));
	   Actions builder= new Actions(dr);
	   builder.moveToElement(menu).build().perform();
	   dr.findElement(By.linkText("Assign Transport To Students")).click();
	   dr.switchTo().frame(dr.findElement(By.id("Assign Transport To Students")));
   }
   public void selectClass(String c)
   {
	   new Select(dr.findElement(cls)).selectByVisibleText(c);
   }
   public void selectSection(String sec) throws InterruptedException
   {
	   new Select(dr.findElement(section)).selectByVisibleText(sec);
	   Thread.sleep(1000);
   }
   public void clickUpdate()
   {
	   dr.findElement(update).click();
   }
   public void assignTransport(String name, String route, String stop, String vehicle, String months) throws InterruptedException
   {
	   WebElement list= dr.findElement(By.id("example"));
	   List<WebElement>rows= list.findElements(By.tagName("tr"));
	   System.out.println("Total rows: "+rows.size());
	   int r=1;
	   for(WebElement row:rows)
	   {
		   List<WebElement>cells=row.findElements(By.tagName("td"));
		   for(WebElement cell:cells)
		   {
			   if(name.equals(cell.getText()))
			   {
				  System.out.println("r= "+r);
				  System.out.println(cell.getText());
				  String routeid="ContentPlaceHolder1_rptStudentList_ddlRoute_"+(r-3);
				  new Select(dr.findElement(By.id(routeid))).selectByVisibleText(route);
				  Thread.sleep(3000);
				  String stopid="ContentPlaceHolder1_rptStudentList_ddlStop_"+(r-3);
				  new Select(dr.findElement(By.id(stopid))).selectByVisibleText(stop);
				  Thread.sleep(3000);
				  String vehicleid="ContentPlaceHolder1_rptStudentList_ddlVehicle_"+(r-3);
				  new Select(dr.findElement(By.id(vehicleid))).selectByVisibleText(vehicle);
				  Thread.sleep(3000);
				  //System.out.println("1");
	              List<WebElement>btn=dr.findElements(By.cssSelector("td:nth-child(8)"));
	              btn.get(r-3).click();
				  //row.findElement(By.cssSelector("td:nth-child(8)")).click();
				  //System.out.println("2");
				  Thread.sleep(500);
				  if(months.equalsIgnoreCase("All")) 
				    dr.findElement(By.linkText("All")).click();
				  else {
					     int n= Integer.parseInt(months);
					     dr.findElement(By.linkText("Clear")).click();
					     String path= "/html/body/div["+r+"]/ul";
					     WebElement select= dr.findElement(By.xpath(path));
					     List<WebElement>options=select.findElements(By.tagName("span"));
					     for(int i=0;i<=n-1;i++)
					    	 options.get(i).click();
				       }
				  btn.get(r-3).click();	
			   }
		   }r++;
	   }
   }
}
