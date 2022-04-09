package testsuite;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {

	@Test
	public void tc01() {
		System.out.println("TC01 Executed");
		Reporter.log("Test Case 01 Executed",true);
	
	}
	
	
	@Test
	public void tc02() {
		System.out.println("TC02 Executed");
		Reporter.log("Test Case 02 Executed",true);
	}
	
	@Test
	public void tc03() {
		System.out.println("TC03 Executed");
		Reporter.log("Test Case 02 Executed",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
