import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Task {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		Thread.sleep(5000);
		String Url= driver.getCurrentUrl();
		if (Url.contains("signup"))
		{
			System.out.println("Signup button enabled");
		}
		else 
		{
			System.out.println("Signp button Disabed");
		}
		driver.findElement(By.linkText("New user? Signup")).click();
		
		
		Thread.sleep(3000);
		WebElement rb1= driver.findElement(By.xpath("//button[@class='submit-btn']"));
		if (Url.contains("signup"))
		{
			System.out.println("Suessfully signup");
		}
		else 
		{
			System.out.println("Signup not working");
		}
		boolean t1 = rb1.isEnabled();
		if (!t1)
		{
			System.out.println("Validation 2 Passed- Button is disabled");
		}
		else 
		{
			System.out.println("Validation 2 Failed- Button is not disabled");
		}
		driver.findElement(By.id("name")).sendKeys("Prabin");
		
		driver.findElement(By.id("email")).sendKeys("JAVA"+System.currentTimeMillis() +"@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Prabin@1234");
		
		driver.findElement(By.className("form-check-input")).click();
		driver.findElement(By.id("gender2")).click();
		Select obj1= new Select(driver.findElement(By.id("state")));
		obj1.selectByVisibleText("Gujarat");
		Select obj2= new Select(driver.findElement(By.id("hobbies")));
		
		
		obj2.selectByVisibleText("Playing");
		obj2.selectByVisibleText("Reading");
		if (t1)
		{
			System.out.println("signup button is enabled");
		}
		else 
		{
			System.out.println("Signup button is disabed");
		}
		Thread.sleep(2000);
		driver.findElement(By.className("submit-btn")).click();
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("*************************************************************");
		
		
		//FirefoxDriver
		WebDriver driver1= new FirefoxDriver();
		driver1.get("https://freelance-learn-automation.vercel.app/login");
		driver1.manage().window().maximize();
		
		Thread.sleep(5000);
		String str1= driver1.getCurrentUrl();
		if (str1.contains("signup"))
		{
			System.out.println("Signup button enabled");
		}
		else 
		{
			System.out.println("Signp button Disabed");
		}
		driver1.findElement(By.linkText("New user? Signup")).click();
		
		
		
		Thread.sleep(3000);
		WebElement rb2= driver1.findElement(By.xpath("//button[@class='submit-btn']"));
		if (str1.contains("signup"))
		{
			System.out.println("Suessfully signup");
		}
		else 
		{
			System.out.println("Signup not working");
		}
		boolean t2 = rb2.isEnabled();
		if (!t2)
		{
			System.out.println("Validation 2 Passed- Button is disabled");
		}
		else 
		{
			System.out.println("Validation 2 Failed- Button is not disabled");
		}
		driver1.findElement(By.id("name")).sendKeys("Prabin");
		
		driver1.findElement(By.id("email")).sendKeys("JAVA"+System.currentTimeMillis() +"@gmail.com");
		driver1.findElement(By.name("password")).sendKeys("Prabin@1234");
		
		driver1.findElement(By.className("form-check-input")).click();
		driver1.findElement(By.id("gender1")).click();
		Select obj3= new Select(driver1.findElement(By.id("state")));
		obj3.selectByVisibleText("Gujarat");
		Select obj4= new Select(driver1.findElement(By.id("hobbies")));
		
		
		obj4.selectByVisibleText("Playing");
		obj4.selectByVisibleText("Reading");
		if (t1)
		{
			System.out.println("signup button is enabled");
		}
		else 
		{
			System.out.println("Signup button is disabed");
		}
		Thread.sleep(2000);
		driver1.findElement(By.className("submit-btn")).click();
		Thread.sleep(3000);
		driver1.quit();
		
		System.out.println("***********************************************************");
		
		
		//EdgeDriver
		WebDriver driver2= new EdgeDriver();
		driver2.get("https://freelance-learn-automation.vercel.app/login");
		driver2.manage().window().maximize();
		
		Thread.sleep(5000);
		String str2= driver2.getCurrentUrl();
		if (str2.contains("signup"))
		{
			System.out.println("Signup button enabled");
		}
		else 
		{
			System.out.println("Signp button Disabed");
		}
		driver2.findElement(By.linkText("New user? Signup")).click();
		
		
		
		Thread.sleep(3000);
		WebElement rb3= driver2.findElement(By.xpath("//button[@class='submit-btn']"));
		if (str2.contains("signup"))
		{
			System.out.println("Suessfully signup");
		}
		else 
		{
			System.out.println("Signup not working");
		}
		boolean t3 = rb3.isEnabled();
		if (!t3)
		{
			System.out.println("Validation 2 Passed- Button is disabled");
		}
		else 
		{
			System.out.println("Validation 2 Failed- Button is not disabled");
		}
		driver2.findElement(By.id("name")).sendKeys("Prabin");
		
		driver2.findElement(By.id("email")).sendKeys("JAVA"+System.currentTimeMillis() +"@gmail.com");
		driver2.findElement(By.name("password")).sendKeys("Prabin@1234");
		
		driver2.findElement(By.className("form-check-input")).click();
		driver2.findElement(By.id("gender2")).click();
		Select obj5= new Select(driver2.findElement(By.id("state")));
		obj5.selectByVisibleText("Gujarat");
		Select obj6= new Select(driver2.findElement(By.id("hobbies")));
		
		
		obj6.selectByVisibleText("Playing");
		obj6.selectByVisibleText("Reading");
		if (t1)
		{
			System.out.println("signup button is enabled");
		}
		else 
		{
			System.out.println("Signup button is disabed");
		}
		Thread.sleep(2000);
		driver2.findElement(By.className("submit-btn")).click();
		Thread.sleep(3000);
		driver2.quit();
		System.out.println("Successfully automate with 3 browsers");

	}

}
