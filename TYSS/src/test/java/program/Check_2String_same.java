package program;

public class Check_2String_same {
	
	public static void main(String[] args) {
		
		String s1="virat";
		String s2="VIRAT";
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("two string are same");
		}else {
			System.out.println("two string different");
		}
	}

}
