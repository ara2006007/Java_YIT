class MainPen{
	public static void main (String args[]){
		Pen obj = new Pen() ;
		obj.brand="Ten" ;
		obj.madein="Srilanka";
		obj.color="blue";
		obj.weight=4.6;
		obj.height=5.6;
		
		obj.Write();
		void type () {
			System.out.println(obj.brand);
			System.out.println(obj.madein);
			System.out.println(obj.color);
			System.out.println(obj.weight);
			System.out.println(obj.height);
			
		}

		
		
		
		
	}
	
	
	
	
}