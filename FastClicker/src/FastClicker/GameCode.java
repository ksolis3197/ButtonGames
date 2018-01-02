package FastClicker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GameCode extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("FastClicker");

        Button button = new Button("Click Me");
        button.setStyle("-fx-font-size: 2em; -fx-padding: 50; -fx-background-color:#ffffff ");
        
        HBox hbox = new HBox(button);

        Scene scene = new Scene(hbox, 700, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
