package Node;

import javafx.scene.control.Control;

public class Super_Node extends Control {
	private double crx,cry,xx,yy;
	private String bgcolor, font, font_size;

	public Super_Node() {
		super();
		// TODO Auto-generated constructor stub
		crx=0;
		cry=0;
		xx=0;
		yy=0;
		bgcolor ="";
		font="";
		font_size="";
	}

	public double getCrx() {
		return crx;
	}

	public void setCrx(double crx) {
		this.crx = crx;
	}

	public double getCry() {
		return cry;
	}

	public void setCry(double cry) {
		this.cry = cry;
	}

	public double getXx() {
		return xx;
	}

	public void setXx(double xx) {
		this.xx = xx;
	}

	public double getYy() {
		return yy;
	}

	public void setYy(double yy) {
		this.yy = yy;
	}

	public String getBgcolor() {
		return bgcolor;
	}

	public void setBgcolor(String bgcolor) {
		this.bgcolor = bgcolor;
	}

	public String getFont() {
		return font;
	}

	public void setFont(String font) {
		this.font = font;
	}

	public String getFont_size() {
		return font_size;
	}

	public void setFont_size(String font_size) {
		this.font_size = font_size;
	}
	
	
}
