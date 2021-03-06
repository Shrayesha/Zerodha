package Framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Config.AllPath;

public class UtilityRunner {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
	    System.setProperty("webdriver.chrome.driver",AllPath.driverpath);
	    WebDriver driver = new ChromeDriver();	
	  	driver.get(AllPath.appUrl);
	   	driver.manage().window().maximize();
		
        //Parameterized object passed is driver
        Test_Pom p2 = new Test_Pom(driver);
        Utility util = new Utility();
        
		//TC01//Utility
		p2.enterfname(util.readEcxelData(1,0));
		Thread.sleep(1000);
		p2.enterlname(util.readEcxelData(1,1));
		Thread.sleep(1000);
		p2.enternumber(util.readEcxelData(1,2));
		Thread.sleep(1000);
		p2.enterpassword(util.readEcxelData(1,3));
		Thread.sleep(1000);
		p2.selectday(util.readEcxelData(1,4));
		Thread.sleep(2000);
		p2.selectmonth1(util.readEcxelData(1,5));
		Thread.sleep(1000);
		p2.selectyear(util.readEcxelData(1,6));
		Thread.sleep(1000);
		p2.clickonfemale();
		Thread.sleep(1000);
		p2.enterbutton();
		Thread.sleep(2000);
		driver.navigate().refresh();
	
	    //TC02
		p2.enterfname("Vicky");
		Thread.sleep(1000);
		p2.enterlname("Kaushal");
		Thread.sleep(2000);
		p2.enternumber("7273484");
		Thread.sleep(2000);
		p2.enterpassword("fhdjsfs");
		Thread.sleep(2000);
		p2.selectday("16");
		Thread.sleep(1500);
		p2.selectmonth1("May");
		Thread.sleep(1500);
		p2.selectyear("1992");
		Thread.sleep(1500);
		p2.clickonmale();
		Thread.sleep(1500);
		p2.enterbutton();
		Thread.sleep(1500);
	    driver.navigate().refresh();
	
	    //TC03
	
		p2.enterfname("Tester");
		Thread.sleep(2000);
		p2.enterlname("Testie");
		Thread.sleep(2000);
		p2.enternumber("7277884");
		Thread.sleep(2000);
		p2.enterpassword("fkljsfs");
		Thread.sleep(2000);
		p2.selectday("30");
		Thread.sleep(1500);
		p2.selectmonth1("Jun");
		Thread.sleep(1500);
		p2.selectyear("1987");
		Thread.sleep(1500);
		p2.clickoncustom();
		Thread.sleep(1000);
		p2.enterbutton();
	
	
	
	
	
	}
}
