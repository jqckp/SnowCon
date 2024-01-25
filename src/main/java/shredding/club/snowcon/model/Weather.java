package shredding.club.snowcon.model;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather 
{
    //Base URL to access API
    public static final String BASE_URL = "http://api.weatherbit.io/v2.0/current";

    
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
    private double wind_spd;

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
    private double snow;

    //Cloud coverage (%).
    private double clouds;

    //Text weather description.
    private String description;

    //Weather icon code.
    private String icon;

    //Weather object of json response containing image 
    //code and textual description of weather
    private Weather weather;

    private static ObjectMapper objmapper;

    private static HttpClient client;

    private static HttpResponse<String> response;

    private static HttpRequest request;

    private static HashMap<City, Weather> weatherData;


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
        double wind_spd,
        String wind_cdir_full,
        double temp,
        double app_temp,
        double vis,
        double precip,
        double snow,
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

    public static HashMap<City, Weather> callWeatherAPI(String key, Unit unit)
    {
        System.out.println("Api has been called");
        client = HttpClient.newHttpClient();

        weatherData = new HashMap<>();

        objmapper = new ObjectMapper();
        
        for (City city : City.values())
        {
            try 
            {
                request = HttpRequest.newBuilder()
                .uri(generateURI(key, unit, city))
                .GET()
                .build();
    
                response = client.send(request, BodyHandlers.ofString());
    
                weatherData.put(city, 
                    objmapper.readValue(response.body(), Weather.class));

            } catch (URISyntaxException | IOException | InterruptedException ex) 
            {
                System.out.println("API call failed");
            }
        }

        return weatherData;
    }

    private static URI generateURI(String key, Unit unit, City city) throws URISyntaxException
    {
        return new URI(String.format("%s?key=%s&units=%c&city=%s", 
            BASE_URL, key, unit.symbol, city.toString()));
    }

    public static HashMap<City, Weather> getWeatherData()
    {
        return weatherData;
    }

    @JsonProperty
    public String getSunrise() 
    {
        return data.getFirst().sunrise;
    }

    @JsonProperty
    public String getSunset() 
    {
        return data.getFirst().sunset;
    }

    @JsonProperty
    public String getOb_time() 
    {
        return data.getFirst().ob_time;
    }

    @JsonProperty
    public String getCity_name() 
    {
        return data.getFirst().city_name;
    }

    @JsonProperty
    public String getState_code() 
    {
        return data.getFirst().state_code;
    }

    @JsonProperty
    public double getWind_spd() 
    {
        return data.getFirst().wind_spd;
    }

    @JsonProperty
    public String getWind_cdir_full() 
    {
        return data.getFirst().wind_cdir_full;
    }

    @JsonProperty
    public double getTemp() 
    {
        return data.getFirst().temp;
    }

    @JsonProperty
    public double getApp_temp() 
    {
        return data.getFirst().app_temp;
    }

    @JsonProperty
    public double getVis() 
    {
        return data.getFirst().vis;
    }

    @JsonProperty
    public double getPrecip() 
    {
        return data.getFirst().precip;
    }

    @JsonProperty
    public double getSnow() 
    {
        return data.getFirst().snow;
    }

    @JsonProperty
    public double getClouds() 
    {
        return data.getFirst().clouds;
    }

    @JsonProperty
    public String getDescription() 
    {
        return data.getFirst().weather.description;
    }

    @JsonProperty
    public String getIcon()
    {
        return data.getFirst().weather.icon;
    }

    @JsonProperty
    public Weather getWeather()
    {
        return weather;
    }

    @JsonProperty
    public List<Weather> getData() 
    {
        return this.data;
    }

  
    
    
    
}
