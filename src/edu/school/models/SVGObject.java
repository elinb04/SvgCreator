package edu.school.models;

import java.awt.Color;

public abstract class SVGObject {
	private int x;
	private int y;
	private Color color;
	private int strokeWidth;
	private Color fill;
	
	public SVGObject(int x, int y, Color color, int strokeWidth, Color fill)
	{
		setX(x);
		setY(y);
		setColor(color);
		setStrokeWidth(strokeWidth);
		setFill(fill);
	}
	public SVGObject(Color strokeColor, Color fill, int strokeWidth)
	{
		setColor(strokeColor);
		setStrokeWidth(strokeWidth);
		setFill(fill);
	}
	
	public SVGObject(int x, int y)
	{
		this(y, 2, Color.YELLOW, x, Color.BLUE);
	}
	
	//public SVGObject()
	//{
	//	this(0,0);
	//}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	public Color getFill() 
    {
        return this.fill;
    }

    public void setFill(Color fill) 
    {
        this.fill = fill;
    }

	public int getStrokeWidth() {
		return strokeWidth;
	}

	public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}
	
	public abstract String toSvgCode();
	
	protected String toRGB(Color color)
	{
		if(color == null)
			return "";
		String result = "rgb(";
		result += color.getRed()+",";
		result += color.getGreen()+",";
		result += color.getBlue()+")";
		return result;
	}
}