package DaysOfCodeChallege;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Day01_20 {
        /*
    Go to w3school homepage
    Do the following tasks by creating 3 different test methods.
    *- Let's print "STARTED" before all test() methods run
    *- Let's print "FINISHED" after all test() methods run.
    *- Let's print "Test has started" before each test() method runs.
    *- Let's print "method name + running" in all test methods
    *- Let's print "Test has finished" after each test() method runs
    3- Test if the title contains "W3schools"  when the page window is minimize
    4- Test if the title does not contain "boss" when the page window is fullscreen
    */


        static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/");
        System.out.println("STARTED");
    }
    @Before
    public void before() {
        System.out.println("Test has started");
    }
    @Test
    public void test01() {
        System.out.println("test01 is running");
        driver.manage().window().minimize();
        String title = driver.getTitle();
        Assert.assertFalse(title.contains("Boss"));
    }
    @Test
    public void test02() {
        System.out.println("test02 is running");
        driver.manage().window().fullscreen();
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("W3Schools"));
    }
    @After
    public void after() {
        System.out.println("Test has finished");
    }
    @AfterClass
    public static void tearDown() {
        driver.close();
        System.out.println("FINISHED");
    }

    /*
          OUTPUT :
            STARTED
            Test has started
            test01 is running
            Test has finished
            Test has started
            test02 is running
            Test has finished
            FINISHED
*/
}

