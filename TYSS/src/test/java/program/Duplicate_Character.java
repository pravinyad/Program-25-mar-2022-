package program;

public class Duplicate_Character {
	
	public static void main(String[] args) {
		
		String s1="Missisipie";
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			 count=0;
			 
			 for(int j=0;j<s1.length();j++)
			 {
				 if(s1.charAt(i)==s1.charAt(j) && i>j)
				 {
					 break;
				 }
				 if(s1.charAt(i)==s1.charAt(j))
						 {
					 count++;
						 }
			 }
			 if(count>1) {
				 System.out.println(s1.charAt(i)+""+ count+ "times");
			 }
		}
		
	}

}
