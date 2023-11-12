package DaysOfCodeChallege;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_20 {
    /*
    Account&Lists HTML          : < a id = "nav-link-accountList" >
    Create your Amazon account  : < a is = "createAccountSubmit" >
    Continue                    : < input id = "continue" >
    Customer Name               : < div id ="auth-customerName-missing-alert" >
    Customer Email              : < div id ="auth-email-missing-alert" >
    Customer Password           : < div id ="auth-password-missing-alert" >

     */
    static WebDriver driver;

    @Test
    public void xPathTest01() {
        driver = new ChromeDriver();

        // 1.Open the Homepage: https://www.bookdepository.com/.
        driver.get("https://www.bookdepository.com/.");
        // 2.Click the “Account&Lists”
        WebElement accountLists = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        accountLists.click();
        // 2.Click the “Create your Amazon account"
        WebElement createAccount = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
        createAccount.click();
        // 3.Click the “Continue”
        WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
        cont.click();
        // 5.Verify that the user cannot register with empty required fields.
        WebElement nameMessage = driver.findElement(By.xpath("//div[@id='auth-customerName-missing-alert']"));
        Assert.assertTrue(nameMessage.isDisplayed());
        WebElement emailMessage = driver.findElement(By.xpath("//div[@id='auth-email-missing-alert']"));
        Assert.assertTrue(emailMessage.isDisplayed());
        WebElement passwordMessage = driver.findElement(By.xpath("//div[@id='auth-password-missing-alert']"));
        Assert.assertTrue(passwordMessage.isDisplayed());

    }

}
