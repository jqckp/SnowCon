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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;


public class DashboardController implements Initializable
{

    private static final String app_ski_view_path = "../view/AppSkiMountain.fxml";
    private static final String beech_view_path = "../view/BeechMountain.fxml";
    private static final String sugar_view_path = "../view/SugarMountain.fxml";

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



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        
    }

    @FXML
    private void seeAppSkiConditions(ActionEvent event)
    {
        switchScene(event, app_ski_view_path);
    }

    @FXML
    private void seeBeechConditions(ActionEvent event)
    {
        switchScene(event, beech_view_path);
    }

    @FXML
    private void seeSugarConditions(ActionEvent event)
    {
        switchScene(event, sugar_view_path);
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
