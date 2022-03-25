package program;

public class Pallindrome_No {

	public static void main(String[] args) {
		
		int num=122;
		int num1=num;
		int rev=1;
		
		boolean flag=true;
		
		while(flag)
		{
			int num2=num1;
		while(num2!=0) {
			
			int rem=num2%10;
			rev=rev*10+rem;
			num2=num2/10;
			
		}
		
		if(rev==num1) {
			System.out.println(rev +"num is pallindrome");
			
			flag=false;
			
		}else {
			num1=num1+1;
		}
		
		}

	}

}
