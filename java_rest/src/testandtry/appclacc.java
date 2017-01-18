package testandtry;
	
import java.awt.Color;

import com.sun.javafx.geom.Shape;

//import application.buttonfx;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;


public class appclacc extends Application{
	
	mainwindow primaryStage;
	
	

	public appclacc() {
		super();
		primaryStage = new mainwindow();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage prime) throws Exception {
		// TODO Auto-generated method stub
		try {
			buttonfx bb,ba;
			EventHandler<MouseEvent> mpress, mdrag, mrelease;
			
			//BorderPane root = new BorderPane();
			Pane p = new Pane();
			Scene scene = new Scene(p,400,400);
			mpress = new EventHandler<MouseEvent>(){

				@Override
				public void handle(MouseEvent arg0) {
					 //TODO Auto-generated method stub
					buttonfx b = (buttonfx)arg0.getSource();
					b.toFront();
					b.xx = arg0.getX();
					b.yy = arg0.getY();
				}
				
			};
			mdrag = new EventHandler<MouseEvent>(){

				@Override
				public void handle(MouseEvent arg0) {
					 //TODO Auto-generated method stub
					buttonfx b = (buttonfx)arg0.getSource();
											
					b.layoutXProperty().unbind();
					b.layoutYProperty().unbind();					
					b.setLayoutX(arg0.getSceneX()-b.xx);
					b.setLayoutY(arg0.getSceneY()-b.yy);

					
				}
				
			};
			mrelease = new EventHandler<MouseEvent>(){
				@Override
				public void handle(MouseEvent event) {
					 //TODO Auto-generated method stub
					buttonfx b = (buttonfx)event.getSource();
					b.crx = b.getLayoutX()/scene.getWidth();
					b.cry = b.getLayoutY()/scene.getHeight();
					b.layoutXProperty().bind(p.widthProperty().multiply(b.crx));
					b.layoutYProperty().bind(p.heightProperty().multiply(b.cry));
					
				}
				
			};
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			ba = new buttonfx();
			ba.layoutXProperty().bind(p.widthProperty().multiply(0.1));
			ba.layoutYProperty().bind(p.heightProperty().multiply(0.1));
			
			//ba.setStyle("-fx-font: 22 arial");
			ba.setText("thu\nnua");
			//ba.setShape(new Circle(10));
			/*ba.setMinWidth(70);
			ba.setMinHeight(70);
			Image i = new Image("file:1.jpg", 100, 100, true, true);
			ImageView imagev = new ImageView(i);
			imagev.seti
			imagev.setFitHeight(50);
			imagev.setFitWidth(50);
			ba.setGraphic(imagev);*/
			//ba.
			//imagev.fitWidthProperty().bind(ba.widthProperty());
			//imagev.fitHeightProperty().bind(ba.heightProperty());
			ba.setOpacity(0.5);
			bb= new buttonfx();
			bb.setText("thu thoi");
			bb.setStyle("-fx-font: 22 arial");
			bb.layoutXProperty().bind(p.widthProperty().multiply(0.2));
			bb.layoutYProperty().bind(p.heightProperty().multiply(0.2));
			ContextMenu contextMenu = new ContextMenu();
			contextMenu.setMinWidth(200);
			contextMenu.setMinHeight(200);
			contextMenu.setOpacity(0.8);
			contextMenu.setAutoHide(false);;
			MenuItem cut = new MenuItem("cut");
			//cut.setGraphic(bb);
			cut.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					//event.g
				}
				
			});
			MenuItem copy = new MenuItem("copy");
			//copy.setGraphic(bb);
			MenuItem paste = new MenuItem("Paste");
			//paste.setGraphic(bb);
			contextMenu.getItems().addAll(cut, copy, paste);
			ba.setContextMenu(contextMenu);
			//contextMenu.set
			ba.setOnMouseClicked((event)->{

				
					// TODO Auto-generated method stub
					Button b = (Button)event.getSource();
					b.getScene();
					contextMenu.setMinWidth(b.getWidth());
					contextMenu.setMinHeight(b.getHeight());
					ba.getContextMenu().show(b.getParent(),event.getScreenX(), event.getScreenY());

				
			});
			bb.setOnMouseClicked(new EventHandler<MouseEvent>(){

				@Override
				public void handle(MouseEvent arg0) {
					// TODO Auto-generated method stub
					System.out.println("hello hello");
				}
				
			});
			//ba.setOpacity(0.5);
			//String imagelink = Main.class.getResource("1.jpg").toExternalForm();
			//System.out.println(imagelink);
			//p.setStyle("-fx-base: #b6e7c9");
			p.getChildren().add(bb);
			p.getChildren().add(ba);
			primaryStage.setScene(scene);
			//primaryStage.setMaximized(true);
			//Rectangle2D b = Screen.
			primaryStage.show();
			ba.setStyle("-fx-font:12 arial; -fx-background-image: url('1.jpg');-fx-background-size: "+ba.getWidth()+" "+ba.getHeight());
			ba.widthProperty().addListener((v,o,n)->{
				ba.setStyle("-fx-font:12 arial; -fx-background-image: url('1.jpg');-fx-background-size: "+ba.getWidth()+" "+ba.getHeight());
				
			});
			ba.heightProperty().addListener((v,o,n)->{
				ba.setStyle("-fx-font:12 arial; -fx-background-image: url('1.jpg');-fx-background-size: "+ba.getWidth()+" "+ba.getHeight());
			});
			BackgroundSize bs = new BackgroundSize(100,100,true,true,true,true);
			Image i = new Image("file:1.jpg");
			BackgroundImage backgroundImage = new BackgroundImage( 
				i, 
				BackgroundRepeat.ROUND, BackgroundRepeat.ROUND, 
				BackgroundPosition.CENTER,bs);
			Label t = new Label("thu thoi ma");
			t.setOnMousePressed(mpress);
			t.setOnMouseDragged(mdrag);
			t.setOnMouseReleased(mrelease);
			t.layoutXProperty().bind(p.widthProperty().multiply(0.3));
			t.layoutYProperty().bind(p.heightProperty().multiply(0.3));
			t.setStyle("-fx-font:20 arial; -fx-background-image: url('1.jpg');-fx-background-size: "+t.getWidth() +" "+t.getHeight());
			t.widthProperty().addListener((v,o,n)->{
				t.setStyle("-fx-font:22 arial; -fx-background-image: url('1.jpg');-fx-background-size: "+t.getWidth()+" "+t.getHeight());
				
			});
			
			t.heightProperty().addListener((v,o,n)->{
				t.setStyle("-fx-font:22 arial; -fx-background-image: url('1.jpg');-fx-background-size: "+t.getWidth()+" "+t.getHeight());
			});
			t.setOpacity(0.8);
			t.prefWidthProperty().bind(p.widthProperty().multiply(0.2));
			t.prefHeightProperty().bind(p.heightProperty().multiply(0.2));
			
			p.getChildren().add(t);
			
			Background background = new Background(backgroundImage);
			ba.setBackground(background);
			//ba.setBackground(new Background(backgroundImage));
			ba.prefWidthProperty().bind(p.widthProperty().multiply(0.1));
			ba.prefHeightProperty().bind(p.heightProperty().multiply(0.1));
			
			//bb.setLayoutX(p.getWidth()*bb.crx);
			//bb.setLayoutY(p.getHeight()*bb.cry);
			bb.setOnMousePressed(mpress);
			bb.setOnMouseDragged(mdrag);
			bb.setOnMouseReleased(mrelease);
			
			//ba.setLayoutX(p.getWidth()*ba.crx);
			//ba.setLayoutY(p.getHeight()*ba.cry);
			ba.setOnMousePressed(mpress);
			ba.setOnMouseDragged(mdrag);
			ba.setOnMouseReleased(mrelease);
			
			primaryStage.setBa(ba);
			primaryStage.setBb(bb);
			//ba.getScene().getWindow();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(appclacc.class,args);
		
	}
	
}
