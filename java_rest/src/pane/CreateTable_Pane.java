package pane;

import java.util.ArrayList;

import Node.Super_Node;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class CreateTable_Pane extends BorderPane{
	private ObservableList<Super_Node> lcontrol;
	private TextField tfield;
	private Pane cpane;
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
		lcontrol = FXCollections.observableArrayList(new ArrayList<Super_Node>());
		cpane = new Pane();
		cpane.getChildren().addAll(lcontrol);
		//create top panel
		HBox tpane = new HBox();
		Button nbutton = new Button("New Table");
		tfield = new TextField("Unknown Table");
		tpane.getChildren().addAll(nbutton, tfield);
		this.setTop(tpane);
		this.setCenter(cpane);
		
	}
}
