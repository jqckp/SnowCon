package shredding.club.snowcon.model;


import java.net.SocketException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppSkiMountain implements Webscrape
{
    private static final String SLOPE_REPORT_URL = "https://appskimtn.com/slope-report";

    private WebDriver driver;
    
    private boolean appaltizer;

    private boolean averysAppal;

    private boolean candiedAppal;

    private boolean strudel;

    private boolean orchardRun;

    private boolean lowerBigAppal;

    private boolean upperBigAppal;

    private boolean hardCore;

    private boolean thinSlice;

    private boolean appaljack;

    private boolean appalTop;

    private boolean theHighline;

    private static Runnable startAppSkiWebscrape =  () ->
    {
        System.out.println("Getting data from App Ski Mountain Site");
        //AppSkiMountain appSki = new AppSkiMountain();
        //appSki.collectData();
    };

    

    public static Thread webscrape()
    {
        return new Thread(startAppSkiWebscrape);
    }


    @Override
    public void collectData()
    {
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");


        driver = new ChromeDriver(chromeOptions);
        

        driver.get(SLOPE_REPORT_URL);


        WebElement slopeDeets = driver.findElement(By.className("slope-report__status"));
        
        extractSlopeInformation(slopeDeets);
        

        
        
        
        driver.close();
        driver.quit();
        

        
        
    }

    private void extractSlopeInformation(WebElement slopeDeets)
    {
        List<WebElement> slopeNames = slopeDeets.findElements(By.className("slope-report__status-title"));
        List<WebElement> openOrClosed =  slopeDeets.findElements(By.className("slope-report__status-status"));

        HashMap<String, String> openSlopes = new HashMap<>();

        for (int i = 0; i < slopeNames.size(); i++)
        {
            openSlopes.put(slopeNames.get(i).getText(), openOrClosed.get(i).getText());
        }

    }

    

    
}
