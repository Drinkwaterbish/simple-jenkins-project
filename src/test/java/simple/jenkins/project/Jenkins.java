package simple.jenkins.project;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Jenkins {

	@Test
	public void simplejenkins() {
		String firstName = "Aniket";
		String lastName = "Singh";
		
		System.out.println(firstName + " " + lastName);
		Assert.assertTrue(true);
	}

}