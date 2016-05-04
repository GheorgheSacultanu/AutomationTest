package google;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Firefox {

    protected WebDriver driver = new FirefoxDriver();

    @Before
    public void setUp(){

        driver.get("https://www.google.com/?gws_rd=ssl");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//    @After
//    public void tearDown(){
//        driver.close();
//        driver.quit();
//    }

}
