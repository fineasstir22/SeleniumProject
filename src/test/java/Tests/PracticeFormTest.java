package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class PracticeFormTest {

    public WebDriver driver;
    public String homePage = "https://demoqa.com/";


    @Test
    public void automationMethod(){

        driver = new ChromeDriver();
        driver.get(homePage);
        driver.manage().window().maximize();

        //JavascriptExecutor jsScroll = (JavascriptExecutor) driver;
        //jsScroll.executeScript("window.scrollBy(0,400)");

        WebElement formsField = driver.findElement(By.xpath("//h5[text()='Forms']"));
        formsField.click();

        WebElement parcticeFormField = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        parcticeFormField.click();

        WebElement firstNamePracticeForm = driver.findElement(By.id("firstName"));
        String firstNamePracticeFormText = "Ion";
        firstNamePracticeForm.sendKeys(firstNamePracticeFormText);

        WebElement lastNamePracticeForm = driver.findElement(By.id("lastName"));
        String lastNamePracticeFormText = "Zapada";
        lastNamePracticeForm.sendKeys(lastNamePracticeFormText);

        WebElement emailPracticeForm = driver.findElement(By.id("userEmail"));
        String emailPracticeFormText = "IonZ@gmail.com";
        emailPracticeForm.sendKeys(emailPracticeFormText);

        //WebElement genderSelectionForm = driver.findElement(By.id("genterWrapper"));
        WebElement genderMaleRadioButton = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        genderMaleRadioButton.click();

        WebElement userPhoneNumberForm = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String userPhoneNumberFormText = "1234567890";
        userPhoneNumberForm.sendKeys(userPhoneNumberFormText);

        //WebElement userDateOfBirthForm = driver.findElement(By.id("dateOfBirthInput"));
        //userDateOfBirthForm.click();
        //userDateOfBirthForm.clear();
        //String userDateOfBirthFormText = "22 Sep 1994";
        // userDateOfBirthForm.sendKeys(userDateOfBirthFormText);

        WebElement pictureUploadForm = driver.findElement(By.id("uploadPicture"));
        File file = new File("src/test/java/Tests/resources/testImg.png");
        pictureUploadForm.sendKeys(file.getAbsolutePath());

    }

}
