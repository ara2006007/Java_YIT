class Arraysum{
	public static void main (String args[]){
		;
		int sum=0;
		int [][] x={{1,2,3,4,5},{6,7,8,9,10}};
	

		for (int n=0;n<2;n++){
			for (int m=0;m<5;m++){
				sum=sum+x[n][m];
			System.out.print(x[n][m]);
			if (n!=2 && m!=4){
			System.out.print("+");
			}
			
			
		}
			
		}
		
		System.out.print("= "+sum);
		
		
		
	}
	
	
	
}