package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class PracticeFormTest {

    public WebDriver driver;
    public String homePage = "https://demoqa.com/";


    @Test
    public void automationMethod() {

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
        WebElement genderFemaleRadioButton = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement genderOtherRadioButton = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

        String genderType = "Other";
        if (genderMaleRadioButton.getText().equals(genderType)) {
            genderMaleRadioButton.click();
        } else if (genderFemaleRadioButton.getText().equals(genderType)) {
            genderFemaleRadioButton.click();
        } else if (genderOtherRadioButton.getText().equals(genderType)) {
            genderOtherRadioButton.click();
        }


        WebElement userPhoneNumberForm = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String userPhoneNumberFormText = "1234567890";
        userPhoneNumberForm.sendKeys(userPhoneNumberFormText);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");


        WebElement subjectsElementForm = driver.findElement(By.id("subjectsInput"));
        String subjectsElementValue = "Social Studies";
        subjectsElementForm.sendKeys(subjectsElementValue);
        subjectsElementForm.sendKeys(Keys.ENTER);


        WebElement userSportsHobbiesForm = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        WebElement userReadingHobbiesForm = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
        WebElement userMusicHobbiesForm = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));

        String hobbiesType = "Music";
        if (hobbiesType.equals("Music")) {
            userMusicHobbiesForm.click();
        } else if (hobbiesType.equals("Sports")) {
            userSportsHobbiesForm.click();
        } else if (hobbiesType.equals("Reading")) {
            userReadingHobbiesForm.click();
        }

        //WebElement userDateOfBirthForm = driver.findElement(By.id("dateOfBirthInput"));
        //userDateOfBirthForm.click();
        //userDateOfBirthForm.clear();
        //String userDateOfBirthFormText = "22 Sep 1994";
        // userDateOfBirthForm.sendKeys(userDateOfBirthFormText);

        WebElement pictureUploadForm = driver.findElement(By.id("uploadPicture"));
        File file = new File("src/test/java/Tests/resources/testImg.png");
        pictureUploadForm.sendKeys(file.getAbsolutePath());


        js.executeScript("window.scrollBy(0,400)");

        WebElement addressForm = driver.findElement(By.id("currentAddress"));
        String addressFormText = "Vaida Voievod 152, Cluj-Napoca";
        addressForm.sendKeys(addressFormText);

        WebElement selectStateForm = driver.findElement(By.id("react-select-3-input"));
        js.executeScript("arguments[0].click();", selectStateForm);
        selectStateForm.sendKeys("NCR");
        selectStateForm.sendKeys(Keys.ENTER);

        WebElement selectCity = driver.findElement(By.id("react-select-4-input"));
        js.executeScript("arguments[0].click();", selectCity);
        selectCity.sendKeys("Delhi");
        selectCity.sendKeys(Keys.ENTER);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

    }

}
