import java.util.Scanner;
class Fact{
	//Program to print Factorial of a number
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		//for ex: user inputs 5 value
		int n = s.nextInt();

		//intial value of fact variable will be 1 because muliplication with 0 to any non zero value
		//will be 0 and the default value of int datatype is 0, so here intialization is must
		int fact=1;
		
		//the loop continues to execute till it reaches to the nth number 
		//for ex:5
		for(int i=1;i<=n;i++){
			//now fact=1 and i iterates till the n number 
			//this will executes something in this fashion 1*2*3*4*5 and now resulting value
			//gets stored inside fact variable
			fact=fact*i;
		}
		//this will print the final value of fact that is 120 if user inputs 5 as a input
		System.out.println("Factorial is " +fact);
	}
}
