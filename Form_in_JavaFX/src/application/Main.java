package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;

//import java.awt.Label;
import javafx.scene.control.Label;

//import java.awt.Color;
import javafx.scene.paint.Color;
//import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
//import javafx.stage.Stage;
import javafx.scene.Node;
//import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//Erstellung von Button(Controls)
			//Erstellung von Button(Controls)
			GridPane Root = new GridPane();
			Root.setAlignment(Pos.CENTER);
			Root.setHgap(10);// Horizontal Abstand zwischen Linien
			Root.setVgap(10);// Verrtical Abstand zwischen Spalten
			Root.setPadding(new Insets(25, 25, 25, 25));
			//Erstellung von Scene
			Scene sc = new Scene(Root, 400, 400);
			Text scenetitle = new Text("Welcome");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			Root.add(scenetitle, 0, 0, 2, 1);
			
			Label userName = new Label("User Name:");
			Root.add(userName, 0, 1);
			
			TextField userTextField = new TextField();
			Root.add(userTextField, 1, 1);

			Label pw = new Label("Password:");
			Root.add(pw, 0, 2);
			
			PasswordField pwBox = new PasswordField();
			Root.add(pwBox, 1, 2);
			
			Button bt1 = new Button("Sign in");
			HBox hbt1 = new HBox(10);
			hbt1.setAlignment(Pos.BOTTOM_RIGHT);
			hbt1.getChildren().add(bt1);
			Root.add(hbt1, 1, 4);
			
			Text druck = new Text();
			Root.add(druck, 1, 5);
			
			bt1.setOnAction(new EventHandler<ActionEvent>()
					{
			@Override
			public void handle(ActionEvent event) {
				druck.setFill(Color.FIREBRICK);
		        druck.setText("Sign in button pressed");
			}
			
					});
			
			// Set background color using CSS
			Root.setStyle("-fx-background-color: lightblue;");  // You can change 'lightblue' to any CSS color value.
			//Erstellung von Stage
			primaryStage.setScene(sc);
		    primaryStage.setTitle("WILLKOMMEN");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
