package com.cucumber.base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
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

public class AllMethods {
	public static WebDriver driver;

	public static WebDriver gettingBrowser(String browserName) throws Throwable {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			throw new Exception("Invalid browserName");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		return driver;

	}

	public static void geturl(String url) {
		driver.get(url);

	}

	public static void isDisplayed(WebElement element) {
		boolean display = element.isDisplayed();
		System.out.println(display);
	}

	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		//System.out.println(enabled);
	}

	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		//System.out.println(selected);
	}

	public static void elementVisibility(WebElement element, String key) {
		if (element.isDisplayed() && element.isEnabled()) {
			element.clear();
			element.sendKeys(key);
		}
	}

	public static void clicks(WebElement element) {
		element.click();
	}

	public static void moveTo(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	public static void robotUse() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void javaScript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	/*public void asserts(Object[] expected, Object[] actual) {
		Assert.assertEquals(expected, actual);
		System.out.println("product found");
	}*/

	public static File screenShot(String filename) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\cbzsr\\OneDrive\\Desktop\\eclipse\\jdk\\CucumberDay2\\src\\test\\resource\\screenShot\\" + filename + ".png");
		FileUtils.copyFile(screenshotAs, dest);
		return dest;

	}

	public static String DataDriving(int rownum, int columnnum) throws Throwable {
		File f = new File("C:\\Users\\cbzsr\\OneDrive\\Desktop\\eclipse\\jdk\\mavenproject\\newExcel\\newBook.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fin);
		Sheet sheet = wb.getSheet("Sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		Row row = sheet.getRow(rownum);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		Cell cell = row.getCell(columnnum);
		CellType type = cell.getCellType();
		String S = null;
		if (type.equals(CellType.STRING)) {
			S = cell.getStringCellValue();
		} else if (type.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			S = String.valueOf(l);
		}
		return S;
		// System.out.println(S);

	}

	public static void updateToExcel(int rownum, int columnnum, String url) throws Throwable {
		File f = new File("C:\\Users\\cbzsr\\OneDrive\\Desktop\\eclipse\\jdk\\mavenproject\\newExcel\\newBook.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(rownum);
		if (row == null) {
			Row createRow = sheet.createRow(rownum);
		}
		Cell cell = row.getCell(columnnum);
		if (cell == null) {
			Cell createCell = row.createCell(columnnum);
		}
		cell.setCellValue(url);
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		fout.close();
	}

	public static void waitForElementVisiblity(WebElement element) throws Exception {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 50);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void selectOptionInDD(WebElement element, String options, String values) throws Exception {
		waitForElementVisiblity(element);
		Select sc = new Select(element);
		if (options.equalsIgnoreCase("index")) {
			sc.selectByIndex(Integer.parseInt(values));
		} else if (options.equalsIgnoreCase("value")) {
			sc.selectByValue(values);
		} else if (options.equalsIgnoreCase("visibletext")) {
			sc.selectByVisibleText(values);
		} else {
			throw new Exception("Not a valid options");

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}