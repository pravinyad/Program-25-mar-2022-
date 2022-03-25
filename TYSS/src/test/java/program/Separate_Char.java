package program;

public class Separate_Char {

	public static void main(String[] args) {
		String s="AbC12@#";
		
		String s1="";
		String s2="";
		String s3="";
		
		for(int i=0;i<s.length();i++)
		{
			if( (s.charAt(i)>='A' && s.charAt(i)<='Z') ||(s.charAt(i)>='a' && s.charAt(i)<='z') )
			{
				s1=s1+s.charAt(i);
			}else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				
				s2=s2+s.charAt(i);
				
			}else {
				 s3=s3+s.charAt(i);
			}
			
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
