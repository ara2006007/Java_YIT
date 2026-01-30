class Heighest{
	public static void main (String args[]){
		int [] marks={10,34,56,76,87,45,87,99,34,98};
		int max =  marks[0];
		for (int i=0;i<marks.length;i++){
			if (marks[i]>=max){
				max=marks[i];
			}
		}
		System.out.println(max);
	}


}