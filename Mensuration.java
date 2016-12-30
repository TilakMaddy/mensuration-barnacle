package maths;

import java.util.Random;

public class Mensuration extends InputTake implements CommonMethods {
	
	private static final int CUBE = 1;
	private static final int CUBOID = 2;
	private static final int SPHERE = 6;
	
	
	private static final int ERROR_CODE = -1;
	private static final int CONFIRM_CODE = 12;
	private static final String DEVELOPER_ERROR = "If you see this , please report here.: http://github.com/tilakmaddy";		
		 
	public static void main(String[] args) {
		
		Mensuration main = new Mensuration();
		main.start();
		
	}

	
	public void start(){
		
		printBanner(new Random().nextInt(10));			
		log("" , 1); 							 // Printing an empty line		
		printOptions();
		log("" , 1); 
		takeInputWithPrompt("Enter the number of object based of the options above.\nExample : 1 -> for Cube", 8); // Figure Integer 
		
		switch(getFigureInt()){
		
		case CUBE:			
			caseCubeSelected();			
			break;
		
		case CUBOID:
			caseCuboidSelected();			
			break;
			
		case SPHERE:
			caseSphereSelected();			
			break;			
		
		default:
			caseDisabledFeaturesSelected();			
			break;
			
		}
		
		advertise();
		
	}
	
	
	private void caseSphereSelected() {
		
		log("", 1); 	
		log("You chose SPHERE:", 1); 	
		log("", 1); 	
		printSphereOptions();
		log("",1);
		log("Choose the option according to what data is given in Question ." , 1);
		log("Example: If radius is given in question , choose 1" ,2);
		log("" ,1);		
		takeInputWithPrompt("Enter option Number:", 1);
		
		switch((int)getFirstDouble()){
		
		case 1:
			log("",1);
			takeInputWithPrompt("Enter Radius of Sphere: ", 2);
			new SphereCalculator(getSecondDouble(), 1);
			break;
			
		case 2:
			log("",1);
			takeInputWithPrompt("Enter volume of the sphere: ", 3);
			new SphereCalculator(getThirdDouble(), getFigureInt(), 2);
			break;
			
		case 4:
			log("",1);
			takeInputWithPrompt("Enter the Diameter", 4);
			new SphereCalculator(getFourthDouble(), getFigureInt(), getFigureInt() , 3);
			break;
			
		case 3:
			caseDisabledFeaturesSelected();
			break;
		
		}
		
	}


	private void printSphereOptions() {
		
		log("1		- Radius" , 1);
		log("2		- Volume" , 1);
		log("3		- Total Surface Area" , 1);	
		log("4		- Diameter" ,1);
		
	}


	private void caseDisabledFeaturesSelected() {
		
		log("",1);		
		log("I sincerely hope you need to wait for PRO version to enable this feature." , 1);
		log("Only cube , cuboid and sphere will work. ",1);		
		
	}


	private void caseCuboidSelected() {
		
		log("", 1); 	
		log("You chose CUBOID:", 1); 	
		log("", 1); 	
		printCuboidOptions();
		log("Choose the option according to what data is given in Question ." , 1);
		log("Example: If length , breadth and heigth is given in question , choose 2" ,2);
		log("" ,1);		
		takeInputWithPrompt("Enter option Number:", 1);
		
		switch((int)getFirstDouble()){		
			
		case 1:
			log("",1);
			takeInputWithPrompt("Enter the length: ", 1);
			takeInputWithPrompt("Enter the breadth: ", 2);
			takeInputWithPrompt("Enter the height: ", 3);
			new CuboidCalculator(getFirstDouble(), getThirdDouble(), getSecondDouble(), 1);
			break;
		
		case 2:
			log("",1);
			takeInputWithPrompt("Enter the length: ", 1);
			takeInputWithPrompt("Enter the breadth: ", 2);
			takeInputWithPrompt("Enter the diagnol: ", 3);
			new CuboidCalculator(getFirstDouble(), getThirdDouble(), getSecondDouble(), getFigureInt(), 2);
			break;
			
		case 3:
			log("" ,1);
			takeInputWithPrompt("Enter the height: ", 1);
			takeInputWithPrompt("Enter the breadth: ", 2);
			takeInputWithPrompt("Enter the diagnol: ", 3);
			new CuboidCalculator(getFirstDouble(), getThirdDouble(), getSecondDouble(), getFigureInt(), getFigureInt(), 3);
			break;
			
		default:
			log("Error processing your request..." , 1);
			try { throw new Exception("Proper data not loaded ."); }catch(Exception e){ e.printStackTrace(); } 
			System.exit(ERROR_CODE);
			
		}
			
	}


