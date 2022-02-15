package array;

public class CountEachNumber {

	public static void countNo(int[] arr) {
		int count;
		int[] newArr = new int[10];
		int l=0;
		int[] newCountArr= {};
		boolean[] visited= new boolean[10];
		boolean status= false;
		for(int i=0; i< arr.length; i++) {
			count=0;
			status=false;
			for(int j=0; j<arr.length; j++) {
				if(visited[j]==true && arr[i]== arr[j]) {
					status=true;
					break;
				}
				if(arr[i]== arr[j]) {
					count++;
				}
			}
			 visited[i]= true;
			if (status== false)
			 System.out.println(arr[i]+" repeated "+ count +" times");
			}
			
			
			
				
				
		
		//for(int i=0;i<newArr.length; i++)
		//System.out.println(newArr[i]+" repeated "+ newCountArr[i]+" times");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countNo(new int[]{2,1,2,5,6,7,2,1});
	}

}
