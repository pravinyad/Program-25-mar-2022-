package program;

public class Kth_smallest {
	
	public static void main(String[] args) {
		
		int [] arr = {7,10,4,3,20,15};
		
		 for(int i=0;i<arr.length;i++)
		 {
			 
			 for(int j=1;j<arr.length;j++)
			 {
				 if(arr[i]>arr[j])
				 {
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 System.out.println(arr[3]);
		
	}

}
