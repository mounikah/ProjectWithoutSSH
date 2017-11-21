package FirstPackage;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJunitFramework {
    @BeforeClass
    public static void beforeclass(){
        System.out.println("Before Class");
    }
    @Before
     public void beforetestcase(){
        System.out.println("Before Testcase------------");
    }
    @After
    public void aftertestcase(){
        System.out.println("After Testcase-------------");
    }
    @AfterClass
    public static void afterclass(){
        System.out.println("After Class");

    }
    @Test
     public void Test1(){
        System.out.println("Test Case 1");
    }
    @Test
    public void Test2(){
        System.out.println("Test Case 2");
    }
    @Test
    public void Test3(){
        System.out.println("Test Case 3");
    }

    }
