package FirstPackage;
import org.junit.AfterClass;
        import org.junit.BeforeClass;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

        import java.util.concurrent.TimeUnit;


public class CopyMaster {


    /**
     * Created by User on 18/09/2017.
     */

        static WebDriver driver;
        static String baseURL = "http://epictesters.trials63.orangehrmlive.com";
         static String adminUserName = "admin", adminPassword = "HZzzHOIO";

//    public static void main(String[] args) {
//       SmokeTestSuite s1 = new SmokeTestSuite();
//
//       //Test case1 - admin login
//       s1.startBrowser();
//       s1.loginAs(adminUserName, adminPassword);
//        //checkpoints
//       s1.closeBrowser();
//
//        //Test case2 - add skill
//        s1.startBrowser();
////        s1.addSkill(skillName);
//        //checkpoints
//        s1.closeBrowser();
//
//    }

        @Test
        public void verifyUserCanLoginWithValidCredentials() {
            this.loginAs(adminUserName,adminPassword);
            //checkpoints - assertions
        }

       /* @Test
        public void verifyUserCannotLoginWithInValidCredentials() {
            this.loginAs("dfgdfg","dxfdxv");
            //checkpoints - assertions - verify the error messages
        }*/

        public void loginAs(String uname, String pwd) {
            //type the username
            WebElement usernameTextField = driver.findElement(By.id("txtUsername"));
            usernameTextField.sendKeys(uname);

            //type the password
            WebElement passwordtextField = driver.findElement(By.id("txtPassword"));
            passwordtextField.sendKeys(pwd);

            //click the login button
            WebElement loginButton = driver.findElement(By.id("btnLogin"));
            loginButton.click();
        }

        @BeforeClass
        public static void startBrowser() {
            //open the browser
            System.setProperty("webdriver.chrome.driver", "src/browserFiles/chromedriver.exe");
            driver = new ChromeDriver();

            //open the url
            driver.get(baseURL);
            // wait for page to load
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            //maximise your screen
            driver.manage().window().fullscreen();
        }

        @AfterClass
        public static void closeBrowser() {

            //close the browser
            driver.close();
        }



    }


