package shredding.club.snowcon;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class GraphicalInterface extends Application
{
     
    public static void launchGUI(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("./Main.fxml"));
            
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);

        primaryStage.setResizable(false);

        primaryStage.setTitle("Snowcon");

        primaryStage.show();

        

    }
}
