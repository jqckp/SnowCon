package shredding.club.snowcon.model;

public enum Unit 
{
    
    METRIC('M'),
    AMERICAN('I'),
    SCIENTIFIC('S');

    final char symbol;


    private Unit(char symbol)
    {
        this.symbol = symbol;
    }
}
