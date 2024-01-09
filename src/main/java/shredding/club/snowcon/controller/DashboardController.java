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
        try 
        {
            root = FXMLLoader.load(getClass().getResource("../view/AppSkiMountain.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) 
        {
            System.out.println("Not found");
        }
    }

    @FXML
    private void seeBeechConditions(ActionEvent event)
    {
        try 
        {
            root = FXMLLoader.load(getClass().getResource("../view/BeechMountain.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) 
        {
            System.out.println("Not found");
        }

    }

    @FXML
    private void seeSugarConditions(ActionEvent event)
    {
        try 
        {
            root = FXMLLoader.load(getClass().getResource("../view/SugarMountain.fxml"));
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
