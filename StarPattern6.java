import java.util.Scanner;
class StarPattern7{
		public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();

			//outer loop to number of rows
			for(int i=1;i<=n;i++){
				//inner loop to print stars
				for(int j=1;j<=n;j++){
					//this condition to print * on boundray
					if(i==1||i==n||j==1||j==n)
					System.out.print("*");
					else
					System.out.print(" ");
				}

				//move to next line when condition gets false	
				System.out.println();
			}

	
			
		}
}	
