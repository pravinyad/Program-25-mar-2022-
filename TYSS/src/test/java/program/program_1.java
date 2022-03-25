package program;

public class program_1 {

	public static void main(String[] args) {
		
		int space=4;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");				
			}
			space--;
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
		}
			System.out.println();
			

	}
	

  }
}
