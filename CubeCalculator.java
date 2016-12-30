package maths;

import java.util.Scanner;

public class CubeCalculator extends Cube implements CommonMethods{
	
	private static final int ERROR_CODE = -1;
	
	private static int USER_CHOICE  = 0; 
	
	private static double LATERAL_SURFACE_AREA;
	private static double TOTAL_SURFACE_AREA;	
	private static double VOLUME;	
	
	private static final int SIDE = 12;			// --> For future use
	//private static double DIAGNOL ; 		--> For future use
	
	private static Scanner scanner = new Scanner(System.in);

	// When diagnol is provided
	public CubeCalculator(double diagnol){
		
		diagnolGiven(diagnol);		
		interactUser();
		
	}
	
	private void interactUser() {
		
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
			log("Error occured", 1);
			System.exit(ERROR_CODE);
			//break;
			
		}
		
	}

	public CubeCalculator(double side , int confirmSide){
		
		if(confirmSide == SIDE)
			sideGiven(side);					
		
		interactUser();
		
	}
	
	public CubeCalculator(double diagnol , double side , int confirmBoth){
		
		
		if(diagnol == (side * Math.sqrt(3))){
		
			bothGiven(side, diagnol);	
			interactUser();
			
		}else {
			
			log("Error processing your requets ..." , 1);
			
			try {
				
				throw new Exception("No proper data input");
				
				
			} catch (Exception e) {			
				
				e.printStackTrace();
				
			}
			
			System.exit(ERROR_CODE);
			
		}
			
	}
	

	private void bothGiven(double side, double diagnol) {		
		
		if(diagnol == (side * Math.sqrt(3))){
			
			setDiagnol(diagnol);
			setSide(side);	
			
		}
		
		LATERAL_SURFACE_AREA = 4 * (Math.pow(getSide(), 2));
		TOTAL_SURFACE_AREA   = 6 * (Math.pow(getSide(), 2));
		VOLUME = Math.pow(side, 3);	
		
	}



	private void sideGiven(double side) {		
		setSide(side);				
		
		LATERAL_SURFACE_AREA = 4 * (Math.pow(getSide(), 2));
		TOTAL_SURFACE_AREA   = 6 * (Math.pow(getSide(), 2));
		VOLUME = Math.pow(getSide(), 3);	
				
	}



	private void diagnolGiven(double diagnol) {		
		setDiagnol(diagnol);	
		setSide(diagnol / (Math.sqrt(3)));
		
		LATERAL_SURFACE_AREA = 4 * (Math.pow(getSide(), 2));
		TOTAL_SURFACE_AREA   = 6 * (Math.pow(getSide(), 2));
		VOLUME = Math.pow(side, 3);	
		
	}
	
	@Override
	public void log(String a, int code) {
		
		if(code == 1) 
			System.out.println(a);
		
		else if(code == 2)
			System.out.print(a);
				
	}
	
}
