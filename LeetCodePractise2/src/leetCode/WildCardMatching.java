package leetCode;

public class WildCardMatching {

	static int pIndex=0;
	static int strIndex=0;
	 public static boolean isMatch(String s, String pattern) {
		 boolean QstnFlag = false;
		 for( pIndex=0;pIndex<=pattern.length()-1;pIndex++) {
			 //added
			 if(strIndex==s.length()) {
				 return false;
			 }
			 if(pattern.length()==1 && pattern.charAt(0)=='*')
				 return true;
			 
			 if(pattern.length()==1 && s.length()==1 && pattern.charAt(0)=='?')
					return true;
			 
			if(pattern.charAt(pIndex)=='*') {
				boolean flag=checkForSequence(s,pattern);
				if(flag==false)
					return false;
				if(flag==true&& strIndex==s.length()-1 && pIndex==pattern.length()-1)
					return true;
			}
			
			else if(pattern.charAt(pIndex)=='?') {
				 QstnFlag=checkForASingleChar(s,pattern);
				 if(QstnFlag==true &&(pattern.length()==s.length()))
					 return true;
			}
			
			else if(pattern.charAt(pIndex)==s.charAt(strIndex)) {
				
				//pIndex++;
				strIndex++;
			}
			else {
				return false;
			}
			
		 }
		 
		 if(QstnFlag == true)
			 return true;
		 
		 if(strIndex<=(s.length()-1) && pIndex>(pattern.length()-1))
			 return false;
			 
		 
		return true;
	        
	    }
	 
	
	private static boolean checkForASingleChar( String s,String pattern) {
		char target=' ';
		if(pIndex+1 <=pattern.length()-1)
		{	target=pattern.charAt(pIndex+1);
			pIndex=pIndex+1;
		}
		else
			return true;
		
		
		if(s.charAt(strIndex)== ' ')
			return false;
		
		if(s.charAt(strIndex+1)==target)
			return true;
		else
			return false;
			
			
		
	}


	private static boolean checkForSequence( String s,String pattern) {
		char target=' ';
		
		if(pattern.length()==1)
			return true;
		//added for p="a*"
		 	if(pIndex+1<pattern.length()) {
			target=pattern.charAt(pIndex+1);
			pIndex=pIndex+1;
			}
		 	else {
		 		return true;
		 	}
			if((target!='*'||target!='?')&& pIndex==pattern.length()-1) {
				if(s.charAt(s.length()-1)!=target) 
					return false;
			 }
	
				while(strIndex<s.length()) {
					if(s.charAt(strIndex)==target)
						{strIndex+=1;
						return true;
						}
					strIndex+=1;
				}
		 		 
				
				return false;
	}


	public static void main(String[] args) {
		
		/*1.checking for ba ,baaaab, baaaaaaab, *bb
		 * 
		 *2.checked ab-string, *b-pattern, so target is b,
		 * so checking for b,
		 * if b then exit return true.
		
		 *3 s="aa" p="a", p="a*" not working
		 *added line 60 now its working
		 *
		 *
		 *4 s=aa p=a*aa was not working
		 * added line 11 then working
		 */
		System.out.println(isMatch("aa","*" ));
		
		

	}

}
