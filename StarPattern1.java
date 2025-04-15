import java.util.Scanner;
class StarPattern1{
	public static void main(String args[]){
		//Input from user to ask how many stars the user wants to print
		Scanner s = new Scanner(System.in);
		System.out.println("How many stars you wnat : ");
		int n = s.nextInt();
		//outer for loop to print only those number of rows that user wants to print
		for(int i=1;i<=n;i++){
			//inner for loop to check and handle that how many number of stars will print in each row
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
			// to move to next line after the inner for loop conditon gets false
			System.out.println();	
		}
		
	
	}
}
