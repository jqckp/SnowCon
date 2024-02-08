package shredding.club.snowcon.model;

public class BeechMountain 
{
    private static Runnable beechMountainWebscrape = () -> 
    {
        System.out.println("Getting data from Beech Mountain site...");
    };

    public static Thread webscrape()
    {
        return new Thread(beechMountainWebscrape);
    }
    
}
