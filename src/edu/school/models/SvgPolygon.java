package edu.school.models;
import java.awt.Color;
public class SvgPolygon extends SVGObject {

    private int[] points;

    public SvgPolygon(Color strokeColor, int strokeWidth,Color fill,int... points){
        super(strokeColor,fill,strokeWidth);
        setPoints(points);
    }

    public int[] getPoints(){
        return points;
    }
    public void setPoints(int points[]){
        this.points=points;
    }
    public String toSvgCode() {
        String points2 = "";

        for(int i = 0; i < points.length; i ++)
        {
            points2 += points[i] + " ";
        }
		String result = "<polygon ";
		result += "points=\""+points2+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\" ";
        result += "fill=\""+toRGB(getFill())+"\" />";
		return result;
	}
}
