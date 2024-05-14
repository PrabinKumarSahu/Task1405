package SelenimDay1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLoading {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		String currectUrlName= driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(currectUrlName);
		System.out.println(title);
		WebElement rb= driver.findElement(By.xpath("//input[@id='email']"));
		rb.sendKeys("Prabin");
		//driver.close();
		
		
		
	}

}
