package shredding.club;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class Main extends Application
{
    public static void main( String[] args ) 
    {
        System.out.println( "Hello World!" );

        

        try {
            launch(args);
        } catch (Exception e) {
            
            e.printStackTrace();
        }

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
