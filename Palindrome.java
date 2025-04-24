import java.util.Scanner;
class Palindrome{

		public static void main(String args[]){

			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
		
			int original=n;
			int reverse=0;
				
			while(n!=0){
				int digit=n%10;
				reverse=reverse*10+digit;
				n/=10;
			}
			if(original==reverse){
				System.out.println("Palindrome number");
			}
			else{
				System.out.println("Not a Palindrome number");
			}
		}
}