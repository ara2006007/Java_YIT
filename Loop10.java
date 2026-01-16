import java.util.ArrayList;

class Loop10 {
	public static void main(String args[]){
		ArrayList<String> num = new ArrayList<String>(); 
		int x=0 ;
		int y=1 ;
		
		while (x<=4) {
			
			while (y<=5){
				num.add(""+(y));
				y++;
			}
			System.out.println("123"+num.get(x));
			x++ ;
		}
			
			
			
			
		}
		
		
		
		
	}




