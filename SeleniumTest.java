import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class SeleniumTest {
    public static void test() throws Exception {

        //Set path
        System.setProperty("webdriver.chrome.driver", "/Program Files (x86)/Google/Chrome/Application/chromedriver/chromedriver.exe");

        //Initialize Browser
        WebDriver driver=new ChromeDriver();

        //Let the user see something 
        Thread.sleep(5000);

        //Open Chrome
        driver.get("http://www.google.com");

        //Close Chrome
        driver.close();
    }

    public static void main(String[] args) throws Exception {
        test();
    }


}