package array;

public class TimetoBuyandSellStock {

	public static int maxProfit(int[] prices) {
		
		int minlength= Integer.MAX_VALUE;
		int maxprofit=0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<minlength)
				minlength=prices[i];
			else if(prices[i]-minlength> maxprofit)
				maxprofit=prices[i]-minlength;
		}
		return maxprofit;
		
	        
	    }
	public static void main(String[] args) {
		maxProfit(new int[] {2,4,1});

	}

}
