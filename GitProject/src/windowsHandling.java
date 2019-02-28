
import org.junit.Test;

public class windowsHandling {


		
		@Test
		public void MultipleWindowsClass(){
			

			 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\geckodriver.exe");
			  
			 WebDriver driver=new FirefoxDriver();
			 
			 driver.manage().window().maximize();
		 
			 driver.get("http://www.naukri.com/");
			 
			 String mainWindow=driver.getWindowHandle();
			 
			 Set<String> set =driver.getWindowHandles();
			 
			 Iterator<String> itr= set.iterator();
			 while(itr.hasNext())
			 {
			 String childWindow=itr.next();
			    
			 if(!mainWindow.equals(childWindow))
			 {
			 driver.switchTo().window(childWindow);
			 System.out.println(driver.switchTo().window(childWindow).getTitle());
			 driver.close();
			 }
			 }
			 
			 driver.switchTo().window(mainWindow);
			 }
			
	}

}

}
