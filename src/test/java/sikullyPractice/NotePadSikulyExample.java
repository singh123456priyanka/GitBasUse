package sikullyPractice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotePadSikulyExample {

	public static void main(String[] args) throws Throwable {
		
		//Before testing the script close or minimize the windows or else the mouse will get confuse to locate.
		WebDriverManager.chromedriver().setup();//for using robot class ,random class used webdriver 
		WebDriver driver= new ChromeDriver();
		driver.close();
		
		Screen src = new Screen();
		Pattern mini= new Pattern("C:\\Users\\panka\\OneDrive\\Desktop\\MorningSeleniumWorspace\\sikullyPractice\\minimizeEclipse.PNG");
		src.click(mini);
		
		Pattern search=new Pattern("C:/Users/panka/OneDrive/Desktop/MorningSeleniumWorspace/sikullyPractice/search.PNG");
		src.click(search);
		
		Pattern searchtxt=new Pattern("C:/Users/panka/OneDrive/Desktop/MorningSeleniumWorspace/sikullyPractice/CaptureSearchText.PNG");
		src.type(searchtxt, "Notepad");
		
		Robot bot=new Robot();
		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);
		  Random ran = new Random();
		  int ranNum = ran.nextInt(100);
		  Thread.sleep(1000);
		
		Pattern notepadwrite=new Pattern("C:/Users/panka/OneDrive/Desktop/MorningSeleniumWorspace/sikullyPractice/writeNotePad.PNG");
		src.type(notepadwrite, "Test Script Notepad tested"+ranNum);
		
		Pattern fileselect=new Pattern("C:/Users/panka/OneDrive/Desktop/MorningSeleniumWorspace/sikullyPractice/NotePadFileImg.PNG");
		src.click(fileselect);

		Pattern saveAsSel=new Pattern("C:/Users/panka/OneDrive/Desktop/MorningSeleniumWorspace/sikullyPractice/SaveAsImg.PNG");
		src.click(saveAsSel);
		Thread.sleep(500);
		
		Pattern fileNameTxt=new Pattern("C:/Users/panka/OneDrive/Desktop/MorningSeleniumWorspace/sikullyPractice/filenametext.PNG");
		//src.click(fileNameTxt);
		src.doubleClick(fileNameTxt);
		bot.keyPress(KeyEvent.VK_DELETE);
		bot.keyRelease(KeyEvent.VK_DELETE);
		Pattern fileName2=new Pattern("C:/Users/panka/OneDrive/Desktop/MorningSeleniumWorspace/sikullyPractice/fileName2.PNG");

		//Thread.sleep(300);
		src.type(fileName2, "NotepadSkillury"+ranNum);
		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Pattern close=new Pattern("C:/Users/panka/OneDrive/Desktop/MorningSeleniumWorspace/sikullyPractice/CaptureX.PNG");
		src.click(close);


		

	}

}
