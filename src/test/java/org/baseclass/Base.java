package org.baseclass;


	import java.util.List;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.remote.server.handler.ExecuteScript;
	import org.openqa.selenium.support.ui.Select;
	import org.seleniumhq.jetty9.server.handler.ContextHandler.StaticContext;

	import okio.Options;

	public class Base { 
		public static WebDriver driver; 
		
		
		public static WebDriver launchBrowser() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sasi\\eclipse-workspace\\MavenTask\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
			
		}
		public static void launchurl(String url) {
			driver.get(url);
		}
		
		public static void fill(WebElement r,String s) {
			r.sendKeys(s);

		}
		public static void btnclick(WebElement c) {
		    c.click();	

		}
		public static String getAtt(WebElement g) {
			return g.getAttribute("value");
	       
		}
		public static void setatt(WebElement s,String v) {
			s.sendKeys(v);
			

		}
		public static void mte(WebElement e) {	
			Actions a=new Actions(driver);
			a.moveToElement(e).perform();
			

		}
		public static void dad(WebElement src,WebElement des) {
			Actions a=new Actions(driver);
			a.dragAndDrop(src, des).perform();
			

		}
		public static void rclick(WebElement e) {
			Actions a=new Actions(driver);
			a.contextClick(e).perform();

		}
		public static void ddclick(WebElement e) {
			Actions a=new Actions(driver);
			a.doubleClick(e).perform();

		}
		public static void salart() {
			driver.switchTo().alert().accept();
			
		}
		public static void calart() {
			driver.switchTo().alert().dismiss();

		}
		public static void palart(String t) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(t);
			alert.accept();
		}
		public static void sbvi(WebElement e,int index) {
		 Select s=new Select(e);
		 s.selectByIndex(index);
			
		}
		public static void sbvt(WebElement e,String text) {
			Select s= new Select(e);
			s.selectByVisibleText(text);
			
		}
		public static void sbv(WebElement e,String value) {
			Select s=new Select(e);
			s.selectByValue(value);
			
		}
		public static String getOption(WebElement e) {
			Select s=new Select(e);
			  String text=null;
			List<WebElement> options = s.getOptions();
			for (int i = 0; i < options.size(); i++) {
				   WebElement h = options.get(i);
				    text = h.getText();
			}
			return text;
			
		}
		public static void dsbi(WebElement e,int index) {
			Select s=new Select(e);
			s.deselectByIndex(index);
			
		}
		public static void dsbvt(WebElement e,String text ) {
			Select s=new Select(e);
			s.deselectByVisibleText(text);
			
		}
		public static void dsbi(WebElement e,String value) {
			Select s=new Select(e);
			s.deselectByValue(value);
			
		}
		public static boolean isMultiple(WebElement e) {
			Select s=new Select(e);
			boolean multiple = s.isMultiple();
			return multiple;
		}
		public static void dsa(WebElement e) {
			Select s=new Select(e);
			s.deselectAll();
		}
		public static void gfso(WebElement e) {
			Select s=new Select(e);
			s.getFirstSelectedOption();
			
		}
		public static void insert(String s,WebElement w) {
			JavascriptExecutor j=(JavascriptExecutor)driver;
			j.executeScript("arguments[0].setAttribute('value','s')", w);
			
		}
		public static void click(WebElement e) {
			JavascriptExecutor j=(JavascriptExecutor)driver;
			j.executeScript("arguments[0].click",e);

		}
		public static void jgetatt(WebElement e) {
			JavascriptExecutor j=(JavascriptExecutor)driver;
			j.executeScript("arguments[0].getAttribute", e);
			
		}
		public static void jclick(WebElement e) {
			JavascriptExecutor j=(JavascriptExecutor)driver;
			j.executeScript("arguments[0].click()",e);
		}
		public static void sdown(WebElement e) {
			JavascriptExecutor j=(JavascriptExecutor)driver;
			j.executeScript("arguments[0].scrollIntoView(true)", e);
		}
		public static void sup(WebElement e) {
			JavascriptExecutor j=(JavascriptExecutor)driver;
			j.executeScript("arguments[0].scrollIntroView(false)", e);
		
		}
		
		
		
		
		
		

	}


