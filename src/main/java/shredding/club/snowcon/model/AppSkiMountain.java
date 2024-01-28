package shredding.club.snowcon.model;


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


    @Override
    public void collectData()
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");


        driver = new ChromeDriver(chromeOptions);
        

        driver.get(SLOPE_REPORT_URL);

        driver.close();

        
    }

    
}
