import java.util.Scanner;
class StarPattern7{
	//pyramid star pattern
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		//outer for loop
		for(int i=1;i<=n;i++){
			for(int j=i;j<n;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//prints inverted pyramid star pattern
		for(int i=n;i>=1;i--){
			for(int j=i;j<n;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
