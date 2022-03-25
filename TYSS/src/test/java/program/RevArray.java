package program;

public class RevArray {
	
	public static void main(String[] args) {
		
		int [] x= {12,24,11,30};
		
		
		int l=x.length;
		int[] y=new int[l];
		int count=0;
		
		for(int i=x.length-1;i>=0;i--)
		{
			y[count++]=x[i];
		}
		for(int k:y) {
			System.out.println(k);
		}
	}

}
