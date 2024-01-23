package shredding.club.snowcon.model;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppSkiMountain 
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


    public void collectData()
    {
        driver = new ChromeDriver();

        driver.get(SLOPE_REPORT_URL);
    }

    
}
