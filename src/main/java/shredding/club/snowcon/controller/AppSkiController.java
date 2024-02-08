package shredding.club.snowcon.controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class AppSkiController implements Initializable
{

    @FXML
    private Button backToOverview;

    @FXML
    private Label appaltizerStatus;

    @FXML
    private Label averysAppalStatus;

    @FXML
    private Label candiedAppalStatus;

    @FXML
    private Label strudelStatus;

    @FXML
    private Label orchardRunStatus;

    @FXML
    private Label lowerBigAppalStatus;

    @FXML
    private Label upperBigAppalStatus;

    @FXML
    private Label hardCoreStatus;

    @FXML
    private Label thinSliceStatus;

    @FXML
    private Label appaljackStatus;

    @FXML
    private Label appalJamStatus;

    @FXML
    private Label appalTopStatus;

    @FXML
    private Label theHighlineStatus;





    
    
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
        Utility.switchScene(event, "../view/Dashboard.fxml");
    }


    
}
