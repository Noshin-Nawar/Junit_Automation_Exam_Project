package testNGTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.MainPage;
import util.BrowserFactory;

public class TestWebPage {


WebDriver driver;

@Test
		public void addCategoryButton() throws InterruptedException {

		driver = BrowserFactory.init();

		//adding items
		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		mainPage.AddCategory("Noshin");
		mainPage.ClickAddCategory();
		mainPage.verifyEnteredCategory();
		Thread.sleep(5000);

		//mainPage.AddDublicateCategory("Nawar");
		//mainPage.ClickAddCategory();
		//mainPage.AddDublicateCategory("Techfios");
		//mainPage.ClickAddCategory();
		//Thread.sleep(5000);
		mainPage.AddCategory("Noshin");
		mainPage.ClickAddCategory();
		//mainPage.clickAddCategoryDublicate();
		//mainPage.DateFormatValidation();
		//BrowserFactory.tearDown();

		
}


}
