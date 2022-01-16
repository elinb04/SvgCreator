package edu.school.models;
import java.awt.Color;
public class SvgEllipse extends SVGObject {

    private  int r1;
    private  int r2;

    public SvgEllipse(int startX, int startY, int r1,int r2, Color strokeColor, int strokeWidth,Color fill){
            super(startX,startY,strokeColor,strokeWidth,fill);
            setr1(r1);
            setr2(r2);
    }

    public int getr2() {
        return r2;
    }

    public void setr2(int r2) {
        this.r2 = r2;
    }

    public int getr1() {
		return r1;
	}


	public void setr1(int r1) {
		this.r1 = r1;
	}

    public String toSvgCode() {
		String result = "<ellipse ";
		result += "cx=\""+getX()+"\" cy=\""+getY()+"\" ";
		result += "rx=\""+getr1()+"\" ry=\""+getr2()+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\" ";
        result += "fill=\""+toRGB(getFill())+"\"/>";
		return result;
	}
}
