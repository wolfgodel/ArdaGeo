package ArdaGeo;

public class Circle extends Shape{
	
	protected double r;
	int n=0;
	Point2D center;
	double yPos, yNeg;
	
	
	public Circle(double r, Point2D center) {
		super();
		this.r = r;
		this.center = center;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Point2D getCenter() {
		return center;
	}

	public void setCenter(Point2D center) {
		this.center = center;
	}
	


	public double y1(double x) {
		//r = ((x-x')2 + (y-y')2
		//r - ((x-x')2 = (y-y')2
		//sqrt(r - ((x-x')2)  + y' = y
		
		
		if(n==0) {
			n=1;
			return Math.sqrt(r - Math.pow(x-center.x, 2)) + center.y;
			
		}
		else
		{
			n=0;
			return -Math.sqrt(r - Math.pow(x-center.x, 2)) + center.y;
		}
		
	}
	
	public double y(double x) {
		//r = ((x-x')2 + (y-y')2
		//r - ((x-x')2 = (y-y')2
		//sqrt(r - ((x-x')2)  + y' = y
		
		
		yPos = Math.sqrt(r - Math.pow(x-center.x, 2)) + center.y;
		yNeg = -Math.sqrt(r - Math.pow(x-center.x, 2)) + center.y;
		return yPos;
			
		
		
	}

	public double getyPos() {
		return yPos;
	}

	public double getyNeg() {
		return yNeg;
	}
	
	
	
	
}
