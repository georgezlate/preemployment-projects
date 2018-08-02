package pages;

import org.openqa.selenium.WebElement;

public class BasicTab3Method extends pages.Method {

	public static void tab3TestMethods() {
		WebElement demoButton = Method.getWebElementBy("xpath",
				"/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/a[1]", true);
		demoButton.click();
		WebElement tabsButton = Method.getWebElementBy("xpath", "//a[@title='Tabs']", true);
		tabsButton.click();
		WebElement tab3 = Method.getWebElementBy("xpath", "//a[@id='ui-id-3']", true);
		tab3.click();

	}

}
