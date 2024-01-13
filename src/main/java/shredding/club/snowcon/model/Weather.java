package shredding.club.snowcon.model;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

import com.google.gson.Gson;


public class Weather 
{
    //Base URL to access API
    public static final String BASE_URL = "http://api.weatherbit.io/v2.0/current";

    //Cities to get weather data on (where the ski resorts are)
    public static final String[] CITIES = {"Blowing Rock, NC",
                                           "Sugar Mountain, NC",
                                           "Beech Mountain, NC"
                                          };

    //Fahrenheit (F, mph, in)
    public static final char AMERICAN_UNITS = 'I';

    //[DEFAULT] Metric (Celsius, m/s, mm)
    public static final char METRIC_UNITS = 'M';

    //Scientific (Kelvin, m/s, mm)
    public static final char SCIENTIFIC_UNITS = 'S';
    
    //Root list of json response
    private List<Weather> data;

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

    //Weather icon code.
    private String icon;

    private Weather weather;

    public Weather[] weatherData;

    private Gson gson;

    private HttpClient client;

    private HttpResponse<String> response;


    public Weather()
    {
    
    }

    public Weather
    (
        String sunrise,
        String sunset,
        String ob_time,
        String city_name,
        String state_code,
        int wind_spd,
        String wind_cdir_full,
        double temp,
        double app_temp,
        double vis,
        double precip,
        int snow,
        double clouds,
        String description,
        String icon
    )
    {
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.ob_time = ob_time;
        this.city_name = city_name;
        this.wind_spd = wind_spd;
        this.wind_cdir_full = wind_cdir_full;
        this.temp = temp;
        this.app_temp = app_temp;
        this.vis = vis;
        this.precip = precip;
        this.snow = snow;
        this.clouds = clouds;
        this.description = description;
        this.icon = icon;

    }

    public void callWeatherAPI(String key, String city, char units)
    {
        client = HttpClient.newHttpClient();
        weatherData = new Weather[CITIES.length];
        gson = new Gson();

        for (int i = 0; i < weatherData.length; i++)
        {

            weatherData[i] = new Weather();

            try 
            {
                HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(String.format("%s", Weather.BASE_URL)))
                .GET()
                .build();
    
                response = client.send(request, BodyHandlers.ofString());
    
                weatherData[i] = gson.fromJson(response.body(), Weather.class);
    
            } catch (URISyntaxException | IOException | InterruptedException e) 
            {
    
                e.printStackTrace();
            }

        }
        

    }

    public String getSunrise() 
    {
        return data.getFirst().sunrise;
    }

    public String getSunset() 
    {
        return data.getFirst().sunset;
    }

    public String getOb_time() 
    {
        return data.getFirst().ob_time;
    }

    public String getCity_name() 
    {
        return data.getFirst().city_name;
    }

    public String getState_code() 
    {
        return data.getFirst().state_code;
    }

    public int getWind_spd() 
    {
        return data.getFirst().wind_spd;
    }

    public String getWind_cdir_full() 
    {
        return data.getFirst().wind_cdir_full;
    }

    public double getTemp() 
    {
        return data.getFirst().temp;
    }

    public double getApp_temp() 
    {
        return data.getFirst().app_temp;
    }

    public double getVis() 
    {
        return data.getFirst().vis;
    }

    public double getPrecip() 
    {
        return data.getFirst().precip;
    }

    public int getSnow() 
    {
        return data.getFirst().snow;
    }

    public double getClouds() 
    {
        return data.getFirst().clouds;
    }

    public String getDescription() 
    {
        return data.getFirst().weather.description;
    }

    public String getIcon()
    {
        return data.getFirst().weather.icon;
    }

  

    
    
}
