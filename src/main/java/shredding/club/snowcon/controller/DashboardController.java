package shredding.club.snowcon.controller;

import shredding.club.snowcon.model.AppSkiMountain;
import shredding.club.snowcon.model.City;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import shredding.club.snowcon.model.Key;
import shredding.club.snowcon.model.Unit;
import shredding.club.snowcon.model.Weather;



public class DashboardController implements Initializable, Runnable
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


    private Utility util = new Utility();

    private HashMap<City, Weather> data;


    



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        
        if (!initialized)
        {
            System.out.println("this has been initialized once");
            initialized = true;
        }
        
        //data = Weather.callWeatherAPI(Key.API_KEY, Unit.AMERICAN);

        for (City city : City.values())
        {
            //displayWeatherConditions(city, data);
        }

        //AppSkiMountain appSki = new AppSkiMountain();

        //appSki.collectData();

        
        
    }
    

    @FXML
    private void seeAppSkiConditions(ActionEvent event)
    {
        util.switchScene(event, APP_SKI_MTN_VIEW);
    }

    @FXML
    private void seeBeechConditions(ActionEvent event)
    {
        util.switchScene(event, BEECH_MTN_VIEW);
    }

    @FXML
    private void seeSugarConditions(ActionEvent event)
    {
        util.switchScene(event, SUGAR_MTN_VIEW);
    }

    private void displayWeatherConditions(City city, HashMap<City, Weather> data)
    {
        switch (city)
        {
            case BLOWING_ROCK:
                displayBlowingRockWeather(data.get(City.BLOWING_ROCK));
            
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


    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }


    



    
}
