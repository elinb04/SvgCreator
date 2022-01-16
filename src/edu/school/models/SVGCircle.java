package edu.school.models;
import java.awt.Color;

public class SVGCircle extends SVGObject {

    private  int r;

    public SVGCircle(int startX, int startY, int r, Color strokeColor, int StrokeWidth,Color fill){
            super(startX,startY,strokeColor,StrokeWidth,fill);
            setr(r);
    }

    public int getr() {
		return r;
	}


	public void setr(int r) {
		this.r = r;
	}


    public String toSvgCode() {
		String result = "<circle ";
		result += "cx=\""+getX()+"\" cy=\""+getY()+"\" ";
		result += "r=\""+getr()+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\" ";
        result += "fill=\""+toRGB(getFill())+"\"/>";
		return result;
	}
}
