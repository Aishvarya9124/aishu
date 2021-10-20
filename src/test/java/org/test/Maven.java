package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven {
	// private static final String url = null;
	public static WebDriver driver;

	public static WebDriver launchBr(String browerName) {
		switch (browerName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		default:
			System.out.println("Invalid Brower name");
			break;
		}

		return driver;
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static String getcurrenturl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static void filltextbox(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void btnClick(WebElement e) {
		e.click();
	}

	public static void quit() {
		driver.quit();
	}

	public static void implicitlyWait(int time, TimeUnit unit) {
		driver.manage().timeouts().implicitlyWait(time, unit);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static WebElement findElement(String loname, String locator) {
		WebElement e = null;
		if (loname.equals("id")) {
			e = driver.findElement(By.id(locator));
		} else if (loname.equals("name")) {
			e = driver.findElement(By.name(locator));
		} else if (loname.equals("xpath")) {
			e = driver.findElement(By.xpath(locator));
		}
		return e;
	}

	public static String getText(WebElement e) {
		return e.getText();
	}

	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");
	}

	public static void movetoelement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public static void draganddrop(WebElement src, WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}

	public static void takescreenshot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File(
				"C:\\Users\\Aishvarya\\eclipse-workspace\\selenium\\mavenproject\\screen\\" + name + ".png");
		FileUtils.copyFile(src, des);
	}

	public static void javaexecutor(String value, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(value, e);

	}

	public static void javaexecutorReturn(String value1, WebElement e) {
		Object value;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		value = js.executeScript(value1, e);
		System.out.println(value.toString());
	}

	public static void windowshandling() {
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> product = driver.getWindowHandles();
		System.out.println(product);
		int count = 0;
		for (String eachid : product) {
			if (count == 1) {
				driver.switchTo().window(eachid);

			}
			count++;

		}

	}

	public static void dropdowm(long e) throws AWTException {
		Robot r = new Robot();
		for (int i = 0; i <= e; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyPress(KeyEvent.VK_ENTER);

		}
	}
}
