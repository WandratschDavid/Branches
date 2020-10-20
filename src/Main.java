import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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

        Label gradCelsius = new Label("Grad Celsius");
        gradCelsius.setMinHeight(40);
        gradCelsius.setStyle("-fx-font-size:20");
        box_main.getChildren().addAll(gradCelsius);

        TextField textFieldGradCelsius = new TextField();
        box_main.getChildren().addAll(textFieldGradCelsius);

        Label gradFahrenheit = new Label("Grad Fahrenheit");
        gradFahrenheit.setMinHeight(40);
        gradFahrenheit.setStyle("-fx-font-size:20");
        box_main.getChildren().addAll(gradFahrenheit);

        TextField textFieldGradFahrenheit = new TextField();
        box_main.getChildren().addAll(textFieldGradFahrenheit);

        Button convertCtoF = new Button("Convert C -> F");
        Button convertFtoC = new Button("Convert F -> C");
        box_main.getChildren().addAll(convertCtoF, convertFtoC);

        Scene scene = new Scene(box_main);
        stage.setTitle("Temp. Converter");
        stage.setScene(scene);
        stage.show();
    }
}