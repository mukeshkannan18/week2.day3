package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mukeshkannan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("mukesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("su");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("computer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Educational Institude");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mukeshkannansubbaiah18@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("nolan");
		driver.findElement(By.linkText("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
	}
		

}
