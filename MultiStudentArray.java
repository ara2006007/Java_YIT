	import java.util.Scanner;
	class MultiStudentArray{
		public static void main (String args[]){
			
			Scanner scan = new Scanner(System.in);
			int ns;
			String [] student_names;
			int [][] student_marks;
			int [][] sum;
			double [][] average;
			System.out.print("How many Studets are there ? ");
			ns=scan.nextInt();
			
			student_names = new String[ns];
			student_marks = new int[ns][3];
			sum=new int  [ns][1];
			average=new double  [ns][1];
			String [] subject={"Maths","Chemistry","Physics"};
			// input system for names
			for (int n=0;n<ns;n++){
				System.out.println("Enter the name of student "+(n+1) +": ? ");
				student_names[n]=scan.next();
			}
			// input system for marks 
			for (int m=0;m<ns;m++){
				for (int k=0;k<3;k++){
					System.out.println("Enter the marks of "+student_names[m]+" for the subject "+subject[k]);
					student_marks[m][k]=scan.nextInt();
				}
			}
			
			// Sum 
			for (int l=0;l<ns;l++){
				for (int p=0;p<3;p++){
					sum[l][0]+=student_marks[l][p];
					
				}
					
				
			}
			for (int o=0;o<ns;o++){
				for (int e=0;e<3;e++){
					average[o][0]=(sum[o][0])/3;
					
				}
					
				
			}
			
			for (int j=0;j<ns;j++){
				
				System.out.println("Name :"+student_names[j]+" | Marks for "+subject[0]+" is "+student_marks[j][0]+" | Marks for "+subject[1]+" is "+student_marks[j][1]+" | Marks for "+subject[2]+" is "+student_marks[j][2]+" | Sum of marks is "+sum[j][0]+" | Average is "+average[j][0] ) ;
				
				
				}
		}
			
			
	}
			
				
			

		
		
		
