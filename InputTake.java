package maths;

import java.util.Scanner;

public abstract class InputTake {
	
	private String firstString = "";
	private String secondString = "";
	
	private static final String WHITE_SPACE = " ";
	
	private double firstDouble = 0.0;
	private double secondDouble = 0.0;
	private double thirdDouble = 0.0;
	private double fourthDouble = 0.0;
	private double fifthDouble = 0.0;
	
	
	private int figureInt;
	
	private Scanner scanner  = new Scanner(System.in) ;
	
	protected void takeInputWithPrompt(String prompt , double z){
		
		System.out.print(prompt + WHITE_SPACE);
		
		if(z == 1)
			firstDouble = scanner.nextDouble();	
		
		else if(z == 2)
			secondDouble = scanner.nextDouble();
		
		else if(z == 3)
			thirdDouble = scanner.nextDouble();
		
		else if(z == 4)
			fourthDouble = scanner.nextDouble();
		
		else if(z == 5)
			fifthDouble = scanner.nextDouble();
		
		else if(z == 6)
			firstString = scanner.nextLine();
		
		else if(z == 7)	
			secondString = scanner.nextLine();	
		
		else if(z == 8)
			figureInt = scanner.nextInt();
				
				
	}
			
	// Getters and setters 
	
	protected int getFigureInt() {
		return figureInt;
	}

	protected void setFigureInt(int figureInt) {
		this.figureInt = figureInt;
	}

	protected String getFirstString() {
		return firstString;
	}
	protected void setFirstString(String firstString) {
		this.firstString = firstString;
	}
	protected String getSecondString() {
		return secondString;
	}
	protected void setSecondString(String secondString) {
		this.secondString = secondString;
	}
	protected double getFirstDouble() {
		return firstDouble;
	}
	protected void setFirstDouble(double firstDouble) {
		this.firstDouble = firstDouble;
	}
	protected double getSecondDouble() {
		return secondDouble;
	}
	protected void setSecondInteger(double secondDouble) {
		this.secondDouble = secondDouble;
	}
	protected double getThirdDouble() {
		return thirdDouble;
	}



	protected void setThirdDouble(double thirdDouble) {
		this.thirdDouble = thirdDouble;
	}



	protected double getFourthDouble() {
		return fourthDouble;
	}



	protected void setFourthDouble(double fourthDouble) {
		this.fourthDouble = fourthDouble;
	}



	protected double getFifthDouble() {
		return fifthDouble;
	}



	protected void setFifthDouble(double fifthDouble) {
		this.fifthDouble = fifthDouble;
	}

	protected void setSecondDouble(double secondDouble) {
		this.secondDouble = secondDouble;
	}
			

}
