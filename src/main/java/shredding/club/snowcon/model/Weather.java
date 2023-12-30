package shredding.club.snowcon.model;

import java.util.HashMap;

public class Weather 
{
    private String baseURL = "http://api.weatherbit.io/v2.0/current";

    private HashMap<String, String> queryParameters;

    //Sunrise time UTC (HH:MM).
    private String sunrise;

    //Sunset time UTC (HH:MM).
    private String sunset;

    //Last observation time (YYYY-MM-DD HH:MM).
    private String ob_time;

    //City name.
    private String city_name;

    //State abbreviation/code.
    private String state_code;

    //Wind speed (Default m/s).
    private int wind_spd;

    //Verbal wind direction.
    private String wind_cdir_full;

    //Temperature (default Celsius).
    private double temp;

    //Apparent/"Feels Like" temperature (default Celsius).
    private double app_temp;

    //Visibility (default KM)
    private double vis;

    //Liquid equivalent precipitation rate (default mm/hr).
    private double precip;

    //Snowfall (default mm/hr).
    private int snow;

    //Cloud coverage (%).
    private double clouds;

    //Text weather description.
    private String description;


    
}
