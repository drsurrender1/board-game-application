package ca.utoronto.utm.othello.viewcontroller;
import ca.utoronto.utm.othello.model.*;
import ca.utoronto.utm.util.Observer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OthelloApplication extends Application {
	// REMEMBER: To run this in the lab put 
	// --module-path "/usr/share/openjfx/lib" --add-modules javafx.controls,javafx.fxml
	// in the run configuration under VM arguments.
	// You can import the JavaFX.prototype launch configuration and use it as well.
	
	@Override
	public void start(Stage stage) throws Exception {
		// Create and hook up the Model, View and the controller
		//OthelloView view1 = new OthelloView();
		
		// MODEL
		Othello othello=new Othello();
		// Create multidimensional array for buttons
		Button[][] button = new Button[othello.DIMENSION][othello.DIMENSION];
		
		// CONTROLLER
		// CONTROLLER->MODEL hookup
		
	
		// VIEW
		HumanvsHumanviewer humanview = new HumanvsHumanviewer();
		// VIEW->CONTROLLER hookup
		// MODEL->VIEW hookup
		othello.attach(humanview);
		
		GridPane grid = new GridPane();
		
		// Create buttons and set action
		for (int c=0; c<othello.DIMENSION; c++) {
			for (int r=0; r<othello.DIMENSION; r++) {
				button[r][c] = new Button();
				button[r][c].setMinSize(100, 100);
				grid.add(button[r][c], c, r);
				button[r][c].setOnAction(new ButtonEventHandler(r,c,othello));
			}
		}
		
		// SCENE
		Scene scene = new Scene(grid); 
		stage.setTitle("Othello");
		stage.setScene(scene);
				
		// LAUNCH THE GUI
		stage.show();
	}

	public static void main(String[] args) {
		OthelloApplication view = new OthelloApplication();
		launch(args);
	}
}
