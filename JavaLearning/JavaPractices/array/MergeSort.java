package array;

public class MergeSort {
	int nums[];
	int end ,start;
	 static int mid;
	public static int[] sortArray(int[] nums) {
		int start=0;
		int end= nums.length-1;
		recursion(nums,start, end);
		return nums;
		
	}
	private static void recursion (int[] nums,int start, int end) {
		if(start <end) {
			mid= (start+end) /2;
			System.out.println("Left: start,mid: "+start+mid);
			recursion(nums,start,mid );			
			System.out.println("Right: mid, end: "+(mid+1)+end);
			recursion(nums,mid+1,end );
			
			merge(nums,start,mid,end);
		}
		
	}
	

	private static void merge(int[] Arr, int start2, int mid2, int end2) {
		
			// create a temp array
			int temp[] = new int[end2 - start2 + 1];

			// crawlers for both intervals and for temp
			int i = start2, j = mid2+1, k = 0;

			// traverse both arrays and in each iteration add smaller of both elements in temp 
			while(i <= mid2 && j <= end2) {
				if(Arr[i] <= Arr[j]) {
					temp[k] = Arr[i];
					k += 1; i += 1;
				}
				else {
					temp[k] = Arr[j];
					k += 1; j += 1;
				}
			}

			// add elements left in the first interval 
			while(i <= mid2) {
				temp[k] = Arr[i];
				k += 1; i += 1;
			}

			// add elements left in the second interval 
			while(j <= end2) {
				temp[k] = Arr[j];
				k += 1; j += 1;
			}

			// copy temp to original interval
			for(i = start2; i <= end2; i += 1) {
				Arr[i] = temp[i - start2];
			}
		}
		
	
	public static void main(String[] args) {
		sortArray(new int[] {5,2,3,1});
	}

}
