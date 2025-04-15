import java.util.Scanner;
class StarPattern9{
		//Sandglass star pattern
		public static void main(String args[]){
			Scanner s= new Scanner(System.in);
			int n = s.nextInt();

			//prints inverted pyramid
			for(int i=n;i>=1;i--){
				//prints spaces
				for(int j=i;j<n;j++){
					System.out.print(" ");
				}
				for(int j=1;j<=(2*i-1);j++){
					System.out.print("*");
				}
				//move to nextline
				System.out.println();
			}

			//prints pyramid star pattern
			for(int i=1;i<=n;i++){
				//prints spaces
				for(int j=i;j<n;j++){
					System.out.print(" ");
				}
				for(int j=1;j<=(2*i-1);j++){
					System.out.print("*");
				}
				//move to nextline
				System.out.println();
			}
		}
}
