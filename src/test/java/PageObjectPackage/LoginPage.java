package PageObjectPackage;

import CommonPackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage  extends DriverFactory {
    public void baseurl() {
        driver.getCurrentUrl();
    }

    public void Login() {
        driver.findElement(By.cssSelector("a[class='nav-link font-weight-bold']")).click();

        JavascriptExecutor jj=(JavascriptExecutor)driver;
        jj.executeScript("window.scrollBy(0,500)");
        List<WebElement>opt=driver.findElements(By.cssSelector("a[href='https://edocs.group.aiglife.co.uk/']"));
        opt.get(1);
        try {
            for (WebElement e:opt){
                e.click();
            }
        }catch (StaleElementReferenceException e){
            System.out.println(e);
        }

    }
}