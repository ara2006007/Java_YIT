import java.util.Scanner;
class Atm{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		int []pinA = new int [4];
		pinA[0]=5677;
		pinA[1]=5656;
		pinA[2]=3455;
		pinA[3]=1234;
		String []name = new String [4];
		name[0]="Ara";
		name[1]="Smantha";
		name[2]="Rashmika";
		name[3]="Anushka";
		
		
		System.out.println("*********************");
		System.out.println("Welcome to Ara bank");
		System.out.println("*********************");
		System.out.println("Please enter your pin code to continue");
		int pin = scan.nextInt();
		System.out.println("Customer name "+name[pin]);
		/*System.out.println("press enter Contiue our banking services or press E to exit");
		String c1 = scan.next();
		String c2 = scan.next();*/
		System.out.println("Chose the service you want to contine");
		System.out.println("1.press 1 for account balace check");
		System.out.println("1.press 2 for withrawal");
		System.out.println("1.press 3 for withrawal");
		int setup=scan.nextInt();
		

		
		
		
		
		
		
		
	}
}