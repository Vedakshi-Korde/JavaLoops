import java.util.Scanner;
class Sum{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0;//inialization
		
		//this loop iterates till it reaches to the nth number 
		for(int i=1;i<=n;i++){
			//this will simply add the numbers 
			//for ex: sum=0 and i=1 then sum+i is 0+1 is 1 and value gets stored inside sum
			sum = sum+i;
		}
		//Prints the sum which is stored in sum variable after the loop condition becomes false 
		System.out.println("Sume is " +sum);	
	}
}
