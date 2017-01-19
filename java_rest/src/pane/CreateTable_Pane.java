package pane;

import java.io.File;
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
import javafx.stage.FileChooser;

public class CreateTable_Pane extends BorderPane{
	private ObservableList<buttonfx> lcontrol;
	private TextField tfield;
	private Pane cpane;
	private DoubleProperty size;
	private buttonfx cbbind;
	private String cpane_bgimage,cpane_bgcolor,string_style;
	private int bgradius;
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
		String bstring="-fx-text-fill: #FDF3E7;"+
				"-fx-font: "+ 12 + " arial"+";" +
			    "-fx-background-color: #7E8F7C;"+
			    "-fx-border-radius: 20;"+
			    "-fx-background-radius: 20;"+
			    "-fx-padding: 5;";
		cpane_bgimage = "";
		bgradius = 20;
		cbbind=null;
		size = new SimpleDoubleProperty(20.0);
		lcontrol = FXCollections.observableArrayList(new ArrayList<buttonfx>());
		cpane_bgcolor = "#FDF3E7";
		cpane = new Pane();
		cpane.heightProperty().addListener((v,o,n)->{
			this.build_style_string();
			cpane.setStyle(string_style);
		});
		cpane.widthProperty().addListener((v,o,n)->{
			this.build_style_string();
			cpane.setStyle(string_style);
		});
		//cpane.setStyle("-fx-background-color: "+cpane_bgcolor+" ; -fx-background-radius: 20;");
		cpane.getChildren().addAll(lcontrol);
		//create top panel
		HBox tpane = new HBox();
		tpane.setStyle("-fx-background-color: #C63D0F; -fx-background-radius: 5;");
		Button nbutton = new Button("New Table");
		nbutton.setStyle(bstring);
		Button dbutton = new Button ("Delete Last Table");
		dbutton.setStyle(bstring);
		Button fcbutton = new Button ("BgImage chooser");
		fcbutton.setStyle(bstring);
		tfield = new TextField("Unknown Table");
		tfield.setStyle("-fx-text-fill: #FDF3E7;"+
			    "-fx-background-color: #74AFAD;"+
			    "-fx-border-radius: 20;"+
			    "-fx-background-radius: 10;"+
			    "-fx-padding: 5;");
		Button sbutton = new Button("Save");
		sbutton.setStyle(bstring);
		nbutton.setOnMouseClicked((value)->{
			buttonfx b = new buttonfx(""+lcontrol.size());
			b.setOnMouseClicked((v)->{
				buttonfx bb = (buttonfx) v.getSource();
				if(cbbind!=null)
					cbbind.textProperty().unbind();
				tfield.setText(bb.getText());
				bb.textProperty().bind(tfield.textProperty());
				cbbind = bb;
				tfield.requestFocus();
				
			});
			lcontrol.add(b);
			actionsetup(b);
			cpane.getChildren().add(b);
			
		});
		dbutton.setOnMouseClicked((v)->{
			int last = lcontrol.size()-1;
			if(last>=0){
				buttonfx b = lcontrol.get(last);
				if(cbbind!=null && cbbind.equals(b)){
					cbbind=null;
					tfield.setText("Unknown Table");
				}
				b.textProperty().unbind();
				lcontrol.remove(last);
				cpane.getChildren().remove(b);
			}
		});
		fcbutton.setOnMouseClicked((v)->{
			ArrayList<String> lex = new ArrayList<String>();
			lex.add("*.bmp");lex.add("*.jpg");lex.add("*.gif");lex.add("*.tif");lex.add("*.png");
			lex.add("*.dib");lex.add("*.jpeg");lex.add("*.jpe");lex.add("*.jfif");lex.add("*.tiff");
			FileChooser fchooser = new FileChooser();
			fchooser.setTitle("Background Image");
			fchooser.getExtensionFilters().addAll(
					new FileChooser.ExtensionFilter("All Picture File",lex),
					new FileChooser.ExtensionFilter("Monochrome","*.bmp"),
					new FileChooser.ExtensionFilter("JPEG","*.jpg"),
					new FileChooser.ExtensionFilter("GIF","*.gif"),
					new FileChooser.ExtensionFilter("TIFF","*.tif"),
					new FileChooser.ExtensionFilter("PNG","*.png")
			);
			File file = fchooser.showOpenDialog(fcbutton.getScene().getWindow());
			if(file!=null){
				this.cpane_bgimage = file.toURI().toString();
				this.build_style_string();
				cpane.setStyle(this.string_style);
			}
			
		});
		tpane.getChildren().addAll(nbutton, tfield,dbutton,fcbutton,sbutton);
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
	private void build_style_string(){
		this.string_style="";
		if (this.cpane_bgimage.compareTo("")!=0)
			this.string_style +="-fx-background-image: url('" + this.cpane_bgimage + "');-fx-background-size: " + cpane.getWidth()+" "+cpane.getHeight()+";";
		this.string_style += "-fx-background-color: "+cpane_bgcolor+" ; -fx-background-radius: "+ this.bgradius+";";
		
	}
}
