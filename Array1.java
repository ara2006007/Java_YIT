class Array1 {
	public static void main (String args []){
		int [] x;
		x=new int [5];
		x[0]=12;
		x[1]=13;
		x[2]=14;
		x[3]=15;
		x[4]=16;
				
		int n = 4 ;	
		while (n>=0) {
			System.out.println(x[n]);
			n-- ;
			
		}
		
		
		/*for (int y=4;(y>=0);y--){
			System.out.println(x[y]);
			
		}*//*
		int n = 4;
		do {
			System.out.println(x[n]);
			n-- ;
		}
		while (n>=0);*/
	}

	

}