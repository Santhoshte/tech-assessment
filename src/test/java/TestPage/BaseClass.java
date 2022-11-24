package TestPage;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Robot robot;
		
		public static WebDriver launchBrowser(String browserName) {
		switch (browserName) {
			case "chrome":{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			}
			
			case "edge":{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			}
			
			default:{
			System.out.println("Not Available");
			break;
			}
		}
		return driver;
		}
		
		public static void launchURL(String url) {
			driver.get(url);
		}
		public static void maxBrowser() {
			driver.manage().window().maximize();
		}
		
		public static void implicitWait() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		public static WebElement getElement(By locator ) {
			return driver.findElement(locator);
		}
		public static String[] substring(String s) {
			return s.split(s, 1);
		}
		
		public static void clickElement(By locator) {
			WebElement ele = getElement(locator);
			explicitWait(locator);
			ele.click();
			
		}
		
		
		public static String getData(By locator) {
			WebElement ele = getElement(locator);
			return ele.getText();
		}
		
		public static void enterText(By locator, String data) {
			WebElement ele = getElement(locator);
			explicitWait(locator);
			ele.sendKeys(data);	
		}
		

		public static void clickEnter(By locator) {
			
			WebElement ele = getElement(locator);
			explicitWait(locator);
			ele.sendKeys(Keys.ENTER);	
			
		}
		
		public static String getTextFromElement(By locator, String attribute) {
			
			WebElement ele = getElement(locator);
			
			return ele.getAttribute(attribute);

		}
		
		public static void uploadFile(String filePath) throws AWTException {
			robot = new Robot();
			StringSelection ss = new StringSelection(filePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		
		public static void explicitWait(By locator) {
			
			WebDriverWait wait = new WebDriverWait(driver, 100);
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
		}
		
		public static  void screenshot(String filePath) throws IOException {

			TakesScreenshot scrShot = ((TakesScreenshot) driver);

			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

			File DestFile = new File(filePath +"screenshotAt" + getTime() + ".jpg" );

			FileUtils.copyFile(SrcFile, DestFile);

		  }
		public static void assertion(By locator, String expected) {
			String data = getData(locator);
			String replaceAll = data.replaceAll("\\s", "");
			Assert.assertEquals(replaceAll, expected);
		}
		public static void assertionSub(By locator, String expected) {
			String data = getData(locator);
			String[] split = data.split(":");
			String string = split[1];
			String replaceAll = string.replaceAll("\\s", "");
			Assert.assertEquals(replaceAll, expected);
		}
		
		public static String substr(By locator) {
			String data = getData(locator);
			String[] split = data.split(":");
			String string = split[1];
			return string;
		}
		public static String getDate() {
			 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			 
			 Date date = new Date();
			 
			 return dateFormat.format(date);

		}
		
		public static String getTime() {
			String[] split = getDate().split(" ");
			return split[1].replaceAll(":", "");
		}
		
		public static String readProperty(String filePath, String key) throws Exception {
			FileReader reader = new FileReader(filePath);
			Properties prop = new Properties();
			prop.load(reader);
			return prop.getProperty(key);
		}
		public static void quit() {
			
			driver.quit();
			
		}
}
