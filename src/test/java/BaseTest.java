import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
    @Test
    public void createAccountTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        driver.findElement(
                        By.xpath(
                                "(//a[contains(text(),'Create an Account')])[1]"))
                .click();
         driver.findElement(By.cssSelector("#firstname"))
                 .sendKeys(Constance.FIRST_NAME);
         driver.findElement(By.cssSelector("#lastname")).
                 sendKeys(Constance.LAST_NAME);
         driver.findElement(By.xpath("(//input[@type='email'])[1]"))
                 .sendKeys(Constance.EMAIL);
         driver.findElement(By.xpath("(//input[@type='password'])[1]"))
                 .sendKeys(Constance.PASSWORD);
         driver.findElement(By.xpath("(//input[@type='password'])[2]")).
                 sendKeys(Constance.CONFIRM_PASSWORD);
         driver.findElement
                 (By.xpath(
                         "(//span[contains(text(),'Create an Account')])[1]"))
                 .click();
    }


        @Test
        public void loginTest(){
            WebDriver driver = new ChromeDriver();
            driver.get("https://magento.softwaretestingboard.com/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("(//a[contains(text(),'Sign In ')])[1]")).click();
            driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys(Constance.EMAIL);
            driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys(Constance.PASSWORD);
            driver.findElement((By.xpath("(//span[contains(text(),'Sign In')])[1]"))).click();

        }

}
