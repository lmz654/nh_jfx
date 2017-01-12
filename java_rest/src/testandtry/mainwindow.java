package testandtry;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class mainwindow extends Stage{
	private buttonfx bb,ba;
	private EventHandler<MouseEvent> mpress, mdrag, mrelease;
	public mainwindow() {
		super();
		// TODO Auto-generated constructor stub
	}
	public mainwindow(StageStyle style) {
		super(style);
		// TODO Auto-generated constructor stub
	}
	public buttonfx getBb() {
		return bb;
	}
	public void setBb(buttonfx bb) {
		this.bb = bb;
	}
	public buttonfx getBa() {
		return ba;
	}
	public void setBa(buttonfx ba) {
		this.ba = ba;
	}
	public EventHandler<MouseEvent> getMpress() {
		return mpress;
	}
	public void setMpress(EventHandler<MouseEvent> mpress) {
		this.mpress = mpress;
	}
	public EventHandler<MouseEvent> getMdrag() {
		return mdrag;
	}
	public void setMdrag(EventHandler<MouseEvent> mdrag) {
		this.mdrag = mdrag;
	}
	public EventHandler<MouseEvent> getMrelease() {
		return mrelease;
	}
	public void setMrelease(EventHandler<MouseEvent> mrelease) {
		this.mrelease = mrelease;
	}
	
}
