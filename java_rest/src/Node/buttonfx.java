package Node;

import javafx.scene.Node;
import javafx.scene.control.Button;

public class buttonfx extends Button{
	private double crx,cry,xx,yy;
	private String bgimage,bgradius;
	private String getincolor; //table have customer but not order yet
	private String orderedcolor; //table have customer and alreaday order
	private String availablecolor;// table available
	private String cfont, font_color;
	private double sratio,font_size;
	private String style_string,cbgcolor;
	public buttonfx() {
		super();
		// TODO Auto-generated constructor stub
		defaultsetup();
	}
	public buttonfx(String arg0, Node arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		defaultsetup();
	}
	public buttonfx(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		defaultsetup();
	}
	public void defaultsetup(){
		crx=cry=0.5;
		xx=yy=0;
		bgimage="";
		bgradius = ""+5;
		getincolor = "#005A31";
		orderedcolor = "#C63D0F";
		cbgcolor=availablecolor = "#4A96AD";
		cfont ="arial";
		font_size = 3;
		sratio = 0.15;
		font_color = "#FDF3E7";
		build_style_string();
		
	}
	public void build_style_string(){
		style_string = "";
		style_string+="-fx-text-fill: "+font_color+ " " + 
				";-fx-font: "+ this.getWidth()/font_size + " " + cfont +
			    ";-fx-background-color: "+ cbgcolor+			    
			    ";-fx-background-radius: "+ bgradius+
			    ";";
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
	public String getOrderedcolor() {
		return orderedcolor;
	}
	public void setOrderedcolor(String orderedcolor) {
		this.orderedcolor = orderedcolor;
	}
	public String getAvailablecolor() {
		return availablecolor;
	}
	public void setAvailablecolor(String availablecolor) {
		this.availablecolor = availablecolor;
	}
	public void setCfont(String cfont) {
		this.cfont = cfont;
	}
	public String getBgimage() {
		return bgimage;
	}
	public void setBgimage(String bgimage) {
		this.bgimage = bgimage;
	}
	public String getBgradius() {
		return bgradius;
	}
	public void setBgradius(String bgradius) {
		this.bgradius = bgradius;
	}
	public String getGetincolor() {
		return getincolor;
	}
	public void setGetincolor(String getincolor) {
		this.getincolor = getincolor;
	}
	
	public String getCfont() {
		return cfont;
	}
	public void setFont(String cfont) {
		this.cfont = cfont;
	}
	public double getFont_size() {
		return font_size;
	}
	public void setFont_size(double font_size) {
		this.font_size = font_size;
	}
	public double getSratio() {
		return sratio;
	}
	public void setSratio(double sratio) {
		this.sratio = sratio;
	}
	public String getFont_color() {
		return font_color;
	}
	public void setFont_color(String font_color) {
		this.font_color = font_color;
	}
	public String getStyle_string() {
		return style_string;
	}
	public void setStyle_string(String style_string) {
		this.style_string = style_string;
	}
	public String getCbgcolor() {
		return cbgcolor;
	}
	public void setCbgcolor(String cbgcolor) {
		this.cbgcolor = cbgcolor;
	}
	
	
	
	
}
