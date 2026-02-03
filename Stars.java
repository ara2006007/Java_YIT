class Stars{
	public static void main (String args[]){
		for (int i=1; i<=5;i++){
			for (int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("************************");
		System.out.println("");
		for (int p=5; p>=0;p--){
			for (int q=0;q<=p;q++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("************************");
		System.out.println("");
		
		for (int p=5; p>=0;p--){
			for (int q=0;q<=p;q++){
				System.out.print(" ");
				
			}
			System.out.print("*");
			for (int j=1;j<=p;j++){
				System.out.print("*");
			}
			System.out.println(" ");
		
		}
		
	}
}