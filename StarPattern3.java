import java.util.Scanner;
class StarPattern3{
		//prints inverted right angle triangle
		public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();

			//outer for loop for number of rows 
			for(int i=1;i<=n;i++){
				//inner for loop number of stars user wants to print in a row
				for(int j=n;j>=i;j--){
					System.out.print("*");
				}
				//move to next line as inner for loop condition gets false
				System.out.println();
			}
		}
	
}