package shredding.club.snowcon.model;

public class SugarMountain 
{
    private static Runnable startSugarMountainWebscrape = () -> 
    {
        System.out.println("Getting data from Sugar Mountain site...");
    };

    public static Thread webscrape()
    {
        return new Thread(startSugarMountainWebscrape);
    }
}
