package PageObjectPackage;

import CommonPackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class InsurancePage extends DriverFactory {

    public void products(){
        List<WebElement> customers=driver.findElements(By.cssSelector("a[class='nav-link ']"));
        customers.get(1);
        try {
        for (WebElement p:customers) {
            p.click();
        }
        }catch (StaleElementReferenceException p){
            System.out.println(p);
        }
        List<WebElement>product=driver.findElements(By.cssSelector("li[class='nav-item has-dropdown']"));
        product.size();
        try {
            for(WebElement v:product){
                System.out.println(v.getText());
                if (v.getText().contains("PRODUCTS")){

                }
            }
        }catch (StaleElementReferenceException u){
            System.out.println(u);
        }
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/header[1]/div[2]/nav[2]/div[1]/ul[1]/li[2]/a[1]"))).build().perform();
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='row flex-nowrap']//div[1]//ul[1]//li[1]//ul[1]//li[1]//a[1]"))).click().build().perform();

    }
}
