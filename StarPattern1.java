import java.util.Scanner;
class StarPattern1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("How many stars you wnat : ");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();	
		}
		
	
	}
}