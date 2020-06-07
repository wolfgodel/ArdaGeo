package ArdaGeo;

public class Test {
	
	
	public static void main(String[] args) {
		Point1D p0 = new Point1D();
	
		
		Point1D p1 = new Point1D(5);
		Point1D p2 = new Point1D(-5);
		
		System.out.println("p1:" + p1.toString());
		System.out.println("p2:" + p2.toString());
		
		System.out.println(p1.distanceToOrigin());
		System.out.println(p1.distance(p2));
		
		Point2D p3= new Point2D(8, 25);
		Point2D p4= new Point2D(-9, 2);
		
		
		
		System.out.println("p3:" + p3.toString());
		System.out.println("p4:" + p4.toString());
		
		System.out.println(p3.toString());
		System.out.println(p3.distanceToOrigin());
		System.out.println(p3.distance(p2));
		System.out.println(p3.distance(p4));
		
		Point3D p5 = new Point3D(5,3,10);
		Point3D p6 = new Point3D(12,7,5);
		
		System.out.println(p5.toString());
		System.out.println(p6.toString());
		
		System.out.println(p5.distanceToOrigin());
		System.out.println(p5.distance(p6));
		System.out.println(p5.distance(p4));
		System.out.println(p5.distance(p1));
		
		
		System.out.println("\n***");
		
		Line2D l1= new Line2D(p3,p4);
		System.out.println(l1);
		System.out.println("\n***");
		
		Point2D p7= new Point2D(2,5);
		Point2D p8= new Point2D(1,3);
		
		Line2D l2= new Line2D(p7,p8);
		System.out.println(l2);
		
		System.out.println(l2.IsOnTheLine(p3));
		
		Point2D p9= new Point2D(1,5);
		Point2D p10 = new Point2D(3,13);
		
		Line2D l3= new Line2D(p9,p10);
		System.out.println(l3);
		System.out.println("..");
	
		Line2D l4= new Line2D(2,5);
		Line2D l5= new Line2D(3,16);
		
		System.out.println(l4.intersection(l5).toString());
		
	}

}