	private void printCuboidOptions() {
		
		
		log("1		- Length , Breadth and Height of cuboid" , 1);
		log("2		- Length , Breadth and Diagnol of cuboid" , 1);
		log("3		- Height , Breadth and Diagnol of cuboid" , 1);

		
	}


	private void caseCubeSelected() {
		
		log("", 1); 	
		log("You chose CUBE:", 1); 	
		log("", 1); 	
		printCubeOptions();
		log("Choose the option according to what data is given in Question ." , 1);
		log("Example: If diagnol is given in question , choose 1" ,2);
		log("" ,1);
		takeInputWithPrompt("Enter option Number:", 1);
		
		switch((int)getFirstDouble()){
		
		case 1:
			log("", 1);
			takeInputWithPrompt("Enter diagnol given:", 2);
			new CubeCalculator(getSecondDouble());
			break;
			
		case 2:
			log("", 1);
			takeInputWithPrompt("Enter side given:", 3);
			new CubeCalculator(getThirdDouble() , CONFIRM_CODE);
			break;	
		
		case 3:
			log("" , 1);
			log("Don't be a fool .!! --> (one is enough.)" , 1);
			takeInputWithPrompt("Enter side given:", 4);
			takeInputWithPrompt("Enter diagnol given:", 5);
			new CubeCalculator(getFifthDouble(), getFourthDouble(), CONFIRM_CODE);
			break;
			
		default:
			log("Error processing your request..." , 1);
			try { throw new Exception("Proper data not loaded ."); }catch(Exception e){ e.printStackTrace(); } 
			System.exit(ERROR_CODE);
			
		}
		
	}


	private void printCubeOptions() {

		log("1		- Diagnol" , 1);
		log("2		- Length of the side" , 1);
		log("3		- Both given (Length and Diagnol)" , 1);
		
	}


	@Override
	public void log(String a , int code) {
		
		if(code == 1)
			System.out.println(a);
		
		else if(code == 2)
			System.out.print(a);
		
		else
			System.out.println(DEVELOPER_ERROR);
		
	}
	
	
	public void printBanner(int code){
		
		if ((code == 2) || (code == 3) ||  (code == 9)){
			
			log("|===============================================|" , 1);
			log("|                                               |" , 1);
			log("|          Solve as you like it Buddy !!        |" , 1);
			log("|                                               |" , 1);
			log("|                Developed by -Tilak Maddy ©    |" , 1);
			log("|===============================================|" , 1);
			log("You are using DEMO version. Please upgrade to PRO" , 1);			
			log("You can use some more awesome features." , 1);
						
			
		}else if( (code == 7) ||  (code == 5) || (code == 4)){
			
			log("|===============================================|" , 1);
			log("|                                               |" , 1);
			log("|         Make your life easy and cool !!       |" , 1);
			log("|                                               |" , 1);
			log("|                Developed by -Tilak Maddy ©    |" , 1);
			log("|===============================================|" , 1);	
			log("You are using DEMO version. Please upgrade to PRO" , 1);
			log("You can use some more awesome features." , 1);
			
		}else{
			
			log("|===============================================|" , 1);
			log("|                                               |" , 1);
			log("|          Do easy Math Homework                |" , 1);
			log("|                                               |" , 1);
			log("|                Developed by -Tilak Maddy ©    |" , 1);
			log("|===============================================|" , 1);
			log("You are using DEMO version. Please upgrade to PRO" , 1);
			log("by visiting http://github.com/tilakmaddy " , 2);
			log("You can use some more awesome features." , 1);
			
		}
		
		
	}
	
	public void printOptions(){
		
		log("1		- Cube" , 1);
		log("2		- Cuboid" , 1);
		log("3		- Cone" , 1);
		log("4		- Bucket" , 1); 
		log("5		- Pyramid" , 1);
		log("6		- Sphere" , 1);
		
	}
	
	private void advertise(){
		
		log("",1);
		log("----------------  ADVERTISEMENT ------------------------------" ,1);
		log("",1);	// empty line
		log("Pro version will be available in anpther 5 months ",1);
		log("Visit the following site for more information. : http://github.com/tilakmaddy" , 1);
		
	}
	
}
