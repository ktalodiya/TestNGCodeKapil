package com.testng.prep;

import org.testng.ITestListener;

//ITestListener
public class Listeners implements ITestListener {
	
	public void onTestStart(ITestListener result) {
		System.out.println("All Test cases are passed");
		
	}

}


