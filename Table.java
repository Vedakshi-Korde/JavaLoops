import java.util.Scanner;
class Table{
	//Prints the table for a number
	public static void main(String args[]){
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		//the loop executes till i=10	
		for(int i=1;i<=10;i++){
			//now n is the input which is taken from user and multipy that number with the i with increasing value
			//and stores the resulting value inside res variable
			int res = n*i;
			//prints the table in this printing fashion
			System.out.println(n+"x"+i+"="+res);
		}
		 
	}
}
