package array;
import org.apache.commons.lang.ArrayUtils;

public class RemoveDupElements {

	 public static int removeDuplicates(int[] nums) {
	        for(int i=0; i<nums.length; i++){
	            for(int j=i; j<nums.length; j++){
	                if(nums[i]== nums[j]){
	                	nums = ArrayUtils.remove(nums, 2);
	                	System.out.println(nums);
	                }
	            }
	        }
			return 0;
	    }
	    
	    
	    public static void main(String[] args) {
			
	    	RemoveDupElements remove= new RemoveDupElements();
	    	RemoveDupElements.removeDuplicates(new int[] {0,0,1});
			

		}
	    
	    
	}


