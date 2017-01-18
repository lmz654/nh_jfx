package pane;

import java.util.ArrayList;

import Node.Super_Node;
import Node.buttonfx;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class CreateTable_Pane extends BorderPane{
	private ObservableList<buttonfx> lcontrol;
	private TextField tfield;
	private Pane cpane;
	private DoubleProperty size;
	public CreateTable_Pane() {
		super();
		// TODO Auto-generated constructor stub
		creatpane();
	}
	public CreateTable_Pane(Node arg0, Node arg1, Node arg2, Node arg3, Node arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		// TODO Auto-generated constructor stub
		creatpane();
	}
	public CreateTable_Pane(Node arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		creatpane();
	}
	
	private void creatpane(){
		size = new SimpleDoubleProperty(20.0);
		lcontrol = FXCollections.observableArrayList(new ArrayList<buttonfx>());
		cpane = new Pane();
		cpane.setStyle("-fx-background-color: #FDF3E7; -fx-background-radius: 20;");
		cpane.getChildren().addAll(lcontrol);
		//create top panel
		HBox tpane = new HBox();
		tpane.setStyle("-fx-background-color: #C63D0F; -fx-background-radius: 5;");
		buttonfx nbutton = new buttonfx("New Table");
		nbutton.setStyle("-fx-text-fill: #FDF3E7;"+
	    "-fx-background-color: #7E8F7C;"+
	    "-fx-border-radius: 20;"+
	    "-fx-background-radius: 20;"+
	    "-fx-padding: 5;");
		nbutton.setOnMouseClicked((value)->{
			buttonfx b = new buttonfx(""+lcontrol.size());
			lcontrol.add(b);
			actionsetup(b);
			cpane.getChildren().add(b);
			
		});
		tfield = new TextField("Unknown Table");
		tfield.setStyle("-fx-text-fill: #FDF3E7;"+
			    "-fx-background-color: #7E8F7C;"+
			    "-fx-border-radius: 20;"+
			    "-fx-background-radius: 20;"+
			    "-fx-padding: 5;");
		tpane.getChildren().addAll(nbutton, tfield);
		this.setTop(tpane);
		//create center panel
		this.setCenter(cpane);
		
	}
	
	private void actionsetup(buttonfx bfx){
		EventHandler<MouseEvent> mpress, mdrag, mrelease;
		//create mouse event
		String tstyle="";
		bfx.toFront();
		mpress = new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent arg0) {
				 //TODO Auto-generated method stub
				buttonfx b = (buttonfx)arg0.getSource();
				b.toFront();
				b.setXx(arg0.getX());
				b.setYy(arg0.getY());
			}			
		};
		mdrag = new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent arg0) {
				 //TODO Auto-generated method stub
				buttonfx b = (buttonfx)arg0.getSource();										
				b.layoutXProperty().unbind();
				b.layoutYProperty().unbind();					
				b.setLayoutX(arg0.getSceneX()-b.getXx());
				b.setLayoutY(arg0.getSceneY()-b.getYy() - cpane.getLayoutY());			
			}		
		};
		mrelease = new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				 //TODO Auto-generated method stub
				buttonfx b = (buttonfx)event.getSource();
				b.setCrx(b.getLayoutX()/cpane.getWidth());
				b.setCry(b.getLayoutY()/cpane.getHeight());
				b.layoutXProperty().bind(cpane.widthProperty().multiply(b.getCrx()));
				b.layoutYProperty().bind(cpane.heightProperty().multiply(b.getCry()));
				
			}			
		};
		bfx.setOnMousePressed(mpress);
		bfx.setOnMouseDragged(mdrag);
		bfx.setOnMouseReleased(mrelease);
		//bfx.setStyle("-fx-font: 22 arial");
		bfx.layoutXProperty().bind(cpane.widthProperty().multiply(bfx.getCrx()));
		bfx.layoutYProperty().bind(cpane.heightProperty().multiply(bfx.getCry()));
		bfx.widthProperty().addListener((v,o,n)->{
			bfx.build_style_string();
			bfx.setStyle(bfx.getStyle_string());
			
		});
		bfx.heightProperty().addListener((v,o,n)->{
			bfx.build_style_string();
			bfx.setStyle(bfx.getStyle_string());
			//bfx.setStyle("-fx-font:"+bfx.getFont_size()+" "+ bfx.getFont()+";");
		});
		
		cpane.heightProperty().addListener((v,o,n)->{
			bfx.prefHeightProperty().unbind();
			bfx.prefWidthProperty().unbind();
			if (cpane.getHeight()>cpane.getWidth()){
				bfx.prefHeightProperty().bind(cpane.widthProperty().multiply(bfx.getSratio()));
				bfx.prefWidthProperty().bind(cpane.widthProperty().multiply(bfx.getSratio()));
			}
			else{
				bfx.prefHeightProperty().bind(cpane.heightProperty().multiply(bfx.getSratio()));
				bfx.prefWidthProperty().bind(cpane.heightProperty().multiply(bfx.getSratio()));
			}
		});
		cpane.widthProperty().addListener((v,o,n)->{
			bfx.prefHeightProperty().unbind();
			bfx.prefWidthProperty().unbind();
			if (cpane.getHeight()>cpane.getWidth()){
				bfx.prefHeightProperty().bind(cpane.widthProperty().multiply(bfx.getSratio()));
				bfx.prefWidthProperty().bind(cpane.widthProperty().multiply(bfx.getSratio()));
			}
			else{
				bfx.prefHeightProperty().bind(cpane.heightProperty().multiply(bfx.getSratio()));
				bfx.prefWidthProperty().bind(cpane.heightProperty().multiply(bfx.getSratio()));
			}	
		});
		if (cpane.getHeight()>cpane.getWidth()){
			bfx.prefHeightProperty().bind(cpane.widthProperty().multiply(bfx.getSratio()));
			bfx.prefWidthProperty().bind(cpane.widthProperty().multiply(bfx.getSratio()));
		}
		else{
			bfx.prefHeightProperty().bind(cpane.heightProperty().multiply(bfx.getSratio()));
			bfx.prefWidthProperty().bind(cpane.heightProperty().multiply(bfx.getSratio()));
		}	
		
	}
}
