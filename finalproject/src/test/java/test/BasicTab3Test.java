package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Method;

public class BasicTab3Test extends pages.BasicTab3Method{

@Test
public void basicTab3Test(){
	tab3TestMethods();
	String firstParagraph = Method.extractTextFromWebElement("xpath",
			"/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[3]/p[1]", true);
	String secondParagraph = Method.extractTextFromWebElement("xpath",
			"/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[3]/p[2]", true);
	Assert.assertTrue(firstParagraph.equals("Mauris eleifend est et turpis. Duis id erat. Suspendisse potenti. Aliquam vulputate, pede vel vehicula accumsan, mi neque rutrum erat, eu congue orci lorem eget lorem. Vestibulum non ante. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Fusce sodales. Quisque eu urna vel enim commodo pellentesque. Praesent eu risus hendrerit ligula tempus pretium. Curabitur lorem enim, pretium nec, feugiat nec, luctus a, lacus."));
	Assert.assertTrue(secondParagraph.equals("Duis cursus. Maecenas ligula eros, blandit nec, pharetra at, semper at, magna. Nullam ac lacus. Nulla facilisi. Praesent viverra justo vitae neque. Praesent blandit adipiscing velit. Suspendisse potenti. Donec mattis, pede vel pharetra blandit, magna ligula faucibus eros, id euismod lacus dolor eget odio. Nam scelerisque. Donec non libero sed nulla mattis commodo. Ut sagittis. Donec nisi lectus, feugiat porttitor, tempor ac, tempor vitae, pede. Aenean vehicula velit eu tellus interdum rutrum. Maecenas commodo. Pellentesque nec elit. Fusce in lacus. Vivamus a libero vitae lectus hendrerit hendrerit."));
	System.out.println("testing is awesome");
}
}
