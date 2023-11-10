package DaysOfCodeChallege;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_20 {
    static WebDriver driver;
    static String title;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/");
    }
    @Test
    public void test01_assertEquals() {
        title = driver.getTitle();
        Assert.assertEquals("Google", title);
    }
    @Test
    public void test02_assertTrue() {
        title = driver.getTitle();
        Assert.assertTrue(title.contains("Google"));
    }
    @Test
    public void test03_assertFalse() {
        title = driver.getTitle();
        Assert.assertFalse(title.contains("Amazon"));
    }
    @Test
    public void test04_assertNotNull() {
        String title = "Hello";
        Assert.assertNotNull(title);
    }
    @Test
    public void test05_assertNull() {
        String title = null;
        Assert.assertNull(title);
    }
    @Test
    public void test06_assertSame() {
        String name = "Mery", ad = "Mery";
        Assert.assertSame(name,ad);
    }
    @Test
    public void test07_assertNotSame() {
        String name = new String("mERY");
        String isim = new String("mERY");
        Assert.assertNotSame(name,isim);
    }
    @Test
    public void test08_assertArrayEquals() {
        int[] array01 = new int[]{10, 11, 12};
        int[] array02 = new int[]{10, 11, 12};
        Assert.assertArrayEquals(array01, array02);
    }
}
