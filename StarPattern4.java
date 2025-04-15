import java.util.Scanner;
class StarPattern4{
		//prints pyramid star pattern
		public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();

			//outer for loop for number of rows user wants to print
			for(int i=1;i<=n;i++){
				//inner for loop to print spaces and centering stars
				for(int j=i;j<n;j++){
					System.out.print(" ");
				}
				//this for loop will print stars in each row
				for(int j=1;j<=(2*i-1);j++){
					System.out.print("*");
				}
				//move to next line when both inner for loop condition gets false 
				System.out.println();
			}
		}
}