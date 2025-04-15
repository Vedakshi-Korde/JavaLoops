import java.util.Scanner;
class StarPattern8{
		//prints 2 right angled triangle
		public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();

			//outer for loop for number of rows
			for(int i=1;i<=n;i++){
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
				//prints spaces between 2 triangles
				for(int j=i;j<n;j++){
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
				//move to next line
				System.out.println();
			}
		}
}
