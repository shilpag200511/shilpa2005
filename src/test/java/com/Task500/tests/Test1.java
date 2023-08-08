package com.Task500.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.task500.generics.Baseclass;
import com.task500.generics.Baseclass1;

public class Test1  extends Baseclass1{
	
	@Test
	public void tc1()
	{
		driver.get("https://www.google.com");
		
	}

}
