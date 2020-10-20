import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author David Wandratsch, 3BHIT
 * @date 16.10.2020
 * @version 1.0
 */

public class Main extends Application
{
    public static void main(String[] args)
    {
        Application.launch();
    }

    @Override
    public void start(Stage stage)
    {
        VBox box_main = new VBox();

        Scene scene = new Scene(box_main);
        stage.setTitle("Temp. Converter");
        stage.setScene(scene);
        stage.show();
    }
}