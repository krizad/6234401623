package line;

import java.awt.geom.Point2D;

public class Line {
	
	public final double m, x, y;
	
	// m for slope
	public Line(double x, double y, double m) {
		// y - y0 = m(x-x0)
        this.m = m;
        // y = y0 - m*x0
        this.y = y-m*x;
        // x = x0 - y0
        this.x = x-(y/m);
	}
	
	public Line(double x1, double y1, double x2, double y2) {
		// y - y1 = [(y2-y1)/(x2-x1)](x-x1)
        this.m = (y2-y1)/(x2-x1); 
        this.y = ((y2-y1)/(x2-x1))*(-x1) + y1;
        this.x = (-y1)/((y2-y1)/(x2-x1)) + x1;
	}
	
	// m for slope, b for intercept in y = mx+b
	public Line(double m, double b) {
		// y = mx+b
        this.m = m;
        this.y = b;
        this.x = -b/m;
	}
	
	// a for vertical line in x = a
	public Line(double a) {
		this.x = a;
        this.m = Double.NaN;
        this.y = Double.NaN;
	}
	
	public boolean isParallel(Line line) {
		if (this.m == line.m) {
			return (true);
		}
		else {
			return (false);
		}
	}
	
	public boolean equals(Line line ) {
		if (this.m == line.m && this.x == line.x && this.y == line.y) {
			return (true);
		}
		else {
			return (false);
		}
	}
	
	public boolean isIntersect(Line line) {
		if (!isParallel(line)) {
			return (true);
		}
		else {
			return (false);
		}
	}
	
	public Point2D.Double getIntersectionPoint(Line line) {
		double x,y;
		
		if (Double.isNaN(this.m)) {
			x = this.x;
			y = line.m * this.x + line.y;
		} 
		else if (Double.isNaN(line.m)) {
			x = line.x;
			y = this.m * line.x + this.y;
		}
		else {
			x = (line.y - this.y) / (this.m - line.m);
			y = this.m * x + this.y;
		}
		
		Point2D.Double plot = new Point2D.Double(x,y);
		return plot;
	}
}
