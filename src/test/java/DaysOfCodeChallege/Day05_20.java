package DaysOfCodeChallege;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05_20 {
    /*
    <textarea
      class     = "gLFyf"
      id        = "APjFqb"
      title                 = "Search"
      type                  = "search"
    </textarea>
     */

    @Test
    public void dynamicXpath() {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");

    // single slash
    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));
    // Double slash
    driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
    // Single Attribute
    driver.findElement(By.xpath("//*[@id='APjFqb']"));
    // Multiple Attribute
    driver.findElement(By.xpath("//*[@title='Search'][@type='search']"));
    // Use AND
    driver.findElement(By.xpath("//*[@id='APjFqb' amd @class='gLFyf']"));
    // Use OR
    driver.findElement(By.xpath("//*[@id='APjFqb' or @class='lku']"));
    // Use contains (all)
    driver.findElement(By.xpath("//textarea[contains(@id,'APjFqb')]"));
    // Use contains (partial)
    driver.findElement(By.xpath("//textarea[contains(@id,'APjF')]"));
    // Use starts-with
    driver.findElement(By.xpath("//textarea[starts-with(@class,'gLF')]"));
    }
}
