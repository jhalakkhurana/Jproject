package org.testing.Base;

import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			System.setProperty ("webdriver.chrome.driver", "../Jproject/chromedriver.exe");
			
			ChromeDriver	 d = new ChromeDriver();
			d.get("https://www.facebook.com/");
			d.manage().window().maximize();
	}

	}}
