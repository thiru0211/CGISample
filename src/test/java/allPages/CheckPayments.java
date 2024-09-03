package allPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckPayments extends Locators {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static WebElement ele1,ele2,ele3,ele4,ele5;

	@BeforeMethod
	public void setUp() throws IOException{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
		//driver.get("http://192.168.1.36/CGI/auth");
		driver.get("https://www.hedgeonline.us/RCGI/auth");
	}

	@AfterMethod
	public void tearDown() throws IOException, InterruptedException{
		Thread.sleep(3000);
		driver.quit();
	}

	@Test(priority = 1,retryAnalyzer = ReRunFailedTestCase.class)
	public void CheckPaymentsClick() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String EmailId=PropertyFileReader.propertymap.get("EmailId");
		String Passwrd=PropertyFileReader.propertymap.get("Passwrd");
		driver.findElement(By.name(Email)).sendKeys(EmailId);
		driver.findElement(By.name(Password)).sendKeys(Passwrd);
		driver.findElement(By.id(LoginBtn)).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"kt_content_container\"]/div[1]/div/div/div[5]/span")));
		driver.findElement(By.xpath(CustomerBtn)).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CheckPayBtn)));
		driver.findElement(By.xpath(CheckPayBtn)).click();
	}

	@Test(priority = 2,retryAnalyzer = ReRunFailedTestCase.class)
	public void TC01() throws InterruptedException {
		CheckPaymentsClick();
		String CPBankDDName=PropertyFileReader.propertymap.get("CPBankDDName");
		String CPBankSrchBtn=PropertyFileReader.propertymap.get("CPBankSrchBtn");
		ele1=driver.findElement(By.xpath(CPBankDD));
		Select sel1=new Select(ele1);
		sel1.selectByVisibleText(CPBankDDName);
		driver.findElement(By.xpath(CPBankSrch)).sendKeys(CPBankSrchBtn);
	}

	@Test(priority = 3,retryAnalyzer = ReRunFailedTestCase.class)
	public void TC02() throws InterruptedException {
		TC01();
		String CPAddInstlrDD=PropertyFileReader.propertymap.get("CPAddInstlrDD");
		String CPAddCusName=PropertyFileReader.propertymap.get("CPAddCusName");
		driver.findElement(By.xpath(CPAddBtn)).click();
		ele1=driver.findElement(By.xpath(CPAddInstDD));
		Select sel=new Select(ele1);
		sel.selectByVisibleText(CPAddInstlrDD);
		driver.findElement(By.xpath(CPAddCustName)).sendKeys(CPAddCusName);
	}
}
