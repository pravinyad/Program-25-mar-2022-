package program;

public class Arr1 {

	public static void main(String[] args) {
		
		int [] x= {12,24,11,30};
		
		int l=x.length;
		int[] y=new int[l];
		
		for(int i=x.length-1;i>=0;i--)
		{
			for(int j=0;j<=x.length-1;j++)
			{
				if(j==i) {
					y[i]=x[j];
				}
			}
		}
		
		for(int k:y) {
			System.out.println(k);
		}

	}

}
