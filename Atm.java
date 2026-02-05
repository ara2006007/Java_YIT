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
		int con=1;
		int confirm;
		double avilable_balance=pinA[pin]-500;
		while (con >0){
			System.out.println("Choose the service you want to contine");
			System.out.println("1.press 1 for account balace check");
			System.out.println("2.press 2 for withrawal");
			int setup=scan.nextInt();
			switch(setup){
				case 1 :
					// Account balance
					System.out.println("Your full balance is Rs "+pinA[pin]);
					System.out.println("Your avilable balance is Rs "+avilable_balance);
					System.out.println("*********************");
					System.out.println("Do you want to continue\nPress 1 to for another process\npress 2 to extit");
					confirm = scan.nextInt();
					if (confirm==1){
						con=1;
					}
					else{
						con=0;
					}
					break;
				case 2 :
					// Account Withdrawal
					System.out.println("Please enter your the amount you want to withdraw ");
					double withdraw=scan.nextDouble();

					if (withdraw<=avilable_balance){
						System.out.println("Withdrawal Sucessfull");
						System.out.println("Do you want to print Recipt\nPlease consider about earth\nPress 1 for print\nPress 2 to continue");
						int recipt=scan.nextInt();
							if (recipt==1){
								System.out.println("Get your recipt");
							}
						System.out.println("Please collect your cash");	
						this.pinA[pin]-=withdraw;	
						}
					else{
							System.out.println("Your avilable balace is "+avilable_balance);
					}
					
					
					break;
					default :
						System.out.println("Please selcet a correct service");
					
					
					System.out.println("*********************");
					System.out.println("Do you want to continue\nPress 3 to for another process\npress 4 to extit");
					confirm = scan.nextInt();
					if (confirm==3){
						con=1;
					}
					else if (confirm==4){
						con=0;
					}					
					
			}
		

		}
		
		
		
		
		
		
	}
}