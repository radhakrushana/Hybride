package Framework;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import CommanUtils.BaseClass;
import CommanUtils.Excelutils;
import CommanUtils.Fileutils;
import CommanUtils.JavaUtils;
import CommanUtils.WebDriverutils;

public class CreateorgnizationTestng extends BaseClass {
	 
	
	
	 
	@Test(groups="Smokesuite")
	public void orgnization() throws EncryptedDocumentException, IOException, InterruptedException {
    
   
     WebDriverutils wutils = new WebDriverutils();
     Excelutils eutils = new Excelutils();
     JavaUtils jutils = new JavaUtils();
     
   
    
     //int a = jutils.getRandamnumber();
     
     
     //To read data from excel file.
      String Orgname = eutils.getDataFromExcelFile("Sheet1", 1, 0);
      String group = eutils.getDataFromExcelFile("Sheet1", 1, 1);
      eutils.getDataFromExcelFile("Sheet1", 1, 2);
      
     
   
     //click to orgnization   
	 driver.findElement(By.linkText("Organizations")).click();
	 Reporter.log("Create the orgnization");	
	 
	 driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
     Reporter.log("Fill the orgnization");
	 
	 driver.findElement(By.name("accountname")).sendKeys(Orgname+jutils.getRandamnumber());
	 Reporter.log("Passing the orgnization name");
		
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
  
		Thread.sleep(2000);
	 	Reporter.log("Click on radio button");
		WebElement dropdown=driver.findElement(By.name("assigned_group_id"));
	 
		wutils.handeldropdown(dropdown, group);
		Reporter.log("Choose the option");
		
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		Thread.sleep(4000);
		Reporter.log("Click on save button");
		
		
		
		
     
     
        
	}
}
