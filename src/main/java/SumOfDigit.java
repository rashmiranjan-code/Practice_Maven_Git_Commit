import java.util.Scanner;

public class SumOfDigit {
	static int sum=0;
	
	static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sumofdigit(num);
		

	}

	public static void sumofdigit(int num) {
		// TODO Auto-generated method stub
		while(num!=0) {
			int rem=num%10;
			num=num/10;
			 sum=sum+rem;
			
		}
		System.out.println(sum);
		
	}

}
