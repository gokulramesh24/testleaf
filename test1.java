package prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();// Creating object for chromedriver
		driver.get("https://www.saucedemo.com/v1/");//Putting the url to launch
		driver.findElement(By.id("user-name")).sendKeys("standard_user");//Selecting username using Id and typing username 
		driver.findElement(By.id("password")).sendKeys("secret_sauce");//Selecting password using Id and entering the pass
driver.findElement(By.className("btn_action")).click();//Selecting the login button using classname and clicking it 
	}

}
