package ArdaGeo;
/**
 * 
 * Simple animation of a moving rectangle. User can move the rectangle by keyboard buttons
 * 
 * By pressing the keyboard buttons (up, down, left and right), user can move the rectangle
 * By pressing the "c" key, change the rectangle color to black
 * By pressing the "b" button, make the rectangle bigger
 * 
 * Berk Gokberk
 * 16.04.2020
 */

import java.awt.Color;
import java.awt.event.KeyEvent;
import stddraw.StdDraw;

public class Draw {
	// canvas parameters
	static int width;
	static int height;
	
	static int halfWidht;
	static int halfHeight;
	
	public static int formX(double x) {
		return (int) x + halfWidht; 
	}
	
	public static int formY(double y) {
		return (int) y + halfHeight; 
	}
	
	public static void drawShape(Shape shape) {
		double y;
		int xf, yf;
		for (double x = -halfWidht; x<halfWidht; x+=1) {
			
			y=shape.y(x);
			
			xf = formX(x);
			yf = formY(y);
			
			StdDraw.point(xf, yf);
			
		
			
		}
		
		
		if (shape instanceof Circle) {
			
			Circle c = ((Circle) shape);
			
			for (double x = -halfWidht; x<halfWidht; x+=1) {
				
				y=c.y(x);
				
				xf = formX(x);
				yf = formY(c.getyNeg());
				
				StdDraw.point(xf, yf);
				
				
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {

		// canvas parameters
		width = 1000;
		height = 500;
		
		halfWidht = width/2;
		halfHeight = height/2;

		// initialize the canvas
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);
		StdDraw.enableDoubleBuffering();

		
		
		// draw the rectangle
		StdDraw.setPenColor(StdDraw.BLACK);
		//StdDraw.filledRectangle(x, y, rectHalfSize, rectHalfSize);
		StdDraw.line(0, halfHeight, width, halfHeight);
		StdDraw.line(halfWidht,0, halfWidht, height);
		
	
		StdDraw.setPenColor(StdDraw.BLUE);
	
		Line2D l1 = new Line2D(1, 0);
		Circle c1 = new Circle(10, new Point2D(20,50));
		
		for (double alpha = 0; alpha < 2*Math.PI; alpha+=0.01) {
			StdDraw.setPenColor(Color.getHSBColor((float) Math.random(), (float)  Math.random(), (float)  Math.random()) );
		
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			drawShape(c1);
			//l1.setM(Math.tan(alpha));
			
			c1.setR(Math.exp(alpha)*10000);
			
			StdDraw.show();
		}
		
	
		
		StdDraw.show();
		//SAAT 
		
		
		
	}
}