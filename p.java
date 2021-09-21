package com.morningBatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class p {

	@Test
	public void yah() {

		ExtentSparkReporter html = new ExtentSparkReporter("ddd.html");

		ExtentReports rep = new ExtentReports();

		rep.attachReporter(html);

		ExtentTest test = rep.createTest("demo");
		
		rep.flush();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\Desktop\\New folder (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.close();

	

	}

	@Test
	public void gog() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\Desktop\\New folder (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.close();

	}

}
