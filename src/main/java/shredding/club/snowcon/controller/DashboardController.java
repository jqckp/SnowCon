package shredding.club.snowcon.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

    private Stage stage;

    private Scene scene;

    private Parent root;

    private Weather[] weatherInfo;



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        

        //Weather.callWeatherAPI(Key.API_KEY, Weather.AMERICAN_UNITS);

        
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

    private static void displayAppSkiWeather()
    {

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
