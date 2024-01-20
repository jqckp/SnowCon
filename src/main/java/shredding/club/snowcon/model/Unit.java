package shredding.club.snowcon.model;

public enum Unit 
{
    
    METRIC('M', 'C', "m/s", "mm", "km"),
    AMERICAN('I', 'F', "mph", "in", "mi"),
    SCIENTIFIC('S', 'K', "m/s", "mm", "km");

    public final char symbol;
    public final char temperatureUnit;
    public final String speedUnit;
    public final String precipitationUnit;
    public final String distanceUnit;

    
    private Unit
    (
        char symbol,
        char temperatureUnit,
        String speedUnit,
        String precipitationUnit,
        String distanceUnit
    )
    {
        this.symbol = symbol;
        this.temperatureUnit = temperatureUnit;
        this.speedUnit = speedUnit;
        this.precipitationUnit = precipitationUnit;
        this.distanceUnit = distanceUnit;
    }

    



}
