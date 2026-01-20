import java.util.Scanner;
class SimpleCalculator{
	public static void main (String args[]){
		int Try = 1; // variable used to loop calculator
		Scanner scan= new Scanner (System.in);
		while (Try==1){ //used loop to continue the calculatorsnumerous times
			System.out.println("Welcome to my Calculator");
			System.out.println(".........Press Enter key to continue............");
			String fun1=scan.nextLine();
			
			//Calucluator number inputs begins			
			String fun2=scan.nextLine();
			System.out.println("Give your first number");
			double num1=scan.nextDouble();
			System.out.println("Give your second number");
			double num2=scan.nextDouble();
			
			//number input to show how to do opperations
			System.out.println("Now I am going to show how to use my Calcuator app");
			System.out.println("Press 1 to Add");
			System.out.println("Press 2 to Subtract");
			System.out.println("Press 3 to Multiply");
			System.out.println("Press 4 to Divide");
			System.out.println(".........Press Enter key to continue............");
			System.out.println("What opperation do you want to do");
			int opp=scan.nextInt();
			
			//Logical opperation 
				switch (opp){
					case 1 :
						System.out.println("Your answer is "+(num1+num2));
					break ;
					case 2 :
						System.out.println("Your answer is "+(num1-num2));
					break ;
					case 3 :
						System.out.println("Your answer is "+(num1*num2));
					break ;
					case 4 :
						if (num2==0&&opp==4){ // this cause infinity
							System.out.println("Please Click try again");
						}
						else{
						System.out.println("Your answer is "+(num1/num2));
						}
					break ;
					default :
						System.out.println("Make Sure You know how to use calculators");//for any other input goes to try again
				
				}
				
			//This part controls the looping
			System.out.println("Press 1 to Try again & and 0 to stop");
			int num3=scan.nextInt();
			if (num3==1) {
				Try=1;
			}
			else {
				Try =0;
			}
		
	}
		
		
		
		
		
		
	}
	
	
	
}