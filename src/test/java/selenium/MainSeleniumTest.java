package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

class MainSeleniumTest {

    // Selenium Docs: https://www.selenium.dev/documentation/
    @Test
    void mainTest() throws InterruptedException {
        WebDriver webDriver = new EdgeDriver();
        Thread.sleep(2000);
        webDriver.navigate().to("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        List<WebElement> elementList = webDriver.findElements(By.cssSelector("a"));
        WebElement pageLink = elementList.get(2);
        Action action = new Actions(webDriver).moveToElement(pageLink).click().build();
        //pageLink.sendKeys("\n");
        action.perform();
        WebElement button = webDriver.findElement(By.cssSelector("button"));
        Thread.sleep(2000);
        button.sendKeys("\n");
        Thread.sleep(2000);
        webDriver.manage().window().setSize(new Dimension(300,300));
        Thread.sleep(2000);
        webDriver.manage().window().maximize();
        Thread.sleep(2000);
        webDriver.quit();
    }

}

