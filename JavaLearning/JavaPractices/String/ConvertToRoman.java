package String;

import org.apache.poi.hssf.record.ContinueRecord;

public class ConvertToRoman {

	public static String conversion(int num) {
		String roman="";
		int pop = 0 ;
		int i=0;
		
		while(num!=0)
			i+=1;
			pop= (num%10);
			if(pop==4)
				roman=roman+"IV";
				continue;
			if(pop==9)
				roman=roman+"IX";
				continue;
			if(pop==40)
				roman=roman+"XL";
				continue;
			if(pop==90)
				 roman=roman+"XC";
					continue;
			if(pop==400)
				roman=roman+"CD";
			continue;
			if(pop==900)
				 
			continue;
			
			if(num>=1 && num<=5){
				int diff= 5-num;
				if(diff==0)
					
				for(int i=0;i<=diff;i++) {
					roman+="I";
				}
				
			}
		
		
		return roman;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
