package algorithms;

public class QuickSortDemo {

	public static void quickSort(int[] arr,int start,int end){
		if(start<end) {
			int pIndexx =partition(arr, start, end);
			quickSort(arr, start, pIndexx-1);
			quickSort(arr, pIndexx+1, end);
		}
		
	}
	
	public static int partition(int[]array,int first,int last) {
		
		int pIndex= first;
		int pivot= array[last];
		
		for(int i=first; i<=last-1; i++) {
			if(array[i]<= pivot) {
				int temp= array[i];
				array[i]= array[pIndex];
				array[pIndex]= temp;
				
				pIndex++;
			}
		}
		array[last]= array[pIndex];
		array[pIndex]= pivot;
		
		return pIndex;
		
	}
	public static void main(String[] args) {
		int[] array= {7,2,1,6,8,5,3,4};
		 quickSort(array, 0, array.length-1);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		int k=1;
		int length= array.length;
		System.out.println("Kth largest"+ array[length-k-1]);
			
	

	}

}
