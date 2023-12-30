package shredding.club.snowcon.model;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppSkiMountain 
{

    private WebDriver driver;
    
    private String url = "https://appskimtn.com/slope-report";

    public void collectData()
    {
        driver = new ChromeDriver();
        driver.get(url);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        WebElement button = driver.findElement(By.id("chat-widget-container"));

        button.click();

        WebElement appaltizer = driver.findElement(By.xpath("/html/body/main/article/div/ul[5]/li[1]"));

        System.out.println(appaltizer.getText());
       

        List<WebElement> slopes = driver.findElements(By.className("slope-report__status-title"));

        for(WebElement data : slopes)
        {
            System.out.println(data.getText());
        }


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        driver.close();
        driver.quit();
        
    }
}
