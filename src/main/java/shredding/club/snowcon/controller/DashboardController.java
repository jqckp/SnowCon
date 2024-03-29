package shredding.club.snowcon.controller;

import shredding.club.snowcon.model.AppSkiMountain;
import shredding.club.snowcon.model.BeechMountain;
import shredding.club.snowcon.model.City;
import java.util.HashMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import shredding.club.snowcon.model.Key;
import shredding.club.snowcon.model.SugarMountain;
import shredding.club.snowcon.model.Unit;
import shredding.club.snowcon.model.Weather;



public class DashboardController
{

    private static final String APP_SKI_MTN_VIEW = "../view/AppSkiMountain.fxml";
    private static final String BEECH_MTN_VIEW = "../view/BeechMountain.fxml";
    private static final String SUGAR_MTN_VIEW = "../view/SugarMountain.fxml";

    private static boolean initialized;

    @FXML
    private ImageView appSkiWeatherIcon;

    @FXML
    private ImageView beechWeatherIcon;

    @FXML
    private ImageView sugarWeatherIcon;

    @FXML
    private Button viewAppSkiConditions;

    @FXML
    private Button viewBeechConditions;

    @FXML
    private Button viewSugarConditions;

    @FXML
    private Label appSkiTemperature;

    @FXML
    private Label appSkiWindSpeed;

    @FXML
    private Label appSkiVisibility;

    @FXML
    private Label appSkiSnow;

    @FXML
    private Label appSkiPrecipitation;

    @FXML
    private Label beechMountainTemperature;

    @FXML
    private Label beechMountainWindSpeed;

    @FXML
    private Label beechMountainVisibility;

    @FXML
    private Label beechMountainSnow;

    @FXML
    private Label beechMountainPrecipitation;

    @FXML
    private Label sugarMountainTemperature;

    @FXML
    private Label sugarMountainWindSpeed;

    @FXML
    private Label sugarMountainVisibility;

    @FXML
    private Label sugarMountainSnow;

    @FXML
    private Label sugarMountainPrecipitation;

    private static HashMap<City, Weather> weatherData;


    
    @FXML
    public void initialize() 
    {
        
        if (!initialized)
        {
            weatherData = Weather.callWeatherAPI(Key.API_KEY, Unit.AMERICAN);

            loadWebsiteData();

            initialized = true;
        }

        displayWeatherConditions(weatherData);
        
    }

    
    

    @FXML
    private void seeAppSkiConditions(ActionEvent event)
    {
        Utility.switchScene(event, APP_SKI_MTN_VIEW);
    }

    @FXML
    private void seeBeechConditions(ActionEvent event)
    {
        Utility.switchScene(event, BEECH_MTN_VIEW);
    }

    @FXML
    private void seeSugarConditions(ActionEvent event)
    {
        Utility.switchScene(event, SUGAR_MTN_VIEW);
    }


    private void loadWebsiteData()
    {
        
        AppSkiMountain.webscrape().start();
        BeechMountain.webscrape().start();
        SugarMountain.webscrape().start();
        
    }

    private void displayWeatherConditions(HashMap<City, Weather> data)
    {


        for (City city : City.values())
        {
            switch (city) {
                case BLOWING_ROCK:
                    displayBlowingRockWeather(data.get(City.BLOWING_ROCK));
                    break;
                
                case BEECH_MOUNTAIN:
                    displayBeechMountainWeather(data.get(City.BEECH_MOUNTAIN));
                    break;

                case SUGAR_MOUNTAIN:
                    displaySugarMountainWeather(data.get(City.SUGAR_MOUNTAIN));
                    break;

            }
        }
            
    }

    private void displayBlowingRockWeather(Weather weather)
    {
        
        
        appSkiTemperature.setText(String.valueOf(weather.getTemp()));
        appSkiWindSpeed.setText(String.valueOf(weather.getWind_spd()));
        appSkiVisibility.setText(String.valueOf(weather.getVis()));
        appSkiSnow.setText(String.format("%.2f",weather.getSnow()));
        appSkiPrecipitation.setText(String.format("%.2f", weather.getPrecip()));
        appSkiWeatherIcon.setImage(new Image(getClass().getResourceAsStream(
            String.format("../view/resources/weather_icons/%s.png", weather.getIcon()))));
    }

    private void displayBeechMountainWeather(Weather weather)
    {
        beechMountainTemperature.setText(String.valueOf(weather.getTemp()));
        beechMountainWindSpeed.setText(String.valueOf(weather.getWind_spd()));
        beechMountainVisibility.setText(String.valueOf(weather.getVis()));
        beechMountainSnow.setText(String.format("%.2f",weather.getSnow()));
        beechMountainPrecipitation.setText(String.format("%.2f", weather.getPrecip()));
        beechWeatherIcon.setImage(new Image(getClass().getResourceAsStream(
            String.format("../view/resources/weather_icons/%s.png", weather.getIcon()))));
        
    }

    private void displaySugarMountainWeather(Weather weather)
    {
        sugarMountainTemperature.setText(String.valueOf(weather.getTemp()));
        sugarMountainWindSpeed.setText(String.valueOf(weather.getWind_spd()));
        sugarMountainVisibility.setText(String.valueOf(weather.getVis()));
        sugarMountainSnow.setText(String.format("%.2f",weather.getSnow()));
        sugarMountainPrecipitation.setText(String.format("%.2f", weather.getPrecip()));
        sugarWeatherIcon.setImage(new Image(getClass().getResourceAsStream(
            String.format("../view/resources/weather_icons/%s.png", weather.getIcon()))));

    }


  


    



    
}
