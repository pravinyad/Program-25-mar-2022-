package program;

public class Smallest_Nearest_Pallindrome {
	
	
	
		
		
public static void main(String[] args) {
		
		int num=181;
		nextPallindrome(num);
	}
	
	public static void nextPallindrome(int n1)
	{
		int sum=0;
		int rem=0;
		int temp=0;
		
		while(true)
		{
			n1--;
			temp=n1;
			sum=0;
			rem=0;
			
			
			while(temp>0)
			{
				rem=temp%10;
				sum=sum*10 +rem;
				temp=temp/10;
			}
			
			if (sum==n1)
			{
				System.out.println("next pallindrome no is: "+n1);
				break;
			}
			
			
		}
		
	}
		
		
}


