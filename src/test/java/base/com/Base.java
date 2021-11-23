package base.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	/*
	 * To initialize the WebDriver
	 */
	public static void getDriver() {
		System.setProperty("webdriver.chrome.diver","C:\\\\saran\\\\facebook\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	/*
	 * To enter the url
	 */
	public static void geturl(String url) {
		driver.get(url);

	}
	/*
	 * To get the title of the application
	 */
public static String getTitle() {
	String title=driver.getTitle();
	return title;
	
}
/*
 * To get the current url of the application
 */
public static String getCurrentUrl() {
	String currenturl=driver.getCurrentUrl();
	return currenturl;

}
/*
 * Close the current browser tab to window
 */
public static void CloseBrowser() {
	driver.close();

}
/*
 * Close the all browser tab to window or tab
 */
public static void QuitBrowser() {
	driver.quit();

}

/*
 * Click the button or link or Radio button or Checkbox
 */
public static void Click(WebElement ele) {
	ele.click();

}

/*
 * To pass the values in Textbox
 */
public void insertType(WebElement ele,String Value) {
	ele.sendKeys(Value);
}

}

