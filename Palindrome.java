import java.util.Scanner;
class Palindrome{
		//Progarm to check palindrome number
		public static void main(String args[]){

			Scanner s = new Scanner(System.in);
			//for ex: n=121
			int n = s.nextInt();

			//in this the value of n gets stored in original variable 
			//this is done to check the reverse and the enterd number later
			//here value of original=121
			int original=n;
			int reverse=0;

			//the logic is that the palindrome and the reversed digit should be same
			//so, first the entered number needs to be reversed
			//till the entered number is a non-zero digit the while loop executes
			while(n!=0){
				//% gives the remainder
				int digit=n%10;
				//the digit i.e. remainder gets added with the product 
				reverse=reverse*10+digit;
				//here the remaining digit i.e. quotient gets stored in n and loop continues
				n/=10;
			}
			//now here we check if original is exact equal to reverse or not
			if(original==reverse){
				System.out.println("Palindrome number");
			}
			else{
				System.out.println("Not a Palindrome number");
			}
		}
}
