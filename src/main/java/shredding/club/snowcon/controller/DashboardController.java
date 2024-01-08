package shredding.club.snowcon.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class DashboardController implements Initializable
{
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



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        
    }

    @FXML
    private void seeAppSkiConditions()
    {
        System.out.println("App ski mountain is open!");
    }

    @FXML
    private void seeBeechConditions()
    {
        System.out.println("Beech mountain is open!");
    }

    @FXML
    private void seeSugarConditions()
    {
        System.out.println("Sugar mountain is open!");
    }



    
}
