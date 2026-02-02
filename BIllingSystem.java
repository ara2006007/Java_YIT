import java.util.Scanner;
class BillingSystem{
	public static void main (String args[]){
		
		Scanner scan = new Scanner (System.in);
		String name;
		int id;
		double total=0;
		double discount=0;
		double netprice=0;
		int pn =0;
		int n=0;
		
		System.out.println("***************************");		
		System.out.println("Welcome to Daily Food city");
		System.out.println("***************************");
		System.out.print("Please enter your name : ");
		name=scan.nextLine();
		System.out.print("Please enter your Id : ");
		id=scan.nextInt();	
		System.out.print("Please enter your  number of products : ");
		pn=scan.nextInt();	
		
		int []item_id=new int [pn];
		int [] quantity=new int [pn];
		String[] things={"Anchor","Biscuit","Soda","Tea","sugar","Vegetable"};
		double[] price=new double [pn];
		double[] sum=new double [pn];
	
		while (n<pn){
			System.out.println("Please input Product ID");
			item_id[n]=scan.nextInt();
			System.out.println("You have selected : "+things[item_id[n]]);
			System.out.println("Please input Product Price");
			price[n]=scan.nextDouble();
			System.out.println("Please input Quantity");
			quantity[n]=scan.nextInt();
			sum[n]=quantity[n]*price[n];
			n++;	
		}
		
		System.out.println("");System.out.println("");System.out.println("");
		System.out.println("******************************************************");
		System.out.println("Customer name : "+name);
		System.out.println("Customer ID : "+id);
		System.out.println("ID\tName\tU_price\tquan\tamount");	
		for(int y=0 ;y<pn;y++){
		System.out.println(item_id[y]+"\t"+ things[item_id[y]]+"\t"+ price[y]+"\t"+ quantity[y]+"\tRs "+ sum[y]);
		total+=sum[y];
		}
		
		if (total>=5000){
			discount=total*0.1;
			netprice=total-discount;
			System.out.println("");
			System.out.println("Congradulations you got the discount of 10%");
		}
		else {
			discount=total*0.0;
			netprice=total-discount;
		}
		
		System.out.println("******************************************************");
		System.out.println("Your Bill ");
		System.out.println("Your total Bill is Rs:"+total);
		System.out.println("Your total discount is :"+discount);
		System.out.println("Your Final Bill is Rs:"+netprice);
		System.out.println("******************************************************");
		System.out.println("");System.out.println("");System.out.println("");
		System.out.println("Softwere by");
		System.out.println("Unni kirishnan");
		
	}
	
	
	
}