package sikullyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSikulyEx {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		//play button par jane se pehle hi close ho jata hai
		//snip tool nahi use kar pate
		//ess case me paint tool me printscr karte h aur paste karke sniptool use karte h
		//fir image save karke usko wish wise use karte hai
		driver.findElement(By.className("gb_h")).click();
		Screen src = new Screen();		
		Pattern play = new Pattern("C:\\Users\\panka\\OneDrive\\Desktop\\MorningSeleniumWorspace\\sikullyPractice\\playImgGoogle.PNG");
		src.click(play);
		Thread.sleep(4000);
		driver.close();
	}

}
