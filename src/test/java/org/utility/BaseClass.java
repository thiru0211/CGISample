package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebElement ele1,ele2,ele3,ele4,ele5;
	@BeforeMethod
	public void launch() throws IOException{
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://192.168.1.36:81/#/auth");
//		File file=new File("C:\\Users\\thirumaran\\eclipse-workspace\\PowerFundOnee\\Data.properties");
//		FileInputStream FIS=new FileInputStream(file);
//		Properties prop=new Properties();
//		prop.load(FIS);	
//		LoginAction=PageFactory.initElements(driver, Login.class);
//		ViewUseraction=PageFactory.initElements(driver, ViewUser.class);
	}
}
