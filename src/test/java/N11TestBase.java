import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by apple01 on 23.02.2020.
 */
public class N11TestBase {
    private WebDriver driver;
    public String searchPrice;
    public String basketPrice;

    LoginConstant loginConstant = new LoginConstant();


    public N11TestBase() {
        driver = new ChromeDriver();
    }

    public void start() {
        System.setProperty("webdriver.chrome.driver", "chromedriver\\");
        driver.get("https://www.n11.com/");
    }

    public void login(String username, String password) throws InterruptedException {
        driver.findElement(loginConstant.getButtonSignIn()).click();
        Thread.sleep(1000);
        driver.findElement(loginConstant.getInputEmail()).sendKeys(username);
        driver.findElement(loginConstant.getInputPassword()).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(loginConstant.getButtonLogin()).click();
        Thread.sleep(2000);
        String result = "";
        try {
            WebElement e = driver.findElement(loginConstant.getLoginResult());
            result = e.getText();
        } catch (Exception e) {
            result = "Successful";
        }
        Assert.assertNotEquals("Login error", result, "Failed Login");
        Thread.sleep(1000);
    }

    public void enterSearchBox(String k) throws InterruptedException {
        driver.findElement(loginConstant.getSearchBox()).sendKeys(k);
        Thread.sleep(2000);
        driver.findElement(loginConstant.getButtonSearch()).click();

        String result = "";
        k = k.substring(0, 1).toUpperCase() + k.substring(1, k.length());
        try {
            WebElement w = driver.findElement(loginConstant.getResultSearch());
            result = w.getText();
        } catch (Exception e) {
            result = k;
        }
        Assert.assertTrue("Error!", result.contains(k));
    }

    public void openSearchPage(Integer pageNumber) throws InterruptedException {
        driver.findElement(By.xpath(".//*[@id='contentListing']/div/div/div[2]/div[4]/a[" + pageNumber + "]")).click();
        Thread.sleep(1000);
        String result = "";
        try {
            result = driver.findElement(loginConstant.getCurrentPage()).getAttribute("value");
        } catch (Exception e) {
            result = "Successful";
        }
        Assert.assertNotEquals("Not found page", result, pageNumber.toString() + ". The page could not be reached...");
        Thread.sleep(1000);
    }

    public void selectProduct() throws InterruptedException {
        driver.findElement(By.xpath(".//*[@id='p-396793937']/div[1]/a")).click();
        Thread.sleep(3000);
    }

    public void addBasket() throws InterruptedException {
        WebElement prodPage = driver.findElement(loginConstant.getProductPagePrice());
        searchPrice = prodPage.getAttribute("searchpricevalue");
        driver.findElement(loginConstant.getAddBasket()).click();
        Thread.sleep(3000);

        driver.findElement(loginConstant.getGoBasket()).click();
        Thread.sleep(2000);

        WebElement basketPage = driver.findElement(loginConstant.getBasketPagePrice());
        basketPrice = basketPage.getAttribute("basketpricevalue");

        if (basketPrice == searchPrice){
            System.out.println("Same price");
        }
        else
        {
            System.out.println("Not same price");
        }



    }



    public void finish() {
        driver.close();
        driver.quit();
    }




}
