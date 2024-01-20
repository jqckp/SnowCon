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
    
    private static boolean initialized;

   
    

    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {

        if(!initialized)
        {
            System.out.println("App Ski data has been initialized");
            initialized = true;
        }

        
    }

    @FXML
    private void back(ActionEvent event)
    {
        util = new Utility();
        util.switchScene(event, "../view/Dashboard.fxml");
    }


    
}
