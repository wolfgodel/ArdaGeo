package ArdaGeo;

public class Line2D extends Shape{
	protected double m=0, c=0;
	
	public Line2D(double m, double c) {
		this.m=m;
		this.c=c;
	}
	
	@Override
	public double y(double x) {
		return m*x+c;
	}
	
	public Line2D(Point2D a, Point2D b) {
		this.m=(a.y-b.y)/(a.x-b.x);
		this.c=a.y-m*a.x;
	}
	
	public boolean IsOnTheLine(Point2D a) {
		if(a.y==this.m*a.x + this.c) {
			return true;
		}
		return false;
	}
	
	public Point2D intersection(Line2D a) {
		double md,x,y;
		
		
		md=this.m-a.m;
		double cd= (a.c-this.c);
		if(md==0 && cd!=0){
			System.out.println("Lines are parallel.");
			return null;
		}
		else if(md==0 && cd == 0) {
			System.out.println("Lines are the same.");
			return null;
		}
		
		x=cd/md;
		
		y=this.m*x+this.c;
		
		return new Point2D(x,y);
	}
	
	public String toString() {
		return "y=" + m + "x+"+ c;
	}

	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	
	
	
}
