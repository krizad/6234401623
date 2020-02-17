package line;

public class LineTester {

	public static void main(String[] args) {
		
		Line l1 = new Line(-2, 1, 1, -2);
		Line l2 = new Line(-6, -2, -2, 0);
		
		System.out.println("Are the two lines equals?: " + l1.equals(l2));
        System.out.println("Are the two lines parallel?: " + l1.isParallel(l2));
        System.out.println("Are the two lines intersect?: " + l1.isIntersect(l2));
        if (l1.isIntersect(l2)){
        System.out.println(String.format("Point of intersection: %.2f,%.2f", l1.getIntersectionPoint(l2).getX(),l1.getIntersectionPoint(l2).getY()));
        }
        
	}

}
