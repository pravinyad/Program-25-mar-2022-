package program;

public class RemoveDuplicate_array {

	public static void main(String[] args) {
		
		int[] arr= {1,2,4,3,2};
		int[] arr1=new int[arr.length];
		int count=0;
		int k=0;
		
		for(int i=0;i<arr.length;i++)
		{
			 count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i>j ) {
					
					break;	
				}
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			if(count==1) {
				arr1[k++]=arr[i];
			}
		}
		
		for(int l:arr1) {
			System.out.println(l);
		}

	}

}
