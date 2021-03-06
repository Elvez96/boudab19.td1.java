package fr.dauphine.javaavance.td1;
import java.lang.Math.*;
//Exo5

public class Circle {
	double r; // rayon
	Point p; // center 

	public Circle(Point p, double r) {
		this.r = r;
		this.p = p;
	}
	
	

	public String toString() {
		return "Le rayon est de: " + r + " cm, et le centre est " + p.toString() + ", area = " + area() + "\n";
	}


	public void translate(double a, double b) {
	
		double x = p.getX();
		double y = p.getY();
		
		Point j = new Point(x + a, y + b);
		this.p = j;
	}

	public Point getCenter() {
		return p;
	}

	public double area() {
		return Math.PI * (r * r);
	}

	public boolean contains(Point p1) {
		if ((p1.getX() - p.getX()) * (p1.getX() - p.getX()) + (p1.getY() - p.getY()) * (p1.getY() - p.getY()) <= r
				* r) {
			return true;
		} else {
			return false;
		}}}

