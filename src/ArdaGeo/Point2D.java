package ArdaGeo;

public class Point2D extends Point1D {
	protected double y;

	public Point2D() {
		super(); // new Point1D()
		this.y=0;
	}

	public Point2D(double x, double y) {
		super(x); // new Point1D(x)
		System.out.println("Point2D");
		this.y=y;
		
	}

	
	
	@Override
	public double distanceToOrigin() {
		return Math.sqrt(x*x + y*y);
	}


	public double distance(Point2D p) {
		return Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2));
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	
	@Override
	public String toString() {
		
		return "(" + x +","+ y + ")";
	}
	
	
}
