package maths;

import java.util.Scanner;

public class SphereCalculator extends Sphere implements CommonMethods {

	private static final int ERROR_CODE = -1;
	
	private static final int CONFIRM_RADIUS = 1;
	private static final int CONFIRM_VOLUME = 2;
	private static final int CONFIRM_DIAMTER = 3;
	
	private static int USER_CHOICE  = 0; 
	private static double TOTAL_SURFACE_AREA ;	
	private static double VOLUME;	
	
	private static Scanner scanner = new Scanner(System.in);
	
	public SphereCalculator(double radius , int confirmRadius) {
		
		 if(confirmRadius == CONFIRM_RADIUS){
			 
			 radiusGiven(radius);
			 interactUser();
			 
		 }else{
			 
			try{
				
				throw new Exception("Confirm Code Error");
				
			}catch(Exception e){
				
				log("Error occured due to " + e.getCause() , 1);
				e.printStackTrace();
				
				System.exit(ERROR_CODE);
				
			}
			 
		 }
		
	}
	
	public SphereCalculator(double diamter , int foo1 , int foo2 , int confirmDiameter){
		
		if(confirmDiameter == CONFIRM_DIAMTER){
			
			diamterGiven(diamter);
			interactUser();
			
		}else{
			 
			try{
				
				throw new Exception("Confirm Code Error");
				
			}catch(Exception e){
				
				log("Error occured due to " + e.getCause() , 1);
				e.printStackTrace();
				
				System.exit(ERROR_CODE);
				
			}
			 
		 }
		
	}
	
	public SphereCalculator(double volume , int foo , int confirmVolume){
		
		if(confirmVolume == CONFIRM_VOLUME){
			
			volumeGiven(volume);
			interactUser();
			
		}else{
			 
			try{
				
				throw new Exception("Confirm Code Error");
				
			}catch(Exception e){
				
				log("Error occured due to " + e.getCause() , 1);
				e.printStackTrace();
				
				System.exit(ERROR_CODE);
				
			}
			 
		 }
		
	}
	
	private void diamterGiven(double diamter){
		
		setDiameter(diamter);
		setRadius(getDiameter() / 2.0);
		
		VOLUME = (4.0/3.0) * ( Math.PI * Math.pow(getRadius(), 3 ));
		TOTAL_SURFACE_AREA = 4.0 *( Math.PI * Math.pow(getRadius(), 2));
				
	}
	
	private void radiusGiven(double radius) {
		
		setRadius(radius);
		
		VOLUME = (4.0/3.0) * ( Math.PI * Math.pow(getRadius(), 3 ));
		TOTAL_SURFACE_AREA = 4.0 *( Math.PI * Math.pow(getRadius(), 2));
		
	}
	
	private void volumeGiven(double volume){
		
		final double cubeRoot = 1.0/3.0 ; 
		
		setRadius(Math.pow( ((3 * volume) / (4 * Math.PI)), cubeRoot ));
		
		VOLUME = (4.0/3.0) * ( Math.PI * Math.pow(getRadius(), 3 ));
		TOTAL_SURFACE_AREA = 4.0 *( Math.PI * Math.pow(getRadius(), 2));
		
	}

	@Override
	public void log(String a, int code) {
		
		if(code == 1) 
			System.out.println(a);
		
		else if(code == 2)
			System.out.print(a);
				
	}		
	
	
	private void interactUser(){
		
		log("" ,1);		
		log("1	 - Total Surface Area 		 " ,1);
		log("2	 - Volume      		   		 " ,1);
		log("3	 - All	(TSA and Vol.) " ,1);
		log("Enter your Choice to calculate  " , 2);
		
		USER_CHOICE = scanner.nextInt();
		scanner.close();
		
		switch(USER_CHOICE){
		
		case 1:
			log("" ,1);
			log("Total Surface Area --> " + TOTAL_SURFACE_AREA , 1);
			break;
			
		case 2:
			log("" ,1);
			log("Volume	 --> " + VOLUME , 1);
			break;
		
		case 3:
			log("" ,1);			
			log("Total Surface Area    --> " + TOTAL_SURFACE_AREA , 1);
			log("Volume		   --> " + VOLUME , 1);
			break;			
		
		default:
			log("Error occured", 1);
			try{
				
				throw new Exception("Improper option chosen");
				
			}catch(Exception e){
				
				e.printStackTrace();
				
			}
			System.exit(ERROR_CODE);
			//break;
			
		}
		
	}
	
}
