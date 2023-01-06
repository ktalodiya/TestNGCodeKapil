package com.testng.prep;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="getData")
	public void dtReader(String username, String password) {
		
		System.out.println(username);
		System.out.println(password);
	}
	
	
	
	
	
	
	@DataProvider
	public Object[][] getData() {
		
		
		Object[][] data= new Object[3][2];
		
		// 
		data[0][0]="firstuser";
		data[0][1]="pwd1";
		
		data[1][0]="seconduser";
		data[1][1]="pwd2";
		
		data[2][0]="thirduser";
		data[2][1]="pwd3";
		
		return data;
		
		
	}

}
