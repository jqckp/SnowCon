package shredding.club.snowcon.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Utility 
{

    public static Parent root;
    public static Stage stage;
    public static Scene scene;

    
    public void switchScene(ActionEvent event, String scenePath)
    {
        try 
        {
            root = FXMLLoader.load(getClass().getResource(scenePath));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
