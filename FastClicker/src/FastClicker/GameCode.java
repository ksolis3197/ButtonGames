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
    
	private static final int _WIDTH = 250;
	private static final int _HEIGHT = 200;
	
	
    public void start(Stage primaryStage) throws Exception 
    {
    	primaryStage.setTitle("FastClicker");

        Button button = new Button("Click Me");
        button.setStyle (_WIDTH - 67,_HEIGHT-43,65,40,"OK", -fx-background-color:#ffffff , new Action()
        		//("-fx-font-size: 2em; -fx-padding: 50; -fx-background-color:#ffffff ")
        
        HBox hbox = new HBox(button);

        Scene scene = new Scene(hbox, 700, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
   }



	}
