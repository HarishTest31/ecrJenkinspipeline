package com.rect;

public class rectangle {
private double length;
private double breadth;

public rectangle(double length, double breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getBreadth() {
	return breadth;
}
public void setBreadth(double breadth) {
	this.breadth = breadth;
}
public void calculateAreaOfRectangle() {
	double area=length*breadth;
	System.out.println(area);
}
public void calculatePerimeterOfRectangle() {
	double perimeter=2*(length+breadth);
	System.out.println(perimeter);
}

}
