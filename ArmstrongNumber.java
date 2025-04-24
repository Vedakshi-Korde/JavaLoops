import java.util.Scanner;
class ArmstrongNumber{

		public static void main(String args[]){

			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
		
			int temp=n;
			int original=temp;
			int result=0;
			int digits=0;

			while(temp!=0){
				digits++;
				temp/=10;
			}
			
			temp=n;
			while(temp!=0){
				int digit=temp%10;
				result+=Math.pow(digit,digits);
				temp/=10;
				
			}
			if(result==original){
				System.out.println("Armstrong number");
			}
			else{
				System.out.println("Not a Armstrong number");
			}

		}
}