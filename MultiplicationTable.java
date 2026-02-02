import java.util.Scanner;
class MultiplicationTable{
	public static void main (String args[]){
		Scanner scan =new Scanner (System.in); 	
		System.out.println("****************************");
		System.out.println("Welcome to Mathematical table");
		System.out.println("****************************");
		System.out.println("Which number table you want to know");
		int num = scan.nextInt();
		System.out.println("Untill which number you want to get the multiplication table");
		int num2 = scan.nextInt();
		for (int i=1;i<=num2;i++){
			System.out.println(num + " X "+i+" = "+(num*i));
		}
		/*System.out.println("");
		for (int i=1;i<=num2;i++){
			System.out.println(i + " times "+num+" is "+(num*i));
		}*/
	}
}