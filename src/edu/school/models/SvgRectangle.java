package edu.school.models;
import java.awt.Color;

public class SvgRectangle extends SVGObject {

    private int height;
    private int width;

    public SvgRectangle(int startX, int startY, int width, int height,
			Color strokeColor, Color fill, int strokeWidth)
	{
		super(startX,startY,strokeColor,strokeWidth,fill);
		setheight(height);
        setWidth(width);
	}


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getheight() {
		return height;
	}


	public void setheight(int height) {
		this.height = height;
	}

    public String toSvgCode() {
		String result = "<rect ";
		result += "x=\""+getX()+"\" y=\""+getY()+"\" ";
		result += "width=\""+getWidth()+"\" height=\""+getheight()+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\" ";
        result += "fill=\""+toRGB(getFill())+"\" />";
		return result;
	}
}
