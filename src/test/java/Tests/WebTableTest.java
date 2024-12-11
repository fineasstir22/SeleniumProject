package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest {

    public WebDriver driver;
    public String homePage = "https://demoqa.com/";

    @Test
    public void WebTableTest() {

        //deschidem un Chrome Browser
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get(homePage);

        //facem browser-ul in modul maximize
        driver.manage().window().maximize();

        /*//facem un scroll
        JavascriptExecutor jsScroll = (JavascriptExecutor) driver;
        jsScroll.executeScript("window.scrollBy(0,400)");    //Axa X Y unde X = 0 si Y = 400 */

        //declaram un element si facem click pe el
        WebElement elementsField = driver.findElement(By.xpath("//h5[text()='Elements']"));
        elementsField.click();

        WebElement webTablesField = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTablesField.click();

        //elementul e gasit dupa ID nu dupa XPath
        WebElement addField = driver.findElement(By.id("addNewRecordButton"));
        addField.click();

        //facem fill in tabelul de Registration Form
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        String firstNameValue = "John";
        firstNameField.sendKeys(firstNameValue);

        WebElement lastNameField = driver.findElement(By.id("lastName"));
        String lastNameValue = "Snow";
        lastNameField.sendKeys(lastNameValue);

        WebElement emailField = driver.findElement(By.id("userEmail"));
        String emailValue = "john.snow@gmail.com";
        emailField.sendKeys(emailValue);

        WebElement ageField = driver.findElement(By.id("age"));
        String ageValue = "21";
        ageField.sendKeys(ageValue);

        WebElement salaryField = driver.findElement(By.id("salary"));
        String salaryValue = "10000";
        salaryField.sendKeys(salaryValue);

        WebElement departmentField = driver.findElement(By.id("department"));
        String departmentValue = "Software Development";
        departmentField.sendKeys(departmentValue);

        WebElement submitButtonField = driver.findElement(By.id("submit"));
        submitButtonField.click();

        WebElement textTableTitle = driver.findElement(By.xpath("//h1[text()='Web Tables']"));
        Assert.assertEquals(textTableTitle.getText(), "Web Tables", "Text is not matching expected");


    }

}
