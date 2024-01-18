package shredding.club.snowcon.controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class AppSkiController implements Initializable
{

    @FXML
    private Button backToOverview;

    private Utility util;

   
    

    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        
    }

    @FXML
    private void back(ActionEvent event)
    {
        util = new Utility();
        util.switchScene(event, "../view/Dashboard.fxml");
    }


    
}
