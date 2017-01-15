package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import pane.CreateTable_Pane;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	
	
	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			CreateTable_Pane ctpane = new CreateTable_Pane();
			Scene scene = new Scene(ctpane,400,400);
			//scene.getStylesheets().add("application.css");
			//primaryStage.
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(Main.class,args);
	}
}
