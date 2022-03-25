package program;

public class Capital_1stword {
	
	public static void main(String[] args) {
		
		String s1="virat kohli";
		
		String[] s2=s1.split(" ");
		
		String s3="";
		
		for(String i:s2)
		{
			s3=i.substring(0,1).toUpperCase();
			System.out.print(s3+i.substring(1)+" ");
		}
	}

}
