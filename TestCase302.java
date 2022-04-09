package testsuite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void tc04() {
		System.out.println("TC04 Executed");
		
	}
	@Test
	public void tc05() {
		System.out.println("TC05 Executed");
		Reporter.log("TC05 Executed", true);
	Assert.fail();	
	}
	
	@Test
	public void tc06() {
		System.out.println("TC06 Executed");
		
	}
	
	
	
}
