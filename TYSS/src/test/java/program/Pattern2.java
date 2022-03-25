package program;

public class Pattern2 {
	
	
	public static void main(String []args){
        
        int row =5;
        int count =row;
        
        for (int i=1;i<=row;i++){
            
            
           for (int j=1;j<=count;j++){
               
               System.out.print("* ");
               
           
           } 
           
           System.out.println ();
           
           if (i<(row/2)+1){
           count =count-2;
           }
           else {
               count = count+2;
           }
            
        }
        

     
}

}
