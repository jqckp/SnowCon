package shredding.club.snowcon;



import javafx.application.Application;
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
        AnchorPane root = new AnchorPane();

        Scene scene = new Scene(root, 300, 300);

        primaryStage.setScene(scene);

        primaryStage.setTitle("TESTING");

        primaryStage.show();

        

    }
}
