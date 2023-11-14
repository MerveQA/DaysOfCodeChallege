package DaysOfCodeChallege;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day06_20 {
     /*
    <textarea
      class     = "gLFyf"
      id        = "APjFqb"
      title                 = "Search"
      type                  = "search"
    </textarea>
     */

    @Test
    public void cssSelector() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        // css tag and id
        driver.findElement(By.cssSelector("textarea#APjFqb"));
        // css tag and class
        driver.findElement(By.cssSelector("textarea.gLFyf"));
        // css tag and attribute
        driver.findElement(By.cssSelector("textarea[id='APjFqb']"));
        // css tag, class and attribute
        driver.findElement(By.cssSelector("textarea.gLFyf[id='APjFqb']"));
        // css matches starts with
        driver.findElement(By.cssSelector("textarea[id^=’Apj’]"));
        // css matches ends with
        driver.findElement(By.cssSelector("textarea[id$=’Fqb’]"));
        // css matches contains
        driver.findElement(By.cssSelector("textarea[class*=’gLF’]"));

    }
}