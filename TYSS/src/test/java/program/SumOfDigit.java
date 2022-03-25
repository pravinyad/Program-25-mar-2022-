package program;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int num=122;
		int num1=num;
		int temp=0;
		
		while(num1!=0)
		{
		   int rem=num1%10;
		   
		   temp=temp+rem;
		   
		   num1=num1/10;
			
		}
		
		System.out.println(temp);

	}

}
