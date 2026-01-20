class Array2D{
	public static void main (String args[]){
		int [][] x;
		x=new int[2][3];
		x[0][0]=1;
		x[0][1]=2;
		x[0][2]=3;
		x[1][0]=4;
		x[1][1]=5;
		x[1][2]=6;
		
		
		for (int y=0;y<=1;y++){
			for (int k=0;k<=2;k++){
			System.out.print (x[y][k]);
			}
			System.out.println ();
			
		}
		System.out.println ("...................................");
		
		int p,q;
		p=0;
				
		while (p<2){
			q=0;
			
			while (q<=2){
				System.out.print (x[p][q]);
				q++;
			}
			System.out.println ();
			p++;
		}
		
	}
	
}