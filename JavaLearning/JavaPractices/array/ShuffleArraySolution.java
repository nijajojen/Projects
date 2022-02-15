package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuffleArraySolution {

	
	    private int[] array;
	    private int[] original;

	    private Random rand = new Random();

	    private List<Integer> getArrayCopy() {
	        List<Integer> asList = new ArrayList<Integer>();
	        for (int i = 0; i < array.length; i++) {
	            asList.add(array[i]);
	        }
	        return asList;
	    }

	    public ShuffleArraySolution(int[] nums) {
	        array = nums;
	        original = nums.clone();
	    }
	    
	    public int[] reset() {
	        array = original;
	        original = original.clone();
	        return array;
	    }
	    
	    public int[] shuffle() {
	        List<Integer> aux = getArrayCopy();

	        for (int i = 0; i < array.length; i++) {
	            int removeIdx = rand.nextInt(aux.size());
	            array[i] = aux.get(removeIdx);
	            aux.remove(removeIdx);
	        }

	        return array;
	    }
	
	public static void main(String[] args) {
		int[] nums=  new int[] {6,5,1,10};
		ShuffleArraySolution obj = new ShuffleArraySolution(nums);
		//System.out.println(obj.length);
		 int[] param_1 = obj.reset();
		 int[] param_2 = obj.shuffle();

	}

}
