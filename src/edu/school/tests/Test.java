package edu.school.tests;

import java.awt.Color;

import edu.school.models.SVGLine;
import edu.school.models.SVGPicture;
import edu.school.models.SVGCircle;
import edu.school.models.SvgRectangle;
import edu.school.models.SvgEllipse;
import edu.school.models.SvgPolygon;
public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SVGPicture pic = new SVGPicture();
		pic.add(new SVGLine(10, 10, 180, 250, Color.red, 5));
		pic.add(new SVGCircle(250,400, 20, Color.blue, 5, Color.yellow));
		pic.add(new SvgRectangle(150, 300, 70, 50,Color.green, Color.black, 10));
		pic.add(new SvgEllipse(150, 150, 30, 40, Color.green, 5, Color.black));
		pic.add(new SvgPolygon(Color.black,5, Color.orange,200, 100,150,212,220,124,100,140));//numbers must be even
		
		//pic.add(new SvgRectangle());
		pic.saveToFile("C:\\Users\\elbur\\Documents\\test.svg");
		//System.out.println(pic);
	}


}
