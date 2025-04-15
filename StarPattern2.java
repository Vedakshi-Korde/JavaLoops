import java.util.Scanner;
class StarPattern2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		//outer loop to print number of rows
		for(int i=1;i<=n;i++){
			//inner loop to print number of stars in a row
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			//move to next line when inner for loop condition gets false
			System.out.println();
		}
	}
}
