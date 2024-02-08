package shredding.club.snowcon.controller;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;

public class BeechMountainController 
{

    @FXML
    private Button backToWeather;

    

    @FXML
    public void initialize() 
    {
        
    }

    @FXML
    private void back(ActionEvent event)
    {
       

        Utility.switchScene(event, "../view/Dashboard.fxml");

    }
    
}
