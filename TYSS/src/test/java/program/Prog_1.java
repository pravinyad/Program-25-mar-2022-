package program;

public class Prog_1 {
	
	

		
		
		public static void main(String[] args) {
			String S="srivalliGs";
			String res="";
			for(int i=0;i<S.length();i++) {
				if(S.charAt(i)>='a'&& S.charAt(i)<='z') {
					res=res+S.charAt(i);
				}
				else if(S.charAt(i)>='A' && S.charAt(i)<='Z'){
					String s1=""+S.charAt(i);
					s1=s1.toLowerCase();
					res=res+"_"+s1.charAt(0);						
				}
			}
			System.out.println(res);			
							
		}	
		
		
		
	
	

}
