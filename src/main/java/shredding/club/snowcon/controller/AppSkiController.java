package shredding.club.snowcon.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AppSkiController implements Initializable
{

    @FXML
    private Button backToOverview;

    private Stage stage;

    private Parent root;

    private Scene scene;
    

    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        
    }

    @FXML
    private void back(ActionEvent event)
    {
        try 
        {
            root = FXMLLoader.load(getClass().getResource("../view/Dashboard.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException e) 
        {
            
            e.printStackTrace();
        }
    }


    
}
