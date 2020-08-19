package Base;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementInfo;


public class BaseStep {
    WebDriver driver;
    WebDriverWait wait;



public BaseStep(){

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Furkan\\Desktop\\Cucumber\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();

}





    public enum Pather {
        id,
        className,
        name,
        xPath,
        cssSelector,
        linkText
    }

    public enum TimeOut {
        LOW(5),
        MIDDLE(10),
        HIGH(15),
        CUSTOM_MAX(60);


        private final int value;


        public int getValue() {
            return value;
        }

        // enum constructor - cannot be public or protected
        private TimeOut(int value) {
            this.value = value;
        }

    }


    public void geturl()
    {
        driver.get("https://www.hepsiburada.com");

    }

    public void geturlPC()
    {
        driver.get("https://www.hepsiburada.com/laptop-notebook-dizustu-bilgisayarlar-c-98");

    }




    public void findElementSendKeys(String path, Pather type, String text) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, TimeOut.MIDDLE.value);
            switch (type) {
                case className:
                    wait.until(ExpectedConditions.elementToBeClickable(By.className(path))).sendKeys(text);
                    break;
                case id:
                    wait.until(ExpectedConditions.elementToBeClickable(By.id(path))).sendKeys(text);
                    break;
                case name:
                    wait.until(ExpectedConditions.elementToBeClickable(By.name(path))).sendKeys(text);
                    break;
                case xPath:
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path))).sendKeys(text);
                    break;
                case cssSelector:
                    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(path))).sendKeys(text);
                    break;
                case linkText:
                    wait.until(ExpectedConditions.elementToBeClickable(By.linkText(path))).sendKeys(text);
                    break;
                default:
                    new NotFoundException();
            }

        } catch (Exception ex) { }
    }


    public boolean isElementVisible(ElementInfo info, int timeout){

        try{
            WebDriverWait wait = new WebDriverWait(driver,timeout);
            wait.until(ExpectedConditions.visibilityOfElementLocated(info.getBy()));
            return true;
        }catch (Exception e){
            return false;
        }

    }




    public void waitElement(WebElement element, TimeOut timeOut) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut.value);
            wait.until(ExpectedConditions.invisibilityOf(element));
        } catch (Exception ex)
        {
            System.out.println("işlem başarısız");
        }

    }











   //click2
    public void findElementClick(String path, Pather type) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, TimeOut.MIDDLE.value);
            switch (type) {
                case className:
                    wait.until(ExpectedConditions.elementToBeClickable(By.className(path))).click();
                    break;
                case id:
                    wait.until(ExpectedConditions.elementToBeClickable(By.id(path))).click();
                    break;
                case name:
                    wait.until(ExpectedConditions.elementToBeClickable(By.name(path))).click();
                    break;
                case xPath:
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path))).click();
                    break;
                case cssSelector:
                    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(path))).click();
                    break;
                case linkText:
                    wait.until(ExpectedConditions.elementToBeClickable(By.linkText(path))).click();
                    break;
                default:
                    new NotFoundException();
            }

        } catch (Exception ex) {


        }
    }

    public void xpath(String path, Pather type){




    }


    public WebElement findElement(String path, Pather type,TimeOut timeOut) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut.value);
            WebElement element = null;
            switch (type) {
                case className:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className(path)));
                    break;
                case id:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(path)));
                    break;
                case name:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(path)));
                    break;
                case xPath:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
                    break;
                case cssSelector:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));
                    break;
                case linkText:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(path)));
                    break;
                default:
                    new NotFoundException();
            }
            return element;
        }
        catch (Exception ex)
        {
            return null;
        }
    }



    public WebElement findElement(String path, Pather type, String description) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, TimeOut.MIDDLE.value);
            WebElement element = null;
            switch (type) {
                case className:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className(path)));
                    break;
                case id:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(path)));
                    break;
                case name:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(path)));
                    break;
                case xPath:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
                    break;
                case cssSelector:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));
                    break;
                case linkText:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(path)));
                    break;
                default:
                    new NotFoundException();
            }
            return element;
        } catch (Exception ex) {
            System.out.println("find element method error" + ex.getMessage());
            return null;
        }
    }


    public void PageScrolldown()

    {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,900)", "");

    }
    public void PageScrollup()

    {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-300)", "");
    }

    protected void waitForElementAndClick(ElementInfo elementInfo)
    {
        waitForElement(elementInfo).click();
    }


    public WebElement waitForElement(ElementInfo info) {


        return wait.until(ExpectedConditions.presenceOfElementLocated(info.getBy()));
    }




    public void waitForElementAndSendKeys(ElementInfo elementInfo, String text) {
        waitForElement(elementInfo).sendKeys(text);
    }


    public void DriverQuit()

    {
        driver.quit(); }


}



