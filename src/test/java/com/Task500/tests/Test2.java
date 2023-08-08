package com.Task500.tests;

import org.testng.annotations.Test;

import com.task500.generics.Baseclass;
import com.task500.generics.Baseclass1;

public class Test2 extends Baseclass1 {
	
	
	@Test
	public void tc2()
	{
		driver.get("https://www.flipkart.com");
	}

}
