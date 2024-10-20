package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	public static WebDriver driver;
	public Properties prop;
	public String sheetname;

	//To develop a function to select browser
	public WebDriver initializeDriver() throws IOException {
		//use the property
		prop=new Properties();
		//path to property
		String proppath=System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties";
		//create file input stream object
		FileInputStream fis=new FileInputStream(proppath);
		prop.load(fis); // we get data from data.properties

		//create a code for browser selection
		String choicebrowser="chrome";
		if(choicebrowser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(choicebrowser.equals("fiefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(choicebrowser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}else {
			System.out.println("Invalid Browser Selection");
			System.exit(1);
		}	
		//To Window maximize and delete cookies
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;

	}


	//Add fuctionality to take screenshot
	public String TakeScreenshot(String testname,WebDriver driver) throws IOException {
		File srcscreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Path to get screenshot
		String screenshotfilepath=System.getProperty("user.dir")+"\\Screenshot\\"+testname+".png";
		//copy the file
		FileUtils.copyFile(srcscreenshot, new File(screenshotfilepath));		
		return screenshotfilepath;

	}	

	//Switch to window
	public static void SwitchWindow() {
		String parentwindow=driver.getWindowHandle();
		Set<String> windowhandles=driver.getWindowHandles();
		windowhandles.size();
		//through windows		
		for(String childwindow:windowhandles) {
			if(!childwindow.contentEquals(parentwindow)) {
				driver.switchTo().window(childwindow);
			}
		}

	}

	//Function to wait for an element to be Clickable
	public static WebElement waitforElementTobeClickable(WebElement element,int timeoutinseconds) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeoutinseconds));
		return wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	public static void waitExplicit(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	//Fuction for read the excel file
	public static String[][] getlogindata(String sheetname) throws IOException{
		//create a workbook object
		XSSFWorkbook book=new XSSFWorkbook("D:\\Mytasks\\Spicejet-upd-Capstask-main\\src\\test\\java\\Testdata\\Spicejet Data.xlsx");
		// to access the sheet
		XSSFSheet sheet=book.getSheet(sheetname);
		//get no of row
		int rowcount=sheet.getLastRowNum();
		//get no of column
		int columncount=sheet.getRow(0).getLastCellNum();

		//create a 2d array for store data
		String[][]data=new String[rowcount][columncount];


		for(int i=0;i<rowcount;i++) {
			Row row=sheet.getRow(i+1);

			for(int j=0;j<columncount;j++) {
				Cell cell=row.getCell(j);

				//if cell is empty
				data[i][j] =(cell!=null)?cell.toString():null;
			}
		}
		book.close();
		return data;
	}

	public static String getPageTitle() {
		return driver.getTitle();
	}

	public static void selectFromDropDown(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);;
	}
	public static void clickOn(WebElement element) {
		waitExplicit(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
	public static void mouseclick(WebElement element) {
		Actions action=new Actions(driver);
		action.click(element).perform();
	}
}