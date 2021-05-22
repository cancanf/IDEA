import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDbuy {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
//        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jd.com/");
        Thread.sleep(3000);
//      <a href="javascript:login();" class="link-login">你好，请登录</a>
        WebElement loginLink = driver.findElement(By.linkText("你好，请登录"));
        loginLink.click();
        System.out.println("saoma 30s");
        Thread.sleep(20000);
        driver.get("https://cart.jd.com/cart.action");
        Thread.sleep(10000);
//        driver.findElement()
    }
}
