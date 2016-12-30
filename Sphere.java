package maths;

public abstract class Sphere {

	protected double radius;
	protected double diameter;
	
	//Setters
	
	protected void setRadius(double radius) {
		this.radius = radius;
	}
	
	protected void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	//Getters
	
	protected double getRadius() {return radius;}	
	
	protected double getDiameter() {return diameter;}
	
}
