package array;

import java.util.ArrayList;
import java.util.List;

public class FindDisappeared {

	 public List<Integer> findDisappearedNumbers(int[] nums) {
		 int n= nums.length;
		 boolean presence= false;
		 List<Integer> asList= new ArrayList<Integer>();
		 for(int i=0; i<n; i++) {
			 for(int j=0;j<n;j++) {
				 if(i+1 == nums[j]) {
					 presence=true;
				 }					 				
			 }
			 if(presence==false) {
				 asList.add(i+1);
			 }
			 presence=false;
			 
		 }
		
		return asList;
		 
	        
	    }
	public static void main(String[] args) {
		FindDisappeared obj= new FindDisappeared();
	
		obj.findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1});

		}	

}
		
