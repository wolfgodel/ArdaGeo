package ArdaGeo;

public class Point1D {
	protected double x;
	
	public Point1D() {
		super();
		this.x = -1;
	}
	
	public Point1D(double x) {	
		System.out.println("Point 1D");
		this.x = x;
	}
	
	public double distanceToOrigin() {
		return Math.abs(x);
	}
	
	public double distance(Point1D p) {
		return Math.abs(this.x-p.x);
	}
	
	

	@Override
	public String toString() {
		return "(" + x + ")";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	
	
}
