package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {

        this.driver = driver;
    }
    By searchInputLocator = By.xpath("//*[@id='lst-ib']");
    By searchButtonLocator = By.xpath("//*[@id='sblsbb']/button");
    public void searchInputLocator() {
        WebElement input = driver.findElement(searchInputLocator);
        input.click();
        input.clear();
        input.sendKeys("Endava IT Company");
    }
    public void searchButtonLocator() {
        driver.findElement(searchButtonLocator).click();
        System.out.println("Elements found:");
    }
    public int size() {
        driver.navigate().refresh();
        WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        int count = 0;
        while (bodyText.contains("Endava")){
            count++;
            // continue searching from where you left off
            bodyText = bodyText.substring(bodyText.indexOf("Endava") + "Endava".length());
        }
        System.out.print(count);
        return count;
    }
    }
















