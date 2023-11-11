package DaysOfCodeChallege;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_20 {

    /*
         Working website : https://www.linkedin.com/
         Working area    : email or phone (search field)
         html            :
       < input
         class = "text-color-text font-sans text-md outline-0 bg-color-transparent grow"
  autocomplete = "username"
            id = "session_key"
          name = "session_key"
      required = ""
          type = "text" >
     */

    @Test
    public void locators01() {
        WebDriver driver = new ChromeDriver();

        // By.id
        driver.findElement(By.id("session_key"));
        // By.className
        driver.findElement(By.className("text-color-text font-sans text-md outline-0 bg-color-transparent grow"));
        // By.name
        driver.findElement(By.name("session_key"));
        // By.tagName
        driver.findElement(By.tagName("input"));

    }

 /*
         Working website : https://www.linkedin.com/
         Working area    : Şifrenizi mi unuttunuz? (link)
         html            :
        < a
        data-id = "sign-in-form__forgot-password"
          class = "font-sans text-md font-bold link leading-regular sign-in-form__forgot-password--full-width"
           href = "https://www.linkedin.com/uas/request-password-reset?trk=homepage-basic_forgot_password"
        data-tracking-control-name = "homepage-basic_forgot_password"
       data-tracking-will-navigate = "">
           Şifrenizi mi unuttunuz?
        </a>
     */

    @Test
    public void locators02() {
        WebDriver driver = new ChromeDriver();

        // By.linkText
        driver.findElement(By.linkText("Şifrenizi mi unuttunuz?"));
        // By.patialLinkText
        driver.findElement(By.partialLinkText("unuttunuz"));

    }

}
