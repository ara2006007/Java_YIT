import java.util.Scanner;


class StuentMarkArray{
	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		String name;
		int [] x ;
		x=new int [3];
		int sum=0;
		System.out.print("Enter the Name of the student : ");
		name=scan.nextLine();
		for (int n=0;n<3;n++){
			System.out.print("Enter the Mark of subject "+(n+1) +": ");
			x[n]=scan.nextInt();
			
		}
		for (int m=0;m<3;m++){
			sum=sum+x[m];
			
			
		}
		double average=sum/x.length ;
		System.out.println("Name of the student : "+name);
		System.out.println("Total sum : "+sum);
		System.out.println("Total Average : "+average);
		
	}
	
	
	
	
	
	
}