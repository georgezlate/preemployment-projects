package pages;

import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Method extends BasePage {

//Base find element method. Used by other methods.

	public static WebElement getWebElementBy(String selectorType, String selectorInfo, boolean selectorMandatory) {
		WebElement element = null;
		try {
			switch (selectorType) {
			case "id":
				element = driver.findElement(By.id(selectorInfo));
				break;
			case "className":
				element = driver.findElement(By.className(selectorInfo));
				break;
			case "xpath":
				element = driver.findElement(By.xpath(selectorInfo));
				break;
			case "name":
				element = driver.findElement(By.name(selectorInfo));
				break;
			case "cssSelector":
				element = driver.findElement(By.cssSelector(selectorInfo));
				break;
			}

		} catch (NoSuchElementException e) {
			if (selectorMandatory == true) {
				e.printStackTrace();
				driver.close();
				if (driver != null) {
					driver.quit();
					System.exit(1);
				}
			} else {
				e.printStackTrace();
			}
		}

		return element;
	}

//Wait for specific element

	public static void waitForElement(String selectorType, String selectorInfo) {

		switch (selectorType) {
		case "id":
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(selectorInfo)));
			break;
		case "xpath":
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectorInfo)));
			break;
		case "className":
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(selectorInfo)));
			break;
		case "name":
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(selectorInfo)));
			break;
		case "cssSelector":
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selectorInfo)));
			break;
		}

	}

//Get property from element

	public static String getProperty(String selectorType, String selectorInfo, boolean selectorMandatory,
			String propertyValue) {
		String value = null;
		try {
			switch (propertyValue) {
			case "getSize":
				Dimension size = getWebElementBy(selectorType, selectorInfo, selectorMandatory).getSize();
				value = size.toString();
				break;
			case "getTagName":
				String element = getWebElementBy(selectorType, selectorInfo, selectorMandatory).getTagName();
				value = element.toString();
				break;
			case "getLocation":
				Point location = getWebElementBy(selectorType, selectorInfo, selectorMandatory).getLocation();
				value = location.toString();
				break;

			}
		} catch (NoSuchElementException e) {
			if (selectorMandatory == true) {
				e.printStackTrace();
				driver.close();
				if (driver != null) {
					driver.quit();
					System.exit(1);
				}
			} else {
				e.printStackTrace();
			}
		}
		return value;
	}

//Click method

	public static void clickElement(String selectorType, String selectorInfo, boolean selectorMandatory) {

		getWebElementBy(selectorType, selectorInfo, selectorMandatory).click();

	}

//Read text from element

	public static String extractTextFromWebElement(String selectorType, String selectorInfo,
			boolean selectorMandatory) {

		return getWebElementBy(selectorType, selectorInfo, selectorMandatory).getText();

	}

//Type text in form

	public static void sendTextToForm(String selectorType, String selectorInfo, String keysSent,
			boolean selectorMandatory) {
		getWebElementBy(selectorType, selectorInfo, selectorMandatory).clear();
		getWebElementBy(selectorType, selectorInfo, selectorMandatory).sendKeys(keysSent);
	}

}
