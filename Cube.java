package maths;

public abstract class Cube {
	
	protected double length;
	protected double width;
	protected double height;
	protected double diagnol;	
	protected double side;
	
	//Getters 
	
	protected double getSide() { return side; }
	
	protected double getDiagnol() { return diagnol; }
	
	protected double getLength() {	return length;	}
		
	protected double getWidth() {return width;	}
	
	protected double getHeight() {	return height;}
	
	//Setters
	
	protected void setDiagnol(double diagnol){
		this.diagnol = diagnol;
	}
	
	protected void setLength(double length) {
		this.length = length;
	}
	
	protected void setWidth(double width) {
		this.width = width;
	}	
	
	protected void setHeight(double height) {
		this.height = height;
	}		
	
	protected void setSide(double side){
		this.side = side;
	}
			
}
