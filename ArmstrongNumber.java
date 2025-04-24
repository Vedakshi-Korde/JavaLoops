import java.util.Scanner;
class ArmstrongNumber{
		//Program for armstrong number
		public static void main(String args[]){

			Scanner s = new Scanner(System.in);
			int n = s.nextInt(); // for ex: user enters n=153
		
			int temp=n;
			//stores original number so that we can use it for later calculation
			int original=temp;
			int result=0;
			int digits=0;
			
			//loop to count the number of digit the number has
			while(temp!=0){
				//each time the value of digits gets incremented by 1
				digits++;
				//this will give the quotient 
				temp/=10;
			}
			
			temp=n;
			while(temp!=0){
				
				int digit=temp%10; //this will give the last digit i.e. remainder first iteration 3 then 5 and so on
				result+=Math.pow(digit,digits); //built in function Math.pow returns the power of the number
				temp/=10; //this will remove the last digit
				
			}
			//now this will check that the resulting value is equal to the original number or not
			if(result==original){
				System.out.println("Armstrong number");
			}
			else{
				System.out.println("Not a Armstrong number");
			}

		}
}
