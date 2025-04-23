import java.util.Scanner;
class Table{

	public static void main(String args[]){
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
			
		for(int i=1;i<=10;i++){
			int res = n*i;
			System.out.println(n+"x"+i+"="+res);
		}
		 
	}
}