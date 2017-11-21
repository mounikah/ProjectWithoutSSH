package FirstPackage;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OHRMJunitFramework {
    static WebDriver driver;

    @BeforeClass
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/BrowserFiles/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://epictesters.trials63.orangehrmlive.com");

    }
   /* @AfterClass
    public static void closeBrowser(){

        driver.close();
    }*/
    @Before
    public void login(){
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("HZzzHOIO");
        driver.findElement(By.id("btnLogin")).click();

    }
   /* @After
    public void logout() throws InterruptedException {
        driver.findElement(By.xpath("//span[@id='account-job']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='user_menu']/li[4]/a")).click();

    }*/
    @Test
          public void verifyAdminCanSearchEmployee()throws InterruptedException{
        driver.switchTo().frame("noncoreIframe");
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
        driver.findElement(By.xpath("//input[@id='employee_name_quick_filter_employee_list_value']")).sendKeys("Andy Murray");
        driver.findElement(By.xpath("//*[@id='quick_search_icon']")).click();
        Thread.sleep(6000);
        }
     @Test
          public void verifyAdminCanAddEmployee()throws InterruptedException{
         driver.switchTo().frame("noncoreIframe");
         driver.findElement(By.id("menu_pim_viewPimModule")).click();
         driver.findElement(By.id("menu_pim_addEmployee" )).click();
         Thread.sleep(6000);
         driver.findElement(By.id("firstName")).sendKeys("Mounika");
         driver.findElement(By.id("lastName")).sendKeys("Han");
         Thread.sleep(5000);
         //WebElement Location_drpdwn=driver.findElement(By.name("location"));
        // Select drp_dwn=new Select(Location_drpdwn);
        // drp_dwn.selectByIndex(1);
         driver.findElement(By.xpath("//*[@id='pimAddEmployeeForm']/div[1]/div/materializecss-decorator[2]/div/sf-decorator[1]/div/sf-decorator[4]/div/label")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("username")).sendKeys("myusername");
         driver.findElement(By.xpath("//*[@id='password']")).sendKeys("mypassword");
         driver.findElement(By.xpath("//*[@id='confirmPassword']")).sendKeys("mypassword");
         Thread.sleep(3000);
         WebElement status_drpdwn=driver.findElement(By.id("status" ));
         Select s_dwn=new Select(status_drpdwn);
         s_dwn.selectByValue("string:Disabled");
         Thread.sleep(3000);

     }
     @Test
     public void verifyAdminCanEditEmployee()throws InterruptedException{
         driver.switchTo().frame("noncoreIframe");
         driver.findElement(By.id("menu_pim_viewPimModule")).click();
         driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id='employeeListTable']/tbody/tr[1]/td[4]")).click();
         Thread.sleep(3000);
        driver.findElement(By.xpath("//form[@id='pimPersonalDetailsForm']/materializecss-decorator[3]/div/sf-decorator[3]/div/ul/li[1]/label")).click();
Thread.sleep(3000);

     }
     @Test
    public void verifyAdminCanAddSkill() throws InterruptedException {
         driver.switchTo().frame("noncoreIframe");
         driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/a")).click();
         driver.findElement(By.xpath("//*[@id='menu_admin_Qualifications']/a")).click();
         driver.findElement(By.xpath("//*[@id='menu_admin_viewSkills']/span[2]")).click();
         driver.findElement(By.xpath("//*[@id='skillDiv']/div[1]/a/i")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Training100");
         driver.findElement(By.xpath("//*[@id='description']")).sendKeys("Automation tool training100");
         driver.findElement(By.xpath("//*[@id='modal1']/form/div[2]/a[1]")).click();
         Thread.sleep(3000);


     }
     @Test
    public void verifyAdminCanDeleteEmp() throws InterruptedException {
         driver.switchTo().frame("noncoreIframe");
         driver.findElement(By.id("menu_pim_viewPimModule")).click();
         driver.findElement(By.xpath("//*[@id='menu_pim_viewEmployeeList']")).click();
         Thread.sleep(5000);
       //  driver.findElement(By.xpath("//*[@id='employeeListTable']/tbody/tr[2]/td[1]/label")).click();
         driver.findElement(By.xpath("//*[contains(text(),'Andy Murray')]"));
         driver.findElement(By.xpath("//*[@id='employeeListTable']/thead/tr/th[1]")).click();
         driver.findElement(By.xpath("//*[@id='list-options-dropdown']/li[3]/a")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id='delete_confirmation_modal']/div[2]/a[2]")).click();
         Thread.sleep(2000);

     }
    }



