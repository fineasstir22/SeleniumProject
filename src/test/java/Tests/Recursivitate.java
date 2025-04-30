package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Recursivitate {

    public WebDriver driver;

    @Test
    public void readList(){
        //deschidem un Chrome Browser
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://demoqa.com/sortable");

        //facem browser-ul in modul maximize
        driver.manage().window().maximize();

        List<WebElement> list = driver.findElements(By.xpath("//div[@id='demo-tabpane-list']//div[@class='list-group-item list-group-item-action']"));
        Actions actions = new Actions(driver);
        for(int i=0; i<list.size()-1; i++){
            WebElement currentElement = list.get(i);
            WebElement nextElement = list.get(i++);
            System.out.println("Element number is: " + currentElement.getText());
            actions.clickAndHold(currentElement)
                    .moveToElement(nextElement)
                    .release()
                    .build()
                    .perform();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
