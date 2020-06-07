package ArdaGeo;

public class Point3D extends Point2D {
	protected double z;

	public Point3D() {
		super();
		
	}

	public Point3D(double x, double y, double z) {
		super(x, y);
		this.z=z;
		
	}
	
	@Override
	public double distanceToOrigin() {
		
		return Math.sqrt(x*x + y*y+z*z);
	}

	
	public double distance(Point3D p) {
		
		return Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2)+Math.pow(this.z-p.z, 2));
	}

	@Override
	public String toString() {
		
		return "(" + x +","+ y + ","+ z + ")";
	}
	
	

	
	
	
	
	
	
}
