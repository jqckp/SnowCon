package shredding.club.snowcon.controller;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ResourceBundle;

import com.google.gson.Gson;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import shredding.club.snowcon.model.Key;
import shredding.club.snowcon.model.Weather;
import javafx.scene.Node;


public class DashboardController implements Initializable
{

    private static final String APP_SKI_MTN_VIEW = "../view/AppSkiMountain.fxml";
    private static final String BEECH_MTN_VIEW = "../view/BeechMountain.fxml";
    private static final String SUGAR_MTN_VIEW = "../view/SugarMountain.fxml";

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

    private Stage stage;

    private Scene scene;

    private Parent root;

    private Weather weatherInfo;



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        weatherInfo = new Weather();

        weatherInfo.callWeatherAPI(Key.API_KEY, Weather.AMERICAN_UNITS);

        

    }

    @FXML
    private void seeAppSkiConditions(ActionEvent event)
    {
        switchScene(event, APP_SKI_MTN_VIEW);
    }

    @FXML
    private void seeBeechConditions(ActionEvent event)
    {
        switchScene(event, BEECH_MTN_VIEW);
    }

    @FXML
    private void seeSugarConditions(ActionEvent event)
    {
        switchScene(event, SUGAR_MTN_VIEW);
    }

    private void switchScene(ActionEvent event, String path)
    {
        try 
        {
            root = FXMLLoader.load(getClass().getResource(path));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) 
        {
            System.out.println("Not found");
        }
        
    }



    
}
