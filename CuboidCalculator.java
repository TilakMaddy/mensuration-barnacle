package maths;

import java.util.Scanner;

public class CuboidCalculator extends Cuboid implements CommonMethods{
	
	private static double LATERAL_SURFACE_AREA = 0;
	private static double TOTAL_SURFACE_AREA = 0;	
	private static double VOLUME = 0;
	
	private static final int ERROR_CODE = -1;
	
	private static int USER_CHOICE  = 0; 
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static final int CONFIRM_LENGTH_BREADTH_HEIGHT = 1;
	private static final int CONFIRM_LENGTH_BREADTH_DIAGNOL = 2;
	private static final int CONFIRM_HEIGHT_BREADTH_DIAGNOL = 3;
	
	public  CuboidCalculator(double length , double height , double breadth, int confirmLengthBreadthHeigth){
		
				
		if(confirmLengthBreadthHeigth == CONFIRM_LENGTH_BREADTH_HEIGHT){
			
			lengthBreadthHeightGiven(length , height , breadth);
			interactWithUser();
			
		}
		
	}		
	
	public  CuboidCalculator(double heigth , double diagnol , double breadth, int foo1 , int foo2 , int confirmHeigthBreadthDiagnol){
		
		
		if(confirmHeigthBreadthDiagnol == CONFIRM_HEIGHT_BREADTH_DIAGNOL){
			
			heigthBreadthDiagnol(heigth , breadth , diagnol);
			interactWithUser();
			
		}
		
	}		
	
	private void heigthBreadthDiagnol(double heigth, double breadth,double diagnol) {
		
		setDiagnol(diagnol);
		setHeight(heigth);
		setWidth(breadth);
		
		setLength(Math.sqrt((Math.pow(getDiagnol(), 2) -( Math.pow(getWidth(), 2)+ Math.pow(getHeight(), 2) ) ) ));				
		
		VOLUME = Double.parseDouble(String.valueOf(getHeight() * getLength() * getWidth())); 
		LATERAL_SURFACE_AREA = Double.parseDouble(String.valueOf(2 * ((getLength() + getWidth()) * getHeight())));
		TOTAL_SURFACE_AREA = Double.parseDouble(String.valueOf(2 * ((getLength() * getWidth()) + (getWidth() * getHeight()) + (getLength() * getHeight()))));
		
	}

	public  CuboidCalculator(double length , double diagnol , double breadth, int foo1 , int confirmLengthBreadthDiagnol){
		
		
		if(confirmLengthBreadthDiagnol == CONFIRM_LENGTH_BREADTH_DIAGNOL){
			
			lengthBreadthDiagnolGiven(length , diagnol , breadth);
			interactWithUser();
			
		}
		
	}		
	
	private void lengthBreadthDiagnolGiven(double length, double diagnol,double breadth) {
		
		setLength(length);
		setDiagnol(diagnol);
		setWidth(breadth);
		
		setHeight(Math.sqrt((Math.pow(diagnol, 2)  -  (Math.pow(breadth, 2) +  Math.pow(length, 2)))));
		
		VOLUME = Double.parseDouble(String.valueOf(getHeight() * getLength() * getWidth())); 
		LATERAL_SURFACE_AREA = Double.parseDouble(String.valueOf(2 * ((getLength() + getWidth()) * getHeight())));
		TOTAL_SURFACE_AREA = Double.parseDouble(String.valueOf(2 * ((getLength() * getWidth()) + (getWidth() * getHeight()) + (getLength() * getHeight()))));
		
	}

	private void lengthBreadthHeightGiven(double length, double height , double breadth) {
		
		setLength(length);
		setHeight(height);
		setWidth(breadth);
		
		VOLUME = Double.parseDouble(String.valueOf(getHeight() * getLength() * getWidth())); 
		LATERAL_SURFACE_AREA = Double.parseDouble(String.valueOf(2 * ((getLength() + getWidth()) * getHeight())));
		TOTAL_SURFACE_AREA = Double.parseDouble(String.valueOf(2 * ((getLength() * getWidth()) + (getWidth() * getHeight()) + (getLength() * getHeight()))));
						
	}

	
	private void interactWithUser() {
		
		log("" ,1);
		log("1	 - Lateral Surface Area		 " ,1);
		log("2	 - Total Surface Area 		 " ,1);
		log("3	 - Volume      		   		 " ,1);
		log("4	 - All	(TSA , LSA and Vol.) " ,1);
		log("Enter your Choice to calculate  " , 2);
		
		USER_CHOICE = scanner.nextInt();
		scanner.close();
		
		switch(USER_CHOICE){
		
		case 1:
			log("" ,1);
			log("Lateral Surface Area --> " + LATERAL_SURFACE_AREA , 1);
			break;
			
		case 2:
			log("" ,1);
			log("Total Surface Area --> " + TOTAL_SURFACE_AREA , 1);
			break;
		
		case 3:
			log("" ,1);
			log("Volume	 --> " + VOLUME , 1);
			break;
			
		case 4:
			log("" ,1);
			log("Lateral Surface Area  --> " + LATERAL_SURFACE_AREA , 1);
			log("Total Surface Area    --> " + TOTAL_SURFACE_AREA , 1);
			log("Volume		   --> " + VOLUME , 1);
			break;
			
		default:
			log("Error processing your request ... ", 1);
			System.exit(ERROR_CODE);
			//break;
			
		}
		
						
	}
	

	@Override
	public void log(String a, int code) {
		
		if(code == 1) 
			System.out.println(a);
		
		else if(code == 2)
			System.out.print(a);
				
	}
		
	
}
