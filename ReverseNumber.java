import java.util.Scanner;
class ReverseNumber{
	//Program to print reverse of a number
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		//for ex: user inputs 12345 as a input
		int n = s.nextInt();
		
		//to make rev variable accessible outside the while loop to print he resulting value
		int rev=0;
		
		//now in this loop exectes till the value of n is not equal to 0
		//means this loop makes sure that user inputs non-zero value
		while(n!=0){
			//now this % operator always returns remainder so,any number with modulus operator returns 
			//last digit of the input value i.e. 5 in first iteration then 4 then 3 and so on for input 12345
			
			int digit = n%10;

			//now here to print number in reversing pattern that digit variable gets added with multiplied value of 10
			//i.e. 0*10+digit according to the precedence first multiplication is done then addition
			
			rev = rev*10+digit;
			
			//and here the / returns quotient means 1234 because 5 becomes remainder here so remainng answer will be 1234
			//and again this 1234 iterates and above process repeates next time value will be 123 and so on
			
			n=n/10;
		}
		// prints resulting value i.e. reverse value
		System.out.println("Reverse number = " +rev);
	}
}
