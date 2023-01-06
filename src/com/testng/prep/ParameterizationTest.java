package com.testng.prep;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTest {

	@Parameters({ "URL" })
	@Test
	public void webLogin(String urlname) {

		System.out.println("Application login successfully");
		System.out.println(urlname);
	}

	@Parameters({"uname","password"})
	@Test(dependsOnMethods="webLogin", groups={"smoke"})
	public void loginTest(String uname, String password){
		
		System.out.println(uname);
		System.out.println(password);
	}
	
	@Test(groups={"smoke"})
	public void clickonlinks() {
		System.out.println("100 links found on page");
	}
	
	@Test(groups={"smoke"})
	public void getLinkText() {
		System.out.println(" Click on Admin link");
	}
}