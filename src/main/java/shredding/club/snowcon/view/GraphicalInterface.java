package shredding.club.snowcon.view;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
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

        String path = "./Dashboard.fxml";

        Parent root = FXMLLoader.load(getClass().getResource(path));

        Font.loadFont(getClass().getResourceAsStream("fonts/Snowy Season.ttf"), 12);
        
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);

        primaryStage.setResizable(false);

        primaryStage.setTitle("Snowcon");

        primaryStage.show();

        

    }
}
