import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Objects;




public abstract class BaseTest {
    private WebDriver driver;
    //protected final Logger logger = LoggerUtility.getLogger(getClass());




    @BeforeTest
    public void globalSetUp() {
        //logger.info("Starting test class: {}", getClass().getSimpleName());
        driver = buildDriver();
        driver.manage().window().maximize();
       // String baseUrl = ConfigReader.getProperty("baseUrl");
        //if (Objects.isNull(baseUrl) || baseUrl.isBlank()) {
           // throw new IllegalStateException("Base URL is not configured in config.properties");
        //}
        driver.get(baseUrl);
        //writeAllureEnvironment();
    }




    @AfterClass(alwaysRun = true)
    public void globalTearDown() {
        logger.info("Ending test class: {}", getClass().getSimpleName());
        attachScreenshot();
        if (driver != null) {
            driver.quit();
        }
    }




    private WebDriver buildDriver() {
        String browser = ConfigReader.getProperty("browser", "chrome").toLowerCase();
        boolean headless = Boolean.parseBoolean(ConfigReader.getProperty("headless", "false"));
        int timeout = Integer.parseInt(ConfigReader.getProperty("timeout", "20"));
        WebDriver webDriver;
        switch (browser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                if (headless) {
                    firefoxOptions.addArguments("-headless");
                }
                webDriver = new FirefoxDriver(firefoxOptions);
                break;
            case "chrome":
            default:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                if (headless) {
                    chromeOptions.addArguments("--headless=new");
                }
                chromeOptions.addArguments("--disable-gpu", "--window-size=1920,1080");
                webDriver = new ChromeDriver(chromeOptions);
                break;
        }
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
        return webDriver;
    }



    private void writeAllureEnvironment() {
        Path allureResults = Paths.get("target", "allure-results");
        try {
            Files.createDirectories(allureResults);
            try (OutputStream outputStream = Files.newOutputStream(allureResults.resolve("environment.properties"))) {
                StringBuilder builder = new StringBuilder();
                builder.append("Browser=").append(ConfigReader.getProperty("browser", "chrome")).append('\n');
                builder.append("Base URL=").append(ConfigReader.getProperty("baseUrl", "")).append('\n');
                builder.append("Headless=").append(ConfigReader.getProperty("headless", "false"));
                outputStream.write(builder.toString().getBytes());
            }
        } catch (IOException e) {
            logger.warn("Unable to write Allure environment file", e);
        }
    }



    protected WebDriver getDriver() {
        return driver;
    }
    @Step("Attaching screenshot to Allure report")
    @Attachment(value = "Final Screenshot", type = "image/png")
    public byte[] attachScreenshot() {
        if (driver instanceof TakesScreenshot takesScreenshot) {
            return takesScreenshot.getScreenshotAs(OutputType.BYTES);
        }
        return new byte[0];
    }
}